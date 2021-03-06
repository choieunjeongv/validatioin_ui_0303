package com.javaeunjeong.ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControl
 */
@WebServlet("*.do")//확장자 패턴으로 맵핑 -> 모든 클라이언트 요청이 FronControl 서블릿으로 집중하게 함
public class FrontControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
//		System.out.println("doget Act!!!");
	
		String uri = request.getRequestURI();//uri 가져오기
//		System.out.println("uri:" + uri);
		String conPath = request.getContextPath();//상대경로(루트) 가져오기
//		System.out.println("context path:" + conPath);
		String command = uri.substring(conPath.length());
		
		if(command.equals("/france.do")) {
			System.out.println("france.do로 들어왔음!!");
		}else if (command.equals("/korea.do")) {
			System.out.println("korea.do로 들어왔음!!");
		}else if (command.equals("/japan.do")) {
			System.out.println("japan.do로 들어왔음!!");
		}else if (command.equals("/usa.do")) {
			System.out.println("usa.do로 들어왔음!!");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost Act!!!");
		doGet(request, response);
	}

}

package sample05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override	//내장객체 생성안하고 바로 사용가능
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getParameter("url");
		System.out.println("url:"+url);
		
		//java
		//sendRedirect
		
		/*
		 * if(url.equals("naver.com")) { resp.sendRedirect("http://naver.com");
		 * //java에서의 html anchor와 같은 방식이다 } else if(url.equals("google.com")) {
		 * resp.sendRedirect("http://google.com"); }
		 */
		
		//setHeader
		
		resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY); //setHeader에서는 이 문장을 추가해주어야 한다.
		
		if(url.equals("naver.com")) {
			resp.setHeader("Location", "http://naver.com");
		}else if(url.equals("google.com")) {
			resp.setHeader("Location", "http://google.com");
			
		}
	}

}

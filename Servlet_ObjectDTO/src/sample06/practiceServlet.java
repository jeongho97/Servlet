package sample06;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class practiceServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		System.out.println("이름:"+name);
		
		int age=Integer.parseInt(req.getParameter("age"));
		System.out.println("나이:"+age);
		
		
		 String fruits[]=req.getParameterValues("fruits");
		 
		 for(String s:fruits) {
			 System.out.println("좋아하는 과일:"+s);
		 }
		 
			/* resp.sendRedirect("world"); //단순이동*/
		 
		 //데이터 모으기
		 ObjectDto dto = new ObjectDto(name,age,fruits); 
		 
		 //짐싸기
		 req.setAttribute("myfruits", dto);
		 
		 //req.getSession().setAttribute(name, dto);
		 
		 //world로 짐들고 이동
		 RequestDispatcher rd = req.getRequestDispatcher("world");
			/*
			 * resp.sendRedirect("world?name="+name);//이렇게 하나의 데이터는 sendRedirect로 보낼 수 있다.
			 */		 
		 rd.forward(req, resp);
		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}

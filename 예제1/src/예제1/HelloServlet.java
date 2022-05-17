package 예제1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		System.out.println("이름:"+name);
		
		String age=req.getParameter("age");
		System.out.println("나이:"+age);
		
		String hobby=req.getParameter("hobby");
		System.out.println("취미:"+hobby);
		
		String date=req.getParameter("date");
		System.out.println("생일:"+date);
		
		String money=req.getParameter("money");
		System.out.println("연봉:"+money);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}

package servlets;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServlet.*;
import jakarta.servlet.annotation.*;
import java.io.*;
@WebServlet("/login")
public class servlet1 extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException {
		res.setContentType("text/html");
	String name = req.getParameter("userName");
	String password = req.getParameter("password");
	
	
	HttpSession obj = req.getSession();
	obj.setAttribute("name",name);
	obj.setAttribute("pass", password);
	
	PrintWriter wr = res.getWriter();
	
	wr.print("data has been transferd");
	
	res.sendRedirect("fileUpload.html");
	
	}
}

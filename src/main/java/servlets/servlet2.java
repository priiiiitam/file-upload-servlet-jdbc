package servlets;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import java.io.*;
import service.dataProcess;
import service.saveFile;
@MultipartConfig
@WebServlet("/fileUplod")
public class servlet2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter wr = res.getWriter();
		
		HttpSession s = req.getSession();
		String name = (String)s.getAttribute("name");
		String pass = (String)s.getAttribute("pass");
		Part filePart = req.getPart("file");
		String fileName = filePart.getSubmittedFileName();
		
		InputStream fileStream = filePart.getInputStream();
		
		try {
			dataProcess obj = new dataProcess();
			obj.process(name,pass,fileStream,fileName);
			wr.println("the data get stored sucessfully");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

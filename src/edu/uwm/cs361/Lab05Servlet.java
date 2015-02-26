package edu.uwm.cs361;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Lab05Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String firstName=req.getParameter("firstname");
		String lastName=req.getParameter("lastname");
		String emailName=req.getParameter("email");
		
		
		resp.setContentType("text/plain");
		resp.getWriter().println("This is my firstname: "+firstName);
		resp.getWriter().println("This is my LastName : "+lastName);
		resp.getWriter().println("This is my Email : "+emailName);
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	}
}

package com.servletlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("username");
		String password1 = req.getParameter("password");
		String emailId = req.getParameter("emailId");
		String course = req.getParameter("course");
		String gender = req.getParameter("user_gender");
		
		
		out.println("<h2> username : "+ username);
		out.println("<h2> password : "+ password1);
		out.println("<h2> Email Id : "+ emailId);
		out.println("<h2> Course : "+ course);
		out.println("<h2> User_Gender : "+ gender);
		
        
	}

}

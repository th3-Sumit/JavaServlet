package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h2>Successfully Registered : .....</h2>");
		out.println("Welcome to Home page .....");
		
	}
}

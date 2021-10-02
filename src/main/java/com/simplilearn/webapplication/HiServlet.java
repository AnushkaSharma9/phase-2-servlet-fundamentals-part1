package com.simplilearn.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HiServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		// request processing
		//set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		out.print("<html><body>");
		out.print("<h1>Hello, welcome to Generic servlet response !</h1>");
		out.print("</body></html>");
		System.out.println(" Servlet requset processing is completed");
	}

}

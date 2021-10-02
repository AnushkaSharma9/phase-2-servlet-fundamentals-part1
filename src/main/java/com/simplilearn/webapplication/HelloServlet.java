package com.simplilearn.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {

	ServletConfig config =null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println(" Servlet is Initialized");
		
	}
	
	//hello
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// request processing
		//set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		out.print("<html><body>");
		out.print("<h1>Hello, welcome to servlet program !</h1>");
		out.print("</body></html>");
		System.out.println(" Servlet requset processing is completed");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is a servlet interface implemented class";
	}

	

}

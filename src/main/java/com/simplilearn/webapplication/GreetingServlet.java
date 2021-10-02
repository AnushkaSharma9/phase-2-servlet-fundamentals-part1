package com.simplilearn.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
	//no need to write servlet related methods
	//requst processing has to be added
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

		// request processing
		//set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		out.print("<html><body>");
		out.print("<h1>Greetings , welcome to Http servlet response !</h1>");
		out.print("</body></html>");
		System.out.println(" Servlet requset processing is completed");
	}
	
}

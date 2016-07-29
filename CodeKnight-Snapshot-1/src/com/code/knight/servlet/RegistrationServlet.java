package com.code.knight.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		 
		String userName = request.getParameter("Username");
		String userPwd_1 = request.getParameter("Password_1");
		String userPwd_2 = request.getParameter("Password_2");
		
		if(userPwd_1.equals(userPwd_2)){
			pw.println("<h1>Welcome [ "+userName+" ] You have been registred successfully.</h1>");
		}else{
			pw.println("Different Password"+getIndexPage());
		}
			

	}
	
	private String getIndexPage(){
		String hd="<form action=./index.html>"
		+"<br><input type=submit value=Back>"
		+"</form>";
		return hd;
	}

}

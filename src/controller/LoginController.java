package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 

throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		model.Credential loginCredential=new model.Credential();
		loginCredential.setUsername(username);
		loginCredential.setPassword(password);
		if(loginCredential.checkLogin())
		{
			request.setAttribute("username",username);
			RequestDispatcher dispatch=request.getRequestDispatcher("Success.jsp");
			dispatch.forward(request,response);
		}
		else
		{	request.setAttribute("errorInfo","Username and Password does not match");
			RequestDispatcher dispatch=request.getRequestDispatcher("index.jsp");
			dispatch.forward(request,response);
		}
	}

}
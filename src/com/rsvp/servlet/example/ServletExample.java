package com.rsvp.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AuthDAO authDAO= new AuthDAO(); 

	public ServletExample() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		user.setAuthPwd(request.getParameter("pwd"));
		user.setUserName(request.getParameter("uname"));

		authDAO.authCheck(user);

		PrintWriter out = response.getWriter();
		out.println(request.getParameter("uname") + " logged in");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

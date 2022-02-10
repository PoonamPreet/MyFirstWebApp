package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySerlett
 */
public class MySerlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MySerlett() {
        // TODO Auto-generated constructor stub
    	super();
    }
/**
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.print("<h1>Service method</h1> ");
	}*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String obj=request.getParameter("fname");
		PrintWriter out=response.getWriter();
		out.print("<h1>Get method</h1>");
		out.print("<br/>Hello"+obj);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String obj=request.getParameter("fname");
		PrintWriter out=response.getWriter();
		out.print("<h1>Post method</h1>");
		out.print("<br/>Hello"+obj);

}

}

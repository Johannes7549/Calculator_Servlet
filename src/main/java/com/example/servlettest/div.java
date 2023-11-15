package com.example.servlettest;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "div", value = "/div")
public class div extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        double n1 = Integer.parseInt(request.getParameter("num1"));
        double n2 = Integer.parseInt(request.getParameter("num2"));
        double div = n1 / n2;
        PrintWriter out = response.getWriter();
        out.println("<html><link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\"><body>");
        out.println("<h1> The division of the numbers is "+div+"</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }



}

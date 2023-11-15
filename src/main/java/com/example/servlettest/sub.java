package com.example.servlettest;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sub", value = "/sub")
public class sub extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int n1 = Integer.parseInt(request.getParameter("num1"));
        int n2 = Integer.parseInt(request.getParameter("num2"));
        int dif = n1 - n2;
        PrintWriter out = response.getWriter();
        out.println("<html><link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\"><body>");
        out.println("<h1> The difference of the numbers is "+dif+"</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }



}

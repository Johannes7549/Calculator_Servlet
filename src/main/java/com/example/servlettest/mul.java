package com.example.servlettest;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "mul", value = "/mul")
public class mul extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int n1 = Integer.parseInt(request.getParameter("num1"));
        int n2 = Integer.parseInt(request.getParameter("num2"));
        int mul = n1 * n2;
        PrintWriter out = response.getWriter();
        out.println("<html><link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\"><body>");
        out.println("<h1> The multiplication of the numbers is "+mul+"</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }



}

package com.example.servlettest;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "dispatcher", value = "/dispatcher")
public class Dispatcher extends HttpServlet {
    public void  doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException, ServletException {
        String method = req.getMethod();
        if (method.equals("get") || method.equals("GET")){
            String op = req.getParameter("op");
            switch (op) {
                case "sum": {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("sum");
                    dispatcher.forward(req, res);
                    break;
                }
                case "mul": {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("mul");
                    dispatcher.forward(req, res);
                    break;
                }
                case "sub": {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("sub");
                    dispatcher.forward(req, res);
                    break;
                }
                case "div": {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("div");
                    dispatcher.forward(req, res);
                    break;
                }
            }
        }
    }
}

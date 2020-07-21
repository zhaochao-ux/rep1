package com.ithema.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        System.out.println("HttpServlet的doget方法");
        this.doPost(req,resp);
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        System.out.println("HttpServlet的doPost方法");
    }
}

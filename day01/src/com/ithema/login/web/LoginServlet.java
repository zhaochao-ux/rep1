package com.ithema.login.web;

import com.ithema.login.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username + "    "+ password);

            if (username == null || "".equals(username.trim()) || password == null || "".equals(password.trim())){
                response.getWriter().println("login fail.....");
                return;
            }
            LoginService log = new LoginService();
            boolean login = log.login(username, password);

            if(login){
                // 登录成功
                response.getWriter().println("Login Success...");
            }else{
                // 登录失败
                response.getWriter().println("Login Fail...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}

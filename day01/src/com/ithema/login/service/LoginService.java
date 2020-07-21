package com.ithema.login.service;

import com.ithema.login.dao.LoginDao;

import java.sql.SQLException;

public class LoginService {
    public Boolean login(String username, String password) throws Exception {
        LoginDao loginDao = new LoginDao();

        return loginDao.login(username,password);
    }
}

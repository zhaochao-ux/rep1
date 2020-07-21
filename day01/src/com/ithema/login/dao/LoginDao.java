package com.ithema.login.dao;

import com.ithema.login.utils.C3P0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {

   public Boolean login(String username, String password) throws Exception {
        //1. 注册驱动
        //2. 创建连接
        Connection connection = C3P0Utils.getConnection();
        //3. 通过连接创建语句执行平台

        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //4. 执行SQL 获取结果集
        ps.setString(1,username);
        ps.setString(2,password);
        //5. 处理结果集
        ResultSet resultSet = ps.executeQuery();
        boolean flag = resultSet.next();

        //6. 释放资源
        C3P0Utils.close(resultSet,ps,connection);

        return flag;
    }
}

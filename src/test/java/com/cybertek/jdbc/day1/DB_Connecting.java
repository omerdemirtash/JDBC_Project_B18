package com.cybertek.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connecting {

    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@3.87.120.192:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection  conn = DriverManager.getConnection(connectionStr,username,password);
        System.out.println("the end");

    }



}

package com.example.springboot.core.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@ToString
public class JDBCConnectinSubManager {
    private String driverClass;
    private String url;
    private String username;
    private String password;

    public Connection getConnection() {
        try {
            Class.forName(driverClass);
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

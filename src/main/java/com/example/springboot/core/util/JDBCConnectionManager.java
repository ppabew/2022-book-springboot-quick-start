package com.example.springboot.core.util;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@ToString
public class JDBCConnectionManager {
    @Value("${spring.datasource.driver-class-name}")
    String driverClassName;

    @Value("${spring.datasource.url}")
    String url;

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Bean
    public JDBCConnectionManager getJDBCConnectionManager() {
        JDBCConnectionManager manager = new JDBCConnectionManager();
        manager.setDriverClassName(driverClassName);
        manager.setUrl(url);
        manager.setUsername(username);
        manager.setPassword(password);
        return manager;
    }
}

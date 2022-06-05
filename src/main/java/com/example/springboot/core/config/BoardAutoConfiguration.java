package com.example.springboot.core.config;

import com.example.springboot.core.util.JDBCConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JDBCConnectionManagerProperties.class)
public class BoardAutoConfiguration {
    @Value("${spring.datasource.driver-class-name}")
    String driverClassName;

    @Value("${spring.datasource.url}")
    String url;

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Autowired
    private JDBCConnectionManagerProperties properties;

    @Bean
    public JDBCConnectionManager getJDBCConnectionManager() {
        JDBCConnectionManager manager = new JDBCConnectionManager();
        manager.setDriverClassName(properties.getDriverClassName());
        manager.setUrl(properties.getUrl());
        manager.setUsername(properties.getUsername());
        manager.setPassword(properties.getPassword());
        return manager;
    }

}

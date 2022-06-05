package com.example.springboot.core.runner;

import com.example.springboot.core.util.JDBCConnectinSubManager;
import com.example.springboot.core.util.JDBCConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class JDBCConnectionManagerRunner implements ApplicationRunner {

    // BoardAutoConfiguration에 있는 Bean(getJDBCConnectionManager)이 주입됨
    @Autowired
    private JDBCConnectionManager jdbcConnectionManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("커넥션 매니저 : " + jdbcConnectionManager);
    }
}

package com.zhiyun.shiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShiroApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ShiroApplication.class, args);
        String serverport = run.getEnvironment().getProperty("server.port");
        String serverName = run.getEnvironment().getProperty("server.servlet.context-path");
        System.err.println("项目启动于: http://localhost:" + serverport + serverName);
    }

}

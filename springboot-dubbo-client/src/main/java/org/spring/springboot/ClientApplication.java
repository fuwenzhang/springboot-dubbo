package org.spring.springboot;


import org.spring.springboot.dubbo.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring Boot 应用启动类
 *
 * Created by wenzhang.fu on 01/03/2019.
 */
// Spring Boot 应用的标识
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class })
public class ClientApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        UserController cityService = run.getBean(UserController.class);
        cityService.printCity();
    }

   /* public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ClientApplication.class,args);
    }*/
}

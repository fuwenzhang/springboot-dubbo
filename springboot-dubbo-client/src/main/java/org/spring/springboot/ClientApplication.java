package org.spring.springboot;


import org.spring.springboot.dubbo.ClientController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.servlet.http.HttpServletResponse;

/**
 * Spring Boot 应用启动类
 * <p>
 * Created by wenzhang.fu on 01/03/2019.
 */
// Spring Boot 应用的标识
@SpringBootApplication()
public class ClientApplication {

    /* public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
       ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        ClientController cityService = run.getBean(ClientController.class);
        cityService.client(null,"1");
    }
*/
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ClientApplication.class, args);
    }
}

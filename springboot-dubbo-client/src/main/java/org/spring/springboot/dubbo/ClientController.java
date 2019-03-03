package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 城市 Dubbo 服务消费者
 * <p>
 * Created by wenzhang.fu on 01/03/2019.
 */
@RestController
public class ClientController {

    @Reference(version = "1.0.0")
    DubboService dubboService;

    @RequestMapping(value = "/client/{request}")
    public String client(HttpServletResponse response,@PathVariable String request) {
        response.setHeader("Access-Control-Allow-Origin","*");
        return "server response:" + dubboService.serverByRequest(request);
    }
}

package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Dubbo 服务层实现层
 * <p>
 * Created by wenzhang.fu on 01/03/2019.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0", timeout = 3000)
public class DubboServiceImpl implements DubboService {

    int i = 0;

    public String serverByRequest(String request) {
        return "client request：" + request + " 服务端被 调用的次数：" + i++;
    }
}

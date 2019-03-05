package com.springboot.dubbo;

/**
 * Dubbo 服务层
 *
 * Created by wenzhang.fu on 01/03/2019.
 */
public interface DubboService {

    /**
     * @param request
     */
    String serverByRequest(String request);
}

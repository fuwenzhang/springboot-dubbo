package org.spring.springboot.dubbo;

/**
 * 客户端
 *
 * Created by wenzhang.fu on 01/03/2019.
 */
public interface DubboService {

    /**
     * @param request
     */
    String serverByRequest(String request);
}

package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 城市 Dubbo 服务消费者
 *
 * Created by wenzhang.fu on 01/03/2019.
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    @RequestMapping(value = "/")
    public String printCity() {
        String cityName="南通";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
        return city.toString();
    }
}

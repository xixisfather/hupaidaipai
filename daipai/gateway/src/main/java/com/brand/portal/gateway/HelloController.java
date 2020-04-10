package com.brand.portal.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取git中分布式配置的接口
 *
 * @author : Five-云析学院
 * @since : 2019年04月19日 21:32
 */

@RestController
public class HelloController {

    @GetMapping("/test")
    public String getName(){
        return "test";
    }
}

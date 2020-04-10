package com.brand.portal.mybatisconfig;

import com.brand.portal.mybatisconfig.mapper.UserTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${spring.datasource.driver-class-name}")
    private String url;

    @Autowired
    private UserTestMapper userTestMapper;

    @GetMapping("/getName")
    public String getName(){

        System.out.println(userTestMapper.selectByPrimaryKey(1));

        return url;
    }
}

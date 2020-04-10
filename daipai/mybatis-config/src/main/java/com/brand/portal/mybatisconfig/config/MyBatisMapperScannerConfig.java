//package com.brand.portal.mybatisconfig.config;
//
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
///**
// * @description: MyBatisMapperScannerConfig
// * @author: chenchunrong
// * @time: 2020-04-08 21:30
// */
//@Configuration
//@AutoConfigureAfter(MyBatisConfig.class)
//public class MyBatisMapperScannerConfig {
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        //获取之前注入的beanName为sqlSessionFactory的对象
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        //指定xml配置文件的路径
//        mapperScannerConfigurer.setBasePackage("com.brand.portal.mybatisconfig.mapper");
//        return mapperScannerConfigurer;
//    }
//}

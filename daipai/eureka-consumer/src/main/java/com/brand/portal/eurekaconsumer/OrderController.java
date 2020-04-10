package com.brand.portal.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO..
 *
 * @author : Five-云析学院
 * @since : 2019年04月24日 21:18
 */

@RestController
public class OrderController {

    @Value("${server.port}")
    String port;

    private static final List<OrderInfo> list = new ArrayList<OrderInfo>();

    @Autowired
    private RestTemplate restTemplate;

    /***
     * 下单接口 --  调用服务提供者provider /updateProduct 接口
     * @param productName
     * @param num
     * @return
     */
    @GetMapping("/order")
    public String order(String productName, Integer num){

        System.out.println("服务器端口：" + port);

        if(productName != null && !productName.isEmpty()){

            list.add(new OrderInfo(productName, num));
            // 调用服务提供者
            String result = restTemplate.getForObject("http://eureka-provider/updateProduct?productName=" + productName + "&num=" + num, String.class);
            return result;
        }
        return null;
    }
}

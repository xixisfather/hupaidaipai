package com.brand.portal.eurekaprovider;

import com.brand.portal.mybatisconfig.mapper.UserTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO..
 *
 * @author : Five-云析学院
 * @since : 2019年04月24日 21:13
 */
@RestController
public class ProductController {

    // 定义一个库存集合
    private static final Map<String, Integer> productMap = new HashMap<String, Integer>();

    @Value("${server.port}")
    String port;

    @Autowired
    private UserTestMapper userTestMapper;
    /***
     * 修改库存
     * @param productName
     * @param num
     * @return
     */
    @GetMapping("/updateProduct")
    public String updateProducter(String productName, Integer num){
        userTestMapper.selectByPrimaryKey(1);
        System.out.println("服务器端口：" + port);
        if(productName != null && !productName.isEmpty()){
            productMap.put(productName, (productMap.get(productName) == null ? 0: productMap.get(productName))-num);
            System.out.println("修改库存：productName-"+productName+", num-"+num);
        }
        return "修改库存成功, "+productName+" 剩下 "+productMap.get(productName);
    }
}

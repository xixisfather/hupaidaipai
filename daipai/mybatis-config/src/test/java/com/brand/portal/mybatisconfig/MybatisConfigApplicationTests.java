package com.brand.portal.mybatisconfig;

import com.brand.portal.mybatisconfig.entity.UserTest;
import com.brand.portal.mybatisconfig.mapper.UserTestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisConfigApplicationTests {

   @Autowired
   private UserTestMapper userTestMapper;

   @Test
   public void testSelect() {
       UserTest u = userTestMapper.selectByPrimaryKey(1);
       System.out.println(u.getId() + " " + u.getUserName());
   }

}

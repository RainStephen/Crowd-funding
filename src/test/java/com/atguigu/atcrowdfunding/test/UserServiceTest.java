package com.atguigu.atcrowdfunding.test;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.manager.service.UserService;
import com.atguigu.atcrowdfunding.manager.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class UserServiceTest {

    //添加100条用户信息数据到数据库
    @Test
    public void test1(){

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring-context.xml");
        System.out.println("ioc = " + ioc);
        UserService userService = ioc.getBean(UserService.class);

        for (int i = 0; i <100 ; i++) {
            User user = new User();
            user.setId(100+i);
            user.setLoginacct("user"+i);
            user.setUsername("TEST"+i);
            user.setUserpswd("123");
            user.setCreatetime("2018-01-18 04:19");
            user.setEmail("test"+i+"@sina.com");
            userService.save(user);
        }





    }

}

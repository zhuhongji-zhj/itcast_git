package com.itheima;

import com.itheima.pojo.User;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = (AccountService)applicationContext.getBean("accountService");
        accountService.save();
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User)applicationContext.getBean("user");
        System.out.println(user);
    }
}

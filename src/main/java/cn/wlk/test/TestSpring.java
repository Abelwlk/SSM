package cn.wlk.test;

import cn.wlk.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test01(){
        //加载spring配置
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");

        accountService.findAll();

    }
}

package com.yp.test;

import com.yp.ioc_01.XxxDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {
    @Test
    public void test_05(){

        //创建ioc容器
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-01.xml");
        XxxDao bean1 = applicationContext.getBean(XxxDao.class);
        System.out.println("bean1="+bean1);
        Object bean = applicationContext.getBean("xxxService");
        System.out.println("bean="+bean);
        applicationContext.close();

    }
}

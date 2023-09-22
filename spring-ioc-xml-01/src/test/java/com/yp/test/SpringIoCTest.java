package com.yp.test;

import com.yp.ioc_03.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    public void createIoc(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("sping-03.xml");

/*        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocations("spring-03.xml");
        applicationContext.refresh();*/

    }

    @Test
    public void getBeanFromIoc(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocations("spring-03.xml");
        applicationContext.refresh();

        HappyComponent happyConponent = (HappyComponent) applicationContext.getBean("happyComponent");

        HappyComponent happyConponent1 = applicationContext.getBean("happyComponent", HappyComponent.class);

        HappyComponent bean = applicationContext.getBean(HappyComponent.class);
        bean.doWork();
        System.out.println(happyConponent==happyConponent1);
        System.out.println(bean==happyConponent);
    }
}

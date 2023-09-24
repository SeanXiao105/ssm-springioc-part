package com.yp.test;

import com.yp.ioc_03.HappyComponent;
import com.yp.ioc_04.JavaBean2;
import com.yp.ioc_05.JavaBean;
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
    @Test
    public void test_04(){

        //创建ioc容器
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-04.xml");
        JavaBean2 bean = applicationContext.getBean(JavaBean2.class);
        JavaBean2 bean1 = applicationContext.getBean(JavaBean2.class);
        System.out.println(bean==bean1);
        applicationContext.close();

    }
    @Test
    public void test_05(){

        //创建ioc容器
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-05.xml");
        JavaBean javaBean = applicationContext.getBean("javaBean", JavaBean.class);
        System.out.println("javaBean="+javaBean);
        Object bean = applicationContext.getBean("&javaBean");
        System.out.println("bean="+bean);
        applicationContext.close();

    }
}

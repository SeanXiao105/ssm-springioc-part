package com.yp.ioc_04;

public class JavaBean2 {
    /*
    * 必须是public void 无参 名字随意
    * */
    public void init(){
        System.out.println("JAVABEAN.INIT");
    }

    public void destroy(){
        System.out.println("JAVABEAN.DESTROY");
    }
}

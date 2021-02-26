package com.xiangxue.zhk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Parent implements InvocationHandler {

    private People people;

    public  Parent(People people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();

        // 这个method反射对象就是被代理对象中的方法
        method.invoke(people,null);

        after();
        return null;
    }

    private void before(){
        System.out.println("==============我是小明的父母，我们拿着小明的照片，帮助小明找对象");
    }

    private void after(){
        System.out.println("==============我是小明的父母，我们要帮助小明结婚，结婚完要帮小明带孩子");
    }
}

package com.xiangxue.zhk;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        People proxyInstance = (People)Proxy.newProxyInstance(App.class.getClassLoader(), new Class<?>[]{People.class}, new Parent(new Xiaoming()));

        proxyInstance.findMM();
    }
}

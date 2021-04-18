package com.cuiyp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    public static Calculator getProxy(final Calculator calculator){
        //获取类加载器
        ClassLoader loader = calculator.getClass().getClassLoader();
        //获取接口实现类
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        //创建 InvocationHandler对象，执行类对应实现方法
        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    result = method.invoke(calculator, args);
                } catch (Exception e) {
                } finally {
                }
                return result;
            }
        };
        Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
        return (Calculator) proxy;
    }
}
package com.geng.controller;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
//这是实现BeanPostProcessor的非常简单的例子，它在任何bean的初始化的之前和之后输入该bean的名称。
//        你可以在初始化bean的之前和之后实现更复杂的逻辑，因为你有两个访问内置bean对象的后置处理程序的方法。
public class InitHelloWorld implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}

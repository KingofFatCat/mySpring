package com.geng.controller;

import com.geng.dependence.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        <!-创建的案例>
//        最常被使用的 ApplicationContext 接口实现：
//        FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器 XML 文件的完整路径。
//        ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
//        WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
//        //2.从ioc容器中获取bean实例
//        HelloWord objA = (HelloWord) context.getBean("HelloWord");
//
//        objA.getMessage1();
//        objA.getMessage2();
//
//        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
//        objB.getMessage1();
//        objB.getMessage2();
//        objB.getMessage3();
//        System.out.println();
//        //关闭
//        ((ClassPathXmlApplicationContext)context).close();

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从ioc容器中获取bean实例
        TextEditor te = (TextEditor) context.getBean("TextEditor");
        te.setSpellcheck();
        ((ClassPathXmlApplicationContext)context).close();
    }
}

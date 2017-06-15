package com.zhenizhui.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		HelloWorld helloWorld = new HelloWorld(); // 第一步
		
		helloWorld.setName("zhenizhui"); // 第二步
		
		helloWorld.hello();
		*/
		
		// 使用Spring可以帮我们完成第一步和第二步
		
		// 1. 创建Spring的IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2.从IOC容器中获取 Beans 实例，hw是bean的id
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("hw");
		
		// 调用hello 方法
		helloWorld.hello();
		
		

	}

}

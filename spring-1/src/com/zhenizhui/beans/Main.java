package com.zhenizhui.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		HelloWorld helloWorld = new HelloWorld(); // ��һ��
		
		helloWorld.setName("zhenizhui"); // �ڶ���
		
		helloWorld.hello();
		*/
		
		// ʹ��Spring���԰�������ɵ�һ���͵ڶ���
		
		// 1. ����Spring��IOC��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2.��IOC�����л�ȡ Beans ʵ����hw��bean��id
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("hw");
		
		// ����hello ����
		helloWorld.hello();
		
		

	}

}

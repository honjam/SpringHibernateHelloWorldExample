package com.levin.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.levin.service.IMessageService;

/**
 * Hibernate Hello world!
 * 
 */
public class HibernateMain {

	public static void main(String[] args) {
		System.out.println("Maven + Srping + Hibernate + PostgreSQL Hello World! ");
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		IMessageService message = (IMessageService) context.getBean("messageService");
		message.insertMessage("1546", "Hello World");

	}

}
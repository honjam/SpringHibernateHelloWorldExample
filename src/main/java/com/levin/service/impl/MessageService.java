package com.levin.service.impl;

import org.hibernate.Session;

import com.levin.model.Message;
import com.levin.service.IMessageService;
import com.levin.util.HibernateUtil;

public class MessageService implements IMessageService {
	public Message message;

	public void setMessage(Message message) {
		this.message = message;
	}

	public void insertMessage(String code, String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		message.setMessageCode(code);
		message.setMessageName(name);

		session.save(message);
		session.getTransaction().commit();
	}
}

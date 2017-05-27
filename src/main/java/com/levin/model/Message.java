package com.levin.model;

/**
 * Model class for Message.java
 */
public class Message implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer messageId;
	private String messageCode;
	private String messageName;

	public Message() {
	}

	public Message(String messageCode, String messageName) {
		this.messageCode = messageCode;
		this.messageName = messageName;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
}

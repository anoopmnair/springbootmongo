package com.anp.mongo.mongosample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	private String id;
	private String name;
	private String group;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	

}

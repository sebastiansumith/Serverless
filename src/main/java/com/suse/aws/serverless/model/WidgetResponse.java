package com.suse.aws.serverless.model;

public class WidgetResponse {

	private String name; 
	private Integer id;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return "Widget with id = "+this.id+ " and name = "+this.name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

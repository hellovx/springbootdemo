package com.zh.entity.demo;

import java.io.Serializable;

public class Demo implements Serializable {
	
	
	private static final long serialVersionUID = -1161505186577104538L;
	
	private int id;
	private String name;
	private int age;
	private String addr;
	

	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Info [id=" + id + ", name=" + name + ", age=" + age + ", addr="
				+ addr + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}
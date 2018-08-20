package com.zh.service.demo;

import com.zh.entity.demo.Demo;

public interface DemoService {
	
	public Demo findById(Integer id) throws Exception;
	
	public Integer insertInfo(Demo info) throws Exception;

}

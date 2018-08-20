package com.zh.mapper.demo;

import com.zh.entity.demo.Demo;

public interface DemoMapper {
	public Demo findById(Integer id);
	public Integer insertInfo(Demo info);

}

package com.zh.service.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zh.entity.demo.Demo;
import com.zh.mapper.demo.DemoMapper;
import com.zh.service.demo.DemoService;

@Service("demoService")
@Transactional(rollbackFor=Exception.class)
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;
	
	
	@Override
	@Transactional(readOnly=true)
	public Demo findById(Integer id)throws Exception {
		// TODO Auto-generated method stub
		return demoMapper.findById(id);
	}

	//注意：方法的@Transactional会覆盖类上面声明的事务
	//Propagation.REQUIRED ：有事务就处于当前事务中，没事务就创建一个事务
	//isolation=Isolation.DEFAULT：事务数据库的默认隔离级别
	//spring boot 默认只回滚runtimeException异常，需要自定义Exception进行回滚
	//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false,rollbackFor=Exception.class)
	public Integer insertInfo(Demo info) throws Exception {
		// TODO Auto-generated method stub
		Integer num=demoMapper.insertInfo(info);
		if(true){
			throw new RuntimeException("故意的异常");
		}
		return num;
	}

}

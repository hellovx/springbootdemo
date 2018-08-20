package com.zh;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zh.entity.demo.Demo;
import com.zh.service.demo.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {
	
	Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DemoService demoService;
	
	@Autowired
	private DataSource datasource;
	
	
	@Test
	public void contextLoads() {
		System.out.println(datasource);
		log.info(datasource.toString());

	}
	
	
	@Test
	public void demoTest(){
		Demo demo=null;
		try {
			demo = demoService.findById(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(demo);
	}

}

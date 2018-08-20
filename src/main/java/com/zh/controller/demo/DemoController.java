package com.zh.controller.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zh.entity.demo.Demo;
import com.zh.service.demo.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DemoService demoService;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		Demo demo=null;
		try {
			demo = demoService.findById(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log.info(demo.toString());

		return "hello world--你好";
	}

	@RequestMapping("/insert")
	@ResponseBody
	public String insert(){
		
		Demo demo=new Demo();
		demo.setName("张三");
		demo.setAge(11);
		demo.setAddr("北京市昌平");
		Integer num=new Integer(0);
		try {
			num=demoService.insertInfo(demo);
			log.info(demo.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "更新结果数量："+num;
	}

}

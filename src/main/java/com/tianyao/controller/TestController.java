package com.tianyao.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {
	
	@RequestMapping("/")
	@ResponseBody
	public String  index(){
		return "hello，田耀";
	}
	
	@RequestMapping("/hello")
	public String  hello(){
		System.out.println("hello....");
		return "hello";
	}
	public static void main(String[] args) throws Exception {  
        SpringApplication.run(TestController.class, args);
    }  
}

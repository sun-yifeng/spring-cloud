package com.sunyf.spring.cloud.ch02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;

@RestController
public class HelloController {

	private final Logger logger = Logger.getLogger(getClass());

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index() {
		//List<InstanceInfo> list = client.getInstancesById("");
		logger.info("/hello,host:" + ", service_id:");
		return "Hello World";
	}

}
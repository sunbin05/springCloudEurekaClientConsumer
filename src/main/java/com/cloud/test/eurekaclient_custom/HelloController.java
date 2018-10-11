package com.cloud.test.eurekaclient_custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/test/{fallback}")
	public String hello(@PathVariable String fallback){
		String res = helloService.hi(fallback);
		return res;
	}
}

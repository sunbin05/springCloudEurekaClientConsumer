package com.cloud.test.eurekaclient_custom;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-hi")
public interface HelloService {

	@RequestMapping("/hi/{fallback}")
	public String hi(@PathVariable("fallback") String fallback);
	
}

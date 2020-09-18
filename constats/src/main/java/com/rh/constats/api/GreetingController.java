package com.rh.constats.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rh.constats.api.data.Greeting;

@RestController
public class GreetingController {
	
	@Value("#{environment.POD_NAME}")
	private String podName;
	
	@Value("#{environment.POD_NAMESPACE}")
	private String podNamespace;
	
	@Value("#{environment.POD_IP}")
	private String podIP;

	@GetMapping("/greeting")
	public Greeting greeting() {
		return new Greeting(podName, podNamespace, podIP);
	}
}

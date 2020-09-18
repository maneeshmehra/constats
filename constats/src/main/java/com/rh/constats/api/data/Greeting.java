package com.rh.constats.api.data;

public class Greeting {

	private String greeting = "Hello, World";
	private String podName;
	private String podNamespace;
	private String podIp;
	
	public Greeting(String podName, String podNamespace, String podIp) {
		this.podName = podName;
		this.podNamespace = podNamespace;
		this.podIp = podIp;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getPodName() {
		return podName;
	}
	public void setPodName(String podName) {
		this.podName = podName;
	}
	public String getPodNamespace() {
		return podNamespace;
	}
	public void setPodNamespace(String podNamespace) {
		this.podNamespace = podNamespace;
	}
	public String getPodIp() {
		return podIp;
	}
	public void setPodIp(String podIp) {
		this.podIp = podIp;
	}
	
	
}

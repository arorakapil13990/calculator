package com.example.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.calculator.service.Calculator;

@RestController
public class CalculatorController {

	@Autowired
	private Calculator calculator;
	
	@Autowired
	public RestTemplate restTemplate;
	
	@RequestMapping("/sum")
	public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b){
		return String.valueOf(calculator.sum(a, b));
	}
	
	@RequestMapping("/rest")
	public String restCall(){
		return restTemplate.getForObject(
				"https://gturnquist-quoters.cfapps.io/api/random", String.class);
	}
}

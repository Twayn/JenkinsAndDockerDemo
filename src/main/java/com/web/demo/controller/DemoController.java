package com.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.demo.service.Demo;

@RestController
public class DemoController {
	final Demo demo;

	@Autowired
	public DemoController(Demo demo) {
		this.demo = demo;
	}

	@GetMapping("/demo")
	public String index() {
		return demo.logic();
	}
}

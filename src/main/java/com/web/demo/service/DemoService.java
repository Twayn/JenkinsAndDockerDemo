package com.web.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements Demo {
	@Override
	public String logic() {
		return "Demo";
	}
}

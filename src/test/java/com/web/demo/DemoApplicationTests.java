package com.web.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.web.demo.controller.DemoController;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DemoController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
}

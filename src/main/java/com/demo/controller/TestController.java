package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.TestService;

@RestController
@RequestMapping("test/")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/test")
	String test() {
		return testService.test();
	}
}

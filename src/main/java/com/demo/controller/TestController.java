package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.TestService;

@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	private TestService testService;

	/**
	 * 不区分get post
	 * localhost/test
	 * @author jerome_s@qq.com
	 * @return
	 */
	@RequestMapping("")
	String test() {
		return testService.test();
	}
	
	/**
	 * Get请求
	 * localhost/test/test?name=jerome
	 * 
	 * @author jerome_s@qq.com
	 * @param name
	 *            名字(默认必填)
	 * @param age
	 *            年龄(非必填)
	 * @return
	 */
	@RequestMapping(value = "test", method = RequestMethod.GET)
	String testGet(@RequestParam("name") String name, @RequestParam(value = "age", required = false) String age) {
		return testService.test() + name;
	}
	
	/**
	 * Post请求
	 * 
	 * @author jerome_s@qq.com
	 * @return
	 */
	@RequestMapping(value = "test", method = RequestMethod.POST)
	String testPost() {
		return testService.test();
	}
	
	/**
	 * Restful请求
	 * localhost/test/test/jerome
	 * 
	 * @author jerome_s@qq.com
	 * @param name
	 *            名字(默认必填)
	 * @param age
	 *            年龄(非必填)
	 * @return
	 */
	@RequestMapping("test/{name}")
	String testRestful(@PathVariable String name) {
		return testService.test() + name;
	}
	
}

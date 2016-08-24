package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.base.BaseService;

@Service()
// @Transactional
public class TestService extends BaseService{

	public String test() {
		return "TestService.test()";
	}
}

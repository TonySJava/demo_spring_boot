package com.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Spring boot启用类
 * 
 * @author jerome_s@qq.com
 */
@SpringBootApplication
public class ApplicationController extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationController.class, args);
	}

	/**
	 * 设置端口号
	 */
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		// TODO 端口号可以配置到配置文件?
		container.setPort(80);
	}
}

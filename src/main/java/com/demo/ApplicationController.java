package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring boot启用类
 * Bean装配默认规则是根据Application类所在的包位置从上往下扫描
 * 
 * @author jerome_s@qq.com
 */
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class ApplicationController {

	public static void main(String[] args) {
		// 启动Spring Boot项目的唯一入口
		SpringApplication.run(ApplicationController.class, args);
	}

}

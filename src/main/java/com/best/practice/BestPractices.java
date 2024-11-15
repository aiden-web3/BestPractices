package com.best.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication // 启动SpringBoot程序，而后自带子包扫描
@EnableScheduling
public class BestPractices extends SpringBootServletInitializer { // 必须继承指定的父类
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(BestPractices.class) ;
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BestPractices.class, args);
	}
}

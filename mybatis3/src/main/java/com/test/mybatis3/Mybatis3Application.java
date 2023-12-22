package com.test.mybatis3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//패키지 스캔 작업 > 메인 클래스

@SpringBootApplication
//@ComponentScan(basePackages = "com.test.controller")
@MapperScan(basePackages = "com.test.mybatis3.mapper")
public class Mybatis3Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybatis3Application.class, args);
	}

}

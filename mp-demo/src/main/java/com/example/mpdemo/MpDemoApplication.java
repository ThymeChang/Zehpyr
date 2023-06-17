package com.example.mpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com/example/mpdemo/mapper")
public class MpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpDemoApplication.class, args);
	}

}

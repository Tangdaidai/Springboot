package com.example.demo0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties(TestConfigBean.class)
public class Demo0Application {
	@Autowired
	private TestConfigBean testConfigBean;

	@RequestMapping
	String index() {
		return testConfigBean.getName()+"——"+testConfigBean.getAge();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo0Application.class, args);
	}

}

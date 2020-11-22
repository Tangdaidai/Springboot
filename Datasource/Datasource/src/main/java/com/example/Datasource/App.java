package com.example.Datasource;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        DataSource dataSource = context.getBean(DataSource.class);

        System.out.println(dataSource.getClass());
    }
}

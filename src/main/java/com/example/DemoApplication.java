package com.example;

import com.dangdang.ddframe.job.example.EmbedZookeeperServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.dangdang.ddframe.job.example.fixture.repository", "com.example"})
public class DemoApplication {

	public static void main(String[] args) {
//		EmbedZookeeperServer.start(2181);
		SpringApplication.run(DemoApplication.class, args);
	}
}

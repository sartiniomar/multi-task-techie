package com.paygoal.techiemultitask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureMockRestServiceServer
public class TechieMultiTaskApplicationTest {
	public static void main(String[] args) {
		SpringApplication.run(TechieMultiTaskApplicationTest.class, args);
	}
}

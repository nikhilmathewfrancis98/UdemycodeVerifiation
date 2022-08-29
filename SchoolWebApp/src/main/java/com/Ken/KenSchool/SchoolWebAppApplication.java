package com.Ken.KenSchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// This spring-boot-starter-web has embedded TomCat where as servlet tuto in eclipse we downloaded the Tomcat
// just to see changed the context and port number in application.properties
@SpringBootApplication
public class SchoolWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolWebAppApplication.class, args);
	}

}

package com.cybage.genworth.insurance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableTransactionManagement
public class InsuranceRestApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(InsuranceRestApplication.class);

	public static void main(String[] args) {

		logger.info("Application started..");
		SpringApplication.run(InsuranceRestApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer WebMvcConfigurerAdapter() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
			}
		};
	}

}

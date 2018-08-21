package org.yurgenbeerman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.yurgenbeerman.filter.TransactionsFilter;

@SpringBootApplication
public class ResponseFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResponseFilterApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean transactionsFilterRegistration() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new TransactionsFilter());
		registrationBean.addUrlPatterns("/api/v2/api/transactions/*");
		registrationBean.setOrder(1);
		return registrationBean;
	}
}

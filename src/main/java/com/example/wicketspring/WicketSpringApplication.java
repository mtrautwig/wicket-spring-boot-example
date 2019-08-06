package com.example.wicketspring;

import com.example.wicketspring.web.WicketApplication;
import org.apache.wicket.protocol.http.WicketFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Spring Boot entry point. Initializes and registers the Wicket filter.
 */
@SpringBootApplication
public class WicketSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WicketSpringApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean wicketFilter(WicketApplication application) {
		WicketFilter wicketFilter = new WicketFilter(application);
		wicketFilter.setFilterPath("/");

		FilterRegistrationBean<WicketFilter> filterRegistration = new FilterRegistrationBean<>(wicketFilter);
		filterRegistration.addUrlPatterns("/*");
		return filterRegistration;
	}

}

package com.example;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("deprecation")
@Configuration
public class WebConfiguration {
	 @Bean
	 public ServletRegistrationBean h2servletRegistration(){
		 ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
		 registrationBean.addUrlMappings("/console/*");
		 return registrationBean; 
	 }
}

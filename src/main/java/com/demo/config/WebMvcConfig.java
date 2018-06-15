package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;



@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport  {

	
	@Override  
	   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {  
	       configurer.enable();  
	   }  
}

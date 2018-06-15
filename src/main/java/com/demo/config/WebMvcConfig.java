package com.demo.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.demo.filter.SessionFilter;
import com.demo.interceptor.LoginHandlerInterceptor;



@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport  {

	
	@Override  
	   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {  
	       configurer.enable();  
	   }  
	
	 /**
     * 添加拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                //添加需要验证登录用户操作权限的请求
                .addPathPatterns("/*")
                //排除不需要验证登录用户操作权限的请求
                .excludePathPatterns("/test/*");
    }
    
    
    /**
     * 配置过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(sessionFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("sessionFilter");
        return registration;
    }

    /**
     * 创建一个bean
     * @return
     */
    @Bean(name = "sessionFilter")
    public Filter sessionFilter() {
        return new SessionFilter();
    }
}

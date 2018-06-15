package com.demo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.config.UrlConfig;

@Component
public class Caiji550DataTask {
	
	private final int MINUTE = 60 * 1000;
	
	@Autowired
    private Environment env;
	
	 @Async
	 @Scheduled(fixedRate = MINUTE * 1)
	public void exce() {
		 System.out.println(env.getProperty("url"));
		
	}

}

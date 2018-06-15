package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restnew")
public class RestfulNewController {

	
	
	@GetMapping("/v1")
	public Map<String,String> getName() {
		Map<String,String> resultMap = new HashMap<String,String>();
		resultMap.put("name", "张桑。");
		return resultMap;
	}
}

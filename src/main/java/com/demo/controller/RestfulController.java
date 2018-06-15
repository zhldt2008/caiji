package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class RestfulController {

	
	@GetMapping("/v1")
	@ResponseBody
	public Map<String,String> getName() {
		Map<String,String> resultMap = new HashMap<String,String>();
		resultMap.put("name", "张桑。");
		return resultMap;
	}
}

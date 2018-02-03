package com.chat.mchatapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testCls {

	@RequestMapping("/tt")
	public String test(){
		return "IIII";
	}
}

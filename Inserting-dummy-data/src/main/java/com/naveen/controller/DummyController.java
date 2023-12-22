package com.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.entity.DummyData;
import com.naveen.service.DummyService;

@RestController
public class DummyController {

	@Autowired
	private DummyService dummyservice;
	
	@PostMapping("/insert")
	public String insertData(@RequestBody DummyData dummy)
	{
		return dummyservice.insertData(dummy);
	}
}

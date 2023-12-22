package com.naveen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.entity.DummyData;
import com.naveen.repository.DummyRepository;

@Service
public class DummyService {

	@Autowired
	private DummyRepository dummyrepo;
	
	
	public String insertData(DummyData dummy) {
		
		dummyrepo.save(dummy);
		return "Inserted into database successfully";
	}

}

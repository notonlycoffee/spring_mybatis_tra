package com.wwq.frame.service.userService.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wwq.frame.domain.Person;
import com.wwq.frame.mapper.PersonMapper;
import com.wwq.frame.service.userService.PersonService;

public class PersonServiceImpl implements PersonService {

	
	@Autowired
	private PersonMapper personMapper;

	@Override
	public Person getPersonById(long id) throws Exception {
		return personMapper.getPersonById(id);
	}
	
}

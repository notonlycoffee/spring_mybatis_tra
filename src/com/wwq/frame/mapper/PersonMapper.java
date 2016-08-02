package com.wwq.frame.mapper;

import com.wwq.frame.domain.Person;

public interface PersonMapper {
	public Person getPersonById(long id) throws Exception;
	
}

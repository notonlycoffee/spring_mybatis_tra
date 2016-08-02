package com.wwq.frame.controller;

import com.wwq.frame.domain.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwq.frame.service.userService.PersonService;

@Controller
public class PersonController {

	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/getPerson.xhtml")
	public String getPersonById(String id) {
		try {
			id = "1";
			Person p = personService.getPersonById(Long.parseLong(id));
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "success";
	}
	
}

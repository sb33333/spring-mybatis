package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.PersonMapper;

@Service
public class MyService {
	
	@Autowired
	private PersonMapper personMapper;

	
	public List<Person> getPersonList() {
		return personMapper.getPersonList();
	}
	
	public void createTable() {
		personMapper.createTable();
	}
	
	public void insertPerson(Person person) {
		personMapper.insertPerson(person);
	}
	
	
	
	
}

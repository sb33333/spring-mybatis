package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Person;

@Mapper
public interface PersonMapper {
	public List<Person> getPersonList();
	public void createTable();
	public void insertPerson(Person person);
}

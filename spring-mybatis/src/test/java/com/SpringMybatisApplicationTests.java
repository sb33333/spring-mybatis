package com;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringMybatisApplicationTests {
	
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	public MyService service;
	
		
	@Test
	void contextLoads() {
	}
	
	@Test
	public void sqlSessionLoad() throws Exception{
		System.out.println(sqlSession.toString());
	}
	
	@Test
	public void mapperTest() {
		service.createTable();
		Person testPerson = new Person();
		testPerson.setName("sang");
		testPerson.setAge(30);
		service.insertPerson(testPerson);
		service.insertPerson(testPerson);
		List<Person> result = new ArrayList<>();
		result = service.getPersonList();
		result.stream().forEach(person -> System.out.println(person));
		Assertions.assertEquals("sang", result.stream().findAny().get().getName());
	}
	
	

}

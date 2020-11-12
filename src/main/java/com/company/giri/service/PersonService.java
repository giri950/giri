package com.company.giri.service;

import java.util.List;

import com.company.giri.entity.Person;

public interface PersonService {
	
	public List<Person> getAll();
	public Person save(Person person);
	public Person getById(Integer id);
	public void remove(Person per);
	public void remove(Integer id);

}

package com.company.giri.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.giri.dao.PersonDao;
import com.company.giri.entity.Person;
import com.company.giri.service.PersonService;

@Service
public class PersonServiceImp implements PersonService {
	
	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> getAll(){
		
		return null;
	}

	@Override
	public Person save(Person person) {
		
		personDao.save(person);
		return person;
	}

	@Override
	public Person getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Person per) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}

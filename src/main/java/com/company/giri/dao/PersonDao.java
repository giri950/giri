package com.company.giri.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.giri.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}

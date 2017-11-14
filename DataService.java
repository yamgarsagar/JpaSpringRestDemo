package com.cs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cs.Employee;
import com.cs.TodoRepository;

@org.springframework.stereotype.Service
public class DataService {
	
	TodoRepository toDoRepository;
	@Autowired
	public void setToDoRepository(TodoRepository toDoRepository) {
		this.toDoRepository = toDoRepository;
	}
	
	public String create(Employee employee){
		
		toDoRepository.save(employee);
		return null;
		
	}
	
}

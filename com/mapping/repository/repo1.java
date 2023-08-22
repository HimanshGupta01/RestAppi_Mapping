package com.mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.models.Author;
import com.mapping.models.Book;
import com.mapping.models.Employee;

public interface repo1 extends JpaRepository<Employee,String>{
	
}

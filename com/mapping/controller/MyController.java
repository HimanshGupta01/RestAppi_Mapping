package com.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.models.Book;
import com.mapping.models.Employee;
import com.mapping.repository.Repo;
import com.mapping.repository.repo1;

@RestController
@RequestMapping("/books")
public class MyController {
	
	@Autowired
	Repo rep;
	
	@Autowired
	repo1 repo;
	
	//  -------------------- one to one -------------------- //
/*	@PostMapping
	public List<Book> add(@RequestBody List<Book> book) {
		return rep.saveAll(book);
	}
	
	@GetMapping
	public List<Book> get() {
		return rep.findAll();
	}
	
	@PutMapping("/{id}")
	public Book edit(@PathVariable("id") int id , @RequestBody Book book) {
		return rep.save(book);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") int id , @RequestBody Book book) {
	     rep.delete(book);
	     return "redirect:/books";
	} 
	*/
	
	// -------------------- one to many --------------------//
	
	@PostMapping
	public List<Employee> add(@RequestBody List<Employee> emp) {
		return repo.saveAll(emp);
	}
	
	@GetMapping
	public List<Employee> get() {
		return repo.findAll();
	}
	
	@PutMapping("/{id}")
	public Employee edit(@PathVariable("id") String id , @RequestBody Employee emp) {
		return repo.save(emp);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") String id , @RequestBody Employee emp) {
	     repo.delete(emp);
	     return "redirect:/books";
	} 
	
	
	
	
	
}

package com.mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.models.Author;
import com.mapping.models.Book;
import com.mapping.models.Employee;

public interface Repo extends JpaRepository<Book , Integer> {

	//List<Book> findByAuthor_Name(String author_name);
}

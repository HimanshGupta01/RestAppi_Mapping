package com.mapping.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_author")
public class Author {
	
	@Id
	private int author_id;
	private String author_name;
	private String language;
	
	@OneToOne(mappedBy="author")
	@JsonBackReference
	private Book book;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int author_id, String author_name, String language, Book book) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.language = language;
		this.book = book;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	

}

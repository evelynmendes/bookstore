package com.evelynmendes.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evelynmendes.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
		
	
}

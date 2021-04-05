package com.ojas.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.models.Book;

public interface BookPublisherDao extends JpaRepository<Book, Integer> {

	List<Book> findAllDetails(int id);
	List<Book> findBookByPublisher(int publisher_id);
}

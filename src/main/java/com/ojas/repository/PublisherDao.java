package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.models.Publisher;

public interface PublisherDao extends JpaRepository<Publisher, Integer> {

}

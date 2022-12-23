package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.model.Images;

public interface uploadRepository extends JpaRepository<Images, Integer>{
	
	

}

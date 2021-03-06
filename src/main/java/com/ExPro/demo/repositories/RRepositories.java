package com.ExPro.demo.repositories;


import java.util.Date;
import java.util.List;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ExPro.demo.entity.orders;


@Repository
public interface RRepositories extends JpaRepository<orders, Integer> {

	
	public List<orders> findByDateAndActiveTrue(String date);
	
	//public List<orders> findOrder(@Param("searchword") String searchword);
}



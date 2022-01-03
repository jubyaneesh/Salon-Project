package com.salon.learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salon.learn.model.SalonServiceDetail;

@Repository
public interface SalonServiceDetailRepository extends  JpaRepository<SalonServiceDetail,Long>{

	
	List<SalonServiceDetail> findAll();
	
	}
	
	
	
	


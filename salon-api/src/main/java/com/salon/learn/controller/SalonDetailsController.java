package com.salon.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salon.learn.model.SalonServiceDetail;
import com.salon.learn.repository.SalonServiceDetailRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/services")
public class SalonDetailsController {

	@Autowired
	private SalonServiceDetailRepository salonServiceDetailRepository;

	@ApiOperation(value = "RetrieveAvailableSalonServicesAPI")
	// get all employees
	@GetMapping("/retrieveAvailableSalonServices")
	public List<SalonServiceDetail> getsalondetails() {
		return salonServiceDetailRepository.findAll();
	}

}

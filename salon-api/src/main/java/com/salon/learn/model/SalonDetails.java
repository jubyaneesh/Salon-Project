package com.salon.learn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Configuration
@NoArgsConstructor
@Getter
@Setter
public class SalonDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Value("${name}")
	private String name;

	@Value("${address}")
	private String address;

	@Value("${city}")
	private String city;

	@Value("${state}")
	private String state;

	@Value("${zipcode}")
	private int zipcode;

	@Value("${phone}")
	private String phone;

}

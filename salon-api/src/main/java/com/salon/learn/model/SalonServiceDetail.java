package com.salon.learn.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table(name = "salon_service_detail", schema = "public")
public class SalonServiceDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String name;
	String description;
	Long price;
	Integer timeInMinutes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(Integer timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}
}
package com.salon.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salon.learn.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot,Long> {

}

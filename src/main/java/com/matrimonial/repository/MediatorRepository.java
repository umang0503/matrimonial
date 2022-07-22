package com.matrimonial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimonial.entities.Mediator;
@Repository
public interface MediatorRepository extends JpaRepository<Mediator,Long>{
	
}

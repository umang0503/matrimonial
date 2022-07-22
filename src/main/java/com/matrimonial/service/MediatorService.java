package com.matrimonial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimonial.entities.Mediator;
import com.matrimonial.repository.MediatorRepository;
@Service
public class MediatorService {

	private final MediatorRepository medRepository;


    public MediatorService(MediatorRepository medRepository) {
        this.medRepository = medRepository;
    }

    public void saveMed(Mediator post){
        getMediatorRepository().save(post);
    }

    public List<Mediator> getAllMed(){
        return getMediatorRepository().findAll();
    }

public Mediator deleteCar(Long MedId) {
		
		Optional<Mediator> retrievedCar=getMediatorRepository().findById(MedId);
		if(retrievedCar==null)
			try {
				throw new Exception("Car not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		getMediatorRepository().deleteById(MedId);
		return retrievedCar.get();
}

    public 	MediatorRepository getMediatorRepository() {
        return medRepository;
    }
}

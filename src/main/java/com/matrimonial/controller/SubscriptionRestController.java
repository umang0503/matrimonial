package com.matrimonial.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matrimonial.entities.Mediator;
import com.matrimonial.entities.Subscription;
import com.matrimonial.service.MediatorService;
import com.matrimonial.service.SubscriptionService;
@RestController
public class SubscriptionRestController {
	private final SubscriptionService subscriptionService;


    public SubscriptionRestController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/subscription")
    public ResponseEntity<Subscription> createPost(@RequestBody Subscription subscription){
        subscriptionService.saveMed(subscription);
        return new ResponseEntity<>(subscription,HttpStatus.CREATED);
    }

    @GetMapping("/subscription")
    public ResponseEntity<List<Subscription>> getAllPosts(){
        return new ResponseEntity<>(subscriptionService.getAllMed(), HttpStatus.OK);
    }
    
    @DeleteMapping("/subscription/{id}")
	public ResponseEntity<Object> deleteCar(@PathVariable("id") Long carId) {
		 subscriptionService.deleteCar(carId);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
   
}

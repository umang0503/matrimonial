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
import com.matrimonial.entities.Profile;
import com.matrimonial.service.MediatorService;
import com.matrimonial.service.ProfileServices;
@RestController
public class ProfileRestController {
	private final ProfileServices profileService;


    public ProfileRestController(ProfileServices profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/profile")
    public ResponseEntity<Profile> createPost(@RequestBody Profile profile){
        profileService.saveProfile(profile);
        return new ResponseEntity<>(profile,HttpStatus.CREATED);
    }

    @GetMapping("/profile")
    public ResponseEntity<List<Profile>> getAllPosts(){
        return new ResponseEntity<>(profileService.getAllProfile(), HttpStatus.OK);
    }

   
}

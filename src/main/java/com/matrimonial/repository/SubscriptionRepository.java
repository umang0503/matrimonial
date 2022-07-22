package com.matrimonial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimonial.entities.Subscription;
@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

}

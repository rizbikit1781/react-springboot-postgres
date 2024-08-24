package com.example.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Contact;



@Repository
public interface ContactRepo extends JpaRepository<Contact, String>{
    Optional<Contact> findById(String id);
}

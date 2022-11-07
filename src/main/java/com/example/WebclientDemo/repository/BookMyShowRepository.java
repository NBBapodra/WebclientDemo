package com.example.WebclientDemo.repository;


import com.example.WebclientDemo.model.BookRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMyShowRepository extends JpaRepository<BookRequest, Integer> {

}
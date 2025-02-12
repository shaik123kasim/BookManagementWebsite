package com.example.BookStoreManagementWebsite.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStoreManagementWebsite.DTO.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}

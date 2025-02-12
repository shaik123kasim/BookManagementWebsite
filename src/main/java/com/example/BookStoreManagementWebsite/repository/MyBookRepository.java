package com.example.BookStoreManagementWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStoreManagementWebsite.DTO.MyBookList;
@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}

package com.example.BookStoreManagementWebsite.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookStoreManagementWebsite.DTO.MyBookList;
import com.example.BookStoreManagementWebsite.repository.MyBookRepository;
@Service
public class MyBookListService {
		@Autowired
		private MyBookRepository myBook;
		
		public void saveMyBook(MyBookList book) {
			myBook.save(book);
		}
		
		public List<MyBookList> getAllMyBooks(){
			return myBook.findAll();
		}
		public void deleteMyBook(int id) {
			myBook.deleteById(id);
		}
		
}

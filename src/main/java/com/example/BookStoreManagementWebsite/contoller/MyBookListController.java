package com.example.BookStoreManagementWebsite.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BookStoreManagementWebsite.DAO.MyBookListService;
//import com.example.BookStoreManagementWebsite.DTO.MyBookList;

@Controller
public class MyBookListController {
	
		@Autowired
		private MyBookListService service;
	
		@RequestMapping("/deleteMyList/{id}")
		public String deleteMyList(@PathVariable ("id") int id) {
			service.deleteMyBook(id);
			return "redirect:/my_books";
		}
}

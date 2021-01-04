package com.kodark.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodark.news.dto.CategoryDto;
import com.kodark.news.service.AdminService;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping(path = "/category")
	public ResponseEntity<List<CategoryDto>> categoryInfo(){
		
		return new ResponseEntity<List<CategoryDto>>(adminService.CategoryInfo(), HttpStatus.OK);//200 
	}
	
}

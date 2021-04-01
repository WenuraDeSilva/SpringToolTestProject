package com.codefestday02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefestday02.entities.Product;
import com.codefestday02.repository.productRepository;

@Service
public class productService {

	@Autowired
	productRepository proRepository;
	public List<Product> getProductAll(){
		List<Product> userList = proRepository.findAll();
		return userList;
	}
	
	
	public Product saveProduct(Product product) {
		return proRepository.save(product);
	}
	
}

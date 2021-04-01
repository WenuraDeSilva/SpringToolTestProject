package com.codefestday02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codefestday02.entities.Product;
import com.codefestday02.service.productService;

@RestController
@RequestMapping(path = "/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class productController {

	@Autowired
	productService proService;
	
	@PostMapping(path = "/getProductAll")
	public List<Product> getProducts() {
		return proService.getProductAll();
	}
	
	@PostMapping(path = "/addProduct")
	public Product adduser(@RequestBody @RequestParam int proid, @RequestBody @RequestParam String proname,@RequestBody @RequestParam String desc, @RequestBody @RequestParam Double price) {
		Product product = new Product();
		product.setId(proid);
		product.setProductName(proname);
		product.setProductDesc(desc);
		product.setPrice(price);
		return proService.saveProduct(product);
	}
	
}

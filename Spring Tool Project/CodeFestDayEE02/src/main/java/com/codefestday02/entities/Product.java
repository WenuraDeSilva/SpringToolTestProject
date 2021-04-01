package com.codefestday02.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4171157311939344053L;

	@Id
	int id;
	String ProductName;
	String ProductDesc;
	double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDesc() {
		return ProductDesc;
	}
	public void setProductDesc(String productDesc) {
		ProductDesc = productDesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

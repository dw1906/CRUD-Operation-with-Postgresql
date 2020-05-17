package com.example.objects;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@Column
	private int productid;
	@Column
	private String productname;
	@Column
	private int price;
	@Column
	private String productcompany;
	
	public int getProductID() {
		return productid;
	}
	public void setProductID(int productID) {
		this.productid = productid;
	}
	public String getProductName() {
		return productname;
	}
	public void setProductName(String productName) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductCompany() {
		return productcompany;
	}
	public void setProductCompany(String productCompany) {
		this.productcompany = productcompany;
	}	
}

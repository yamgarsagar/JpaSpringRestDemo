package com.cs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class Products {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String productName;
	
	@OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn
	CommonAttribute commonAttribute;
	
	public CommonAttribute getCommonAttribute() {
		return commonAttribute;
	}
	public void setCommonAttribute(CommonAttribute commonAttribute) {
		this.commonAttribute = commonAttribute;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}

package com.cs.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.model.Category;
import com.cs.repository.ProductCRUDRepository;

@Service
public class ProductService {

	ProductCRUDRepository productCRUDRepository;
	
	@Autowired
	public void setProductCRUDRepository(ProductCRUDRepository productCRUDRepository) {
		this.productCRUDRepository = productCRUDRepository;
	}
	
	public String productSave(Category category){
		productCRUDRepository.save(category);
		return "saved SuccessFully";
	}
	
	public String updateProduct(int id,Category category){
		Optional<Category> category1=productCRUDRepository.findById(id);
		category.setId(category1.get().getId());
		productCRUDRepository.save(category);
		return "updated successfully";
	}
	
	public String deleteProduct(int id){
		//Optional<Category> category=productCRUDRepository.findById(id);
		productCRUDRepository.deleteById(id);
		return "deleted successfully";
	}
	
	public List<Category> getAllProduct(){
		//Optional<Category> category=productCRUDRepository.findById(id);
		List<Category> categoryList=(List<Category>) productCRUDRepository.findAll();
		return categoryList;
	}
}

package com.cs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.model.Category;
import com.cs.product.service.ProductService;
import com.cs.service.DataService;

@Controller
public class RestController {
	
	DataService service;
	@Autowired
	public void setService(DataService service) {
		this.service = service;
	}
	
	ProductService productService;
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value="/hello")
	public @ResponseBody String hello(){
		Employee employee = new Employee();
		employee.setDeg("manager");
		employee.setEname("content sphere");
		employee.setSalary(15000.00);
		//service.create(employee);
		return "Hello ...";
	}

	
	@RequestMapping(value="/productSave",method=RequestMethod.POST)
	public @ResponseBody String productSave(@RequestBody Category category){
		//Category category= new Category();
		return productService.productSave(category);
	}
	
	@RequestMapping(value="/productUpdate/{id}",method=RequestMethod.POST)
	public @ResponseBody String productUpdate(@PathVariable int id,@RequestBody Category category){
		//Category category= new Category();
		return productService.updateProduct(id,category);
	}
	
	@RequestMapping(value="/getAllProducts",method=RequestMethod.GET)
	public @ResponseBody List<Category> getAllProduct(){
		//Category category= new Category();
		return productService.getAllProduct();
	}
	
	@RequestMapping(value="/productDelete/{id}",method=RequestMethod.DELETE)
	public @ResponseBody String productDelete(@PathVariable int id){
		//Category category= new Category();
		return productService.deleteProduct(id);
	}
	
}

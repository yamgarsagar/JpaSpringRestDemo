package com.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cs.model.Category;

public interface ProductCRUDRepository extends CrudRepository<Category, Integer> {

}

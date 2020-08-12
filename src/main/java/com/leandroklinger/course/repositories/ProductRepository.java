package com.leandroklinger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroklinger.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

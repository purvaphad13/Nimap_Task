package com.purva.Nimap_Demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purva.Nimap_Demo.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}

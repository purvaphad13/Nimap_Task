package com.purva.Nimap_Demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purva.Nimap_Demo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

package com.purva.Nimap_Demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.purva.Nimap_Demo.Repo.CategoryRepository;
import com.purva.Nimap_Demo.model.Category;

@Service
public class CategoryService {
	
	@Autowired 
	private CategoryRepository categoryRepository;
    
// Create a new category
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

// Get category by ID
	public Category findById(Long id) {
		return categoryRepository.findById(id) 
				.orElseThrow(() -> new RuntimeException("Category not found!"));
	}

// Update category by ID
	public Category update(Long id, Category category) {
		Category existingcategory = findById(id); 
	 existingcategory.setName(category.getName()); 
		return categoryRepository.save(existingcategory);
	}

// Delete category by ID
	public void deleteById(Long id) {
		Category category = findById(id); 
		categoryRepository.delete(category);
		
	}

// Get all categories with pagination
	public Page<Category> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

}

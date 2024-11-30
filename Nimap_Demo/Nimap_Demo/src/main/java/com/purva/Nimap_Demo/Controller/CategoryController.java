package com.purva.Nimap_Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purva.Nimap_Demo.Service.CategoryService;
import com.purva.Nimap_Demo.model.Category;

@RestController 
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
	private CategoryService categoryService;
    
    @GetMapping 
    public Page<Category> getAllCategories(Pageable pageable) { 
    	return categoryService.findAll(pageable); 
    } 
    
    @PostMapping 
    public Category createCategory(@RequestBody Category category) { 
    	return categoryService.save(category);
    } 
    
    @GetMapping("/{id}") 
    public Category getCategoryById(@PathVariable Long id) { 
    	return categoryService.findById(id);
    }
    
    @PutMapping("/{id}") 
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) { 
    	return categoryService.update(id, category); 
    } 
    
    @DeleteMapping("/{id}") 
    public void deleteCategory(@PathVariable Long id) { 
    	categoryService.deleteById(id); 
    }
}

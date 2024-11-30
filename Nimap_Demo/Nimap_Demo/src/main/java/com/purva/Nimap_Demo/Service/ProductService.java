package com.purva.Nimap_Demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.purva.Nimap_Demo.Repo.CategoryRepository;
import com.purva.Nimap_Demo.Repo.ProductRepository;
import com.purva.Nimap_Demo.model.Category;
import com.purva.Nimap_Demo.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository; 
	
	@Autowired 
	private CategoryRepository categoryRepository;

// Get all products with pagination
	public Page<Product> findAll(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

// Create a new product
	public Product save(Product product, Long categoryId) {
		 Category category = categoryRepository.findById(categoryId)
		            .orElseThrow(() -> new RuntimeException("Category not found!"));
		        product.setCategory(category);
		        return productRepository.save(product);
	}

// Get product by ID
	public Product findById(Long id) {
		return productRepository.findById(id)
	       .orElseThrow(() -> new RuntimeException("Product not found!"));
	}

// Update product by ID
	public Product update(Long id, Product product) {
		Product existingProduct = findById(id);
        Category category = categoryRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Category not found!"));
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setCategory(category);
        return productRepository.save(existingProduct);
	}

// Delete product by ID
	public void deleteById(Long id) {
		productRepository.deleteById(id);
		
	}

}

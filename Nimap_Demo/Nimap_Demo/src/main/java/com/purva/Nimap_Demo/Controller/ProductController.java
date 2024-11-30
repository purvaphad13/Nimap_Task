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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purva.Nimap_Demo.Service.ProductService;
import com.purva.Nimap_Demo.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired 
	private ProductService productService; 
	
// Get all products with pagination
	@GetMapping 
	public Page<Product> getAllProducts(Pageable pageable) { 
		return productService.findAll(pageable); 
		}
	
// Create new product
	@PostMapping public Product createProduct(@RequestBody Product product, @RequestParam Long categoryId) { 
		return productService.save(product, categoryId);
		} 
	
// Get product by ID
	@GetMapping("/{id}") 
	public Product getProductById(@PathVariable Long id) {
		return productService.findById(id); 
		}
	
// Update product by ID
	@PutMapping("/{id}") 
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) { 
		return productService.update(id, product); 
		} 
	
// Delete product by ID
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteById(id);
	   }

}

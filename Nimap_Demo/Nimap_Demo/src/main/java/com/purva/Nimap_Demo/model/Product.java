package com.purva.Nimap_Demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String name;
      private double price;
      
      @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "category_id")
      private Category category;
	
	}



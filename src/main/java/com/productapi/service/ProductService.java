package com.productapi.service;

import java.util.List;

import com.productapi.dto.ProductDto;
import com.productapi.entity.Product;

public interface ProductService {
	
	Product createProduct(ProductDto productDto);
	
	Product getProductById(Long id);
	
    List<Product> getAllProducts();

    Product updateProduct(Long id, ProductDto productDto);
    
    void deleteProduct(Long id);
}

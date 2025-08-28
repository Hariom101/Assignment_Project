package com.productapi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.productapi.dto.ProductDto;
import com.productapi.entity.Product;
import com.productapi.exception.ProductNotFoundException;
import com.productapi.repo.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepo;

	@Override
	public Product createProduct(ProductDto productDto) {

		Product product = new Product();
		BeanUtils.copyProperties(productDto, product);
		return productRepo.save(product);
	}

	@Override
	public Product getProductById(Long id) {
		return productRepo.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product not found with id " + id));
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product updateProduct(Long id, ProductDto productDto) {
		Product product = productRepo.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product not found with id " + id));
		
		product.setName(productDto.getName());
		product.setDescription(productDto.getDescription());
		product.setPrice(productDto.getPrice());
		return productRepo.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepo.delete(getProductById(id));
	}
}

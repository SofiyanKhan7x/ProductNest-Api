package com.suffu.ProductNest_Api.service;

import com.suffu.ProductNest_Api.model.Product;
import com.suffu.ProductNest_Api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public List<Product> getProduct(Product product){
        return repo.findAll();
    }

    public Product getProductById(int productId){
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product){
        repo.save(product);
    }
}

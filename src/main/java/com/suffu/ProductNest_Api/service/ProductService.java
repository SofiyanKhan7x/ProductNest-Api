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

    //fetching and returning the list of products
    public List<Product> getProduct(Product product){
        return repo.findAll();
    }

    //fetching product from database through product Id
    public Product getProductById(int productId){
        return repo.findById(productId).orElse(new Product());
    }

    //add product in the database
    public void addProduct(Product product){
        repo.save(product);
    }

    //update the product in the database
    public void updateProduct(Product product){
        repo.save(product);
    }

    //Deleting the product in the database
    public  void deleteProduct(int productId){
        repo.deleteById(productId);
    }
}

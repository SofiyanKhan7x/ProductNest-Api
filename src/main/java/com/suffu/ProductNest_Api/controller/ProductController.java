package com.suffu.ProductNest_Api.controller;

import com.suffu.ProductNest_Api.model.Product;
import com.suffu.ProductNest_Api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //For Home Page
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Project";
    }

    //Fetching all products from the h2 database
    @GetMapping("/products")
    public List<Product> getProduct(Product product){
        return service.getProduct(product);
    }

    //Fetching all products by id from the h2 database
    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    //Posting products and storing in the h2 database
    @PostMapping("/products")
    public void addProduct(@RequestBody  Product product){
        System.out.println("Product Added");
         service.addProduct(product);
    }

    //Put for updating the data in the h2 database
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    //Delete product from the database
    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
    }
}

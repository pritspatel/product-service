package com.prits.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @GetMapping("/product")
    //@PreAuthorize("hasRole('READ')")
    public Product getProducts(){
        return new Product("iPad","A table with 10 inch screen from Apple");
    }
}
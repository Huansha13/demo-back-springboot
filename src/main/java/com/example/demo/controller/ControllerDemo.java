package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class ControllerDemo {

    // Hola mundo
    @GetMapping()
    public String hello() {
        return "Hello World";
    }

    // Lista de productos
    @GetMapping("/products")
    public ResponseEntity<List<Map<String, String>>> products() {
        List<Map<String, String>> productos = new ArrayList<>();

        Map<String, String> p1 = new HashMap<>();
        p1.put("id", "1");
        p1.put("name", "Product 1");
        p1.put("price", "100");
        productos.add(p1);

        Map<String, String> p2 = new HashMap<>();
        p2.put("id", "2");
        p2.put("name", "Product 2");
        p2.put("price", "200");
        productos.add(p2);

        Map<String, String> p3 = new HashMap<>();
        p3.put("id", "3");
        p3.put("name", "Product 3");
        p3.put("price", "300");
        productos.add(p3);

        return ResponseEntity.ok(productos);
    }
}

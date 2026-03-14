package com.example.frontendversioncontroltaskikemefunachidinma.bakery;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.slf4j.Logger;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping
    public List<String> getProducts() {
        logger.info("Fetching all bakery products");
        return List.of("Vanilla Cake", "Red Velvet", "Butter cream icing cupcakes", "Chocolate Chip Cookies", "Chocolate Cake");
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable Long id) {
        if (id <= 0) {
            logger.error("Invalid Product ID: {}", id);
            return "Error: ID must be greater than 0";
        }
        return "Product Found: " + id;
    }
}

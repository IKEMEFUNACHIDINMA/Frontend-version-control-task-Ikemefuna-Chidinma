package com.example.frontendversioncontroltaskikemefunachidinma.bakery;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<String> getProducts() {
        return List.of("Vanilla Cake", "Red Velvet", "Butter cream icing cupcakes", "Chocolate Chip Cookies", "Chocolate Cake");
    }
}

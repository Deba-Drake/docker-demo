package docker.demo.controller;

import docker.demo.entity.Product;
import docker.demo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apis")
public class ProductController
{
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all-products")
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Integer id)
    {
        return productRepository.findById(id).get();
    }

    @PostMapping("/insert")
    public Product createProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }
}
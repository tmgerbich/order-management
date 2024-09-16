package org.ordermanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1200.00);

        Product savedProduct = productService.createProduct(product);
        assertNotNull(savedProduct);
        assertEquals("Laptop", savedProduct.getName());
    }

    @Test
    public void testGetProductById() {
        Product product = new Product();
        product.setName("Mouse");
        product.setPrice(25.00);

        Product savedProduct = productService.createProduct(product);
        Product fetchedProduct = productService.getProductById(savedProduct.getId()).get();
        assertEquals("Mouse", fetchedProduct.getName());
    }
}

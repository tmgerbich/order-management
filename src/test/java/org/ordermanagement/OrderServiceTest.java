package org.ordermanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testCreateOrder() {
        Product product = new Product();
        product.setName("Keyboard");
        product.setPrice(50.00);

        Order order = new Order();
        order.setCustomerName("John Doe");
        order.setProducts(Collections.singletonList(product));

        Order savedOrder = orderService.createOrder(order);
        assertNotNull(savedOrder);
    }
}

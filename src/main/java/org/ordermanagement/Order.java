package org.ordermanagement;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;
}

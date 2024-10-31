package com.fruitshop.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "Fruit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruit {

    @Id
    private int id;
    private String name;
    private String color;
    private int price;
    private int quantity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customerId")
    private Customer customer;


}

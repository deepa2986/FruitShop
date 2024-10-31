package com.fruitshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "Order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

    @Id
    private int orderId;
    private String orderName;
    private int noOfOrders;
}

package com.fruitshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER")
@Entity
public class Customer {

    @Id
    @Column(name ="c_Id")
    private int customerId;
    private String customerName;
    private String address;


}

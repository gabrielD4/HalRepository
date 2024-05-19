package com.example.ex9halrepositories.cars.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Car {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private long serialNumber;
    private double currentPrice;

}

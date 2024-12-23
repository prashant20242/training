package com.cts.entities;

import lombok.Data;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Data
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerOrderId;
    
    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "itemsId", nullable = false)
    private Items items;

    @Temporal(TemporalType.DATE)
    private Date orderDate;
    
    private double totalAmount;
}

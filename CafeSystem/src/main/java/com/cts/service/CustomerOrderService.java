package com.cts.service;

import java.util.List;

import com.cts.entities.CustomerOrder;

public interface CustomerOrderService {
    CustomerOrder saveCustomerOrder(CustomerOrder customerOrder);
    List<CustomerOrder> getAllCustomerOrders();
    CustomerOrder getCustomerOrderById(Long id);
    CustomerOrder updateCustomerOrder(Long id, CustomerOrder updatedCustomerOrder);
    void deleteCustomerOrder(Long id);
}

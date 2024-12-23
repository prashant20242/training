package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.CustomerOrder;
import com.cts.exception.ResourceNotFoundException;
import com.cts.repository.CustomerOrderRepository;

import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    @Override
    public CustomerOrder saveCustomerOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }

    @Override
    public List<CustomerOrder> getAllCustomerOrders() {
        return customerOrderRepository.findAll();
    }

    @Override
    public CustomerOrder getCustomerOrderById(Long id) {
        return customerOrderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CustomerOrder not found with id: " + id));
    }

    @Override
    public CustomerOrder updateCustomerOrder(Long id, CustomerOrder updatedCustomerOrder) {
        return customerOrderRepository.findById(id).map(customerOrder -> {
            customerOrder.setOrderDate(updatedCustomerOrder.getOrderDate());
            customerOrder.setTotalAmount(updatedCustomerOrder.getTotalAmount());
            customerOrder.setCustomer(updatedCustomerOrder.getCustomer());
            return customerOrderRepository.save(customerOrder);
        }).orElseThrow(() -> new ResourceNotFoundException("CustomerOrder not found with id: " + id));
    }

    @Override
    public void deleteCustomerOrder(Long id) {
        if (!customerOrderRepository.existsById(id)) {
            throw new ResourceNotFoundException("CustomerOrder not found with id: " + id);
        }
        customerOrderRepository.deleteById(id);
    }
}

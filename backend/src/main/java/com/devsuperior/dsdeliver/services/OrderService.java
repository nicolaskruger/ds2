package com.devsuperior.dsdeliver.services;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderRepository order;

    public List<OrderDTO> findAll(){
        List<Order> list = order.findOrdersWithProducts();
        return list.stream().map(o->new OrderDTO(o)).collect(Collectors.toList());
    }
}

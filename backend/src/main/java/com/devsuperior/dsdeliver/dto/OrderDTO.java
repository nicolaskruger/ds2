package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;
    private Set<ProductDTO> products;

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }
    public OrderDTO(){}
    public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
        this.id = id;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.moment = moment;
        this.status = status;
        this.products = new HashSet<>();
    }
    public OrderDTO(Order order){
        this.id = order.getId();
        this.address = order.getAddress();
        this.latitude = order.getLatitude();
        this.longitude = order.getLongitude();
        this.moment = order.getMoment();
        this.status = order.getStatus();
        this.products = order.getProducts().stream().map(p->new ProductDTO(p)).collect(Collectors.toSet());
    }
}

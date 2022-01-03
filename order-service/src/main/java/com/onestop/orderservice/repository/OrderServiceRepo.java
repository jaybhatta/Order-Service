package com.onestop.orderservice.repository;

import org.springframework.stereotype.Repository;

import com.onestop.orderservice.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface OrderServiceRepo extends JpaRepository<Order, Integer>{

}

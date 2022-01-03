package com.onestop.orderservice.service;

import java.util.List;

import com.onestop.orderservice.model.Order;

public interface OrderServiceService {
	
	Order getOrderById(int id);
	void saveOrder(Order order);
	List<Order> getAllOrder();
	
	

}

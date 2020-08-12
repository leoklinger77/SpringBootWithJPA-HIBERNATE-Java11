package com.leandroklinger.course.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandroklinger.course.entities.OrderItem;
import com.leandroklinger.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;

	public List<OrderItem> findAll() {
		return repository.findAll();
	}
	
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

}

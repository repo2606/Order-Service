package com.deepak.Order.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deepak.Order.dto.OrderRequest;
import com.deepak.Order.dto.Orderlineitemsdto;
import com.deepak.Order.model.Order;
import com.deepak.Order.model.Orderlineitems;
import com.deepak.Orderrepository.OrderRepository;

@Service
@Transactional
public class OrderService {
	
	
	private OrderRepository orderRepo;
	
    public OrderService() {
		super();
	}

	public OrderService(OrderRepository orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}

	public void PlaceOrder(OrderRequest orderRequest) {

		Order order = new Order();
		order.setOrderNumber(UUID.randomUUID().toString());

		List<Orderlineitems> listofOrderitems = orderRequest.getOrderlineitemsdto().stream()
				.map(Orderlineitemsdto -> mapToOrderlineitems(Orderlineitemsdto)).toList();
		order.setListofitems(listofOrderitems);

		orderRepo.save(order);
	}

	private Orderlineitems mapToOrderlineitems(Orderlineitemsdto orderlineitemsdto) {

		Orderlineitems orderlineitem = new Orderlineitems();

		orderlineitem.setId(orderlineitemsdto.getId());
		orderlineitem.setPrice(orderlineitemsdto.getPrice());
		orderlineitem.setQuantity(orderlineitemsdto.getQuantity());
		orderlineitem.setSkuCode(orderlineitemsdto.getSkuCode());

		return orderlineitem;

	}

}

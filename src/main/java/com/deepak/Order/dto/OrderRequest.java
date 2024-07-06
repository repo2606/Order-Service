package com.deepak.Order.dto;

import java.util.List;

public class OrderRequest {
	
	List<Orderlineitemsdto> orderlineitemsdto;
	
	public OrderRequest() {
		super();
	}

	public OrderRequest(List<Orderlineitemsdto> orderlineitemsdto) {
		super();
		this.orderlineitemsdto = orderlineitemsdto;
	}

	public List<Orderlineitemsdto> getOrderlineitemsdto() {
		return orderlineitemsdto;
	}

	public void setOrderlineitemsdto(List<Orderlineitemsdto> orderlineitemsdto) {
		this.orderlineitemsdto = orderlineitemsdto;
	}



}

package com.deepak.Order.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="t_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String orderNumber;
	
	@OneToMany(cascade = CascadeType.ALL)    // one order from customer  has list of many items
	private List<Orderlineitems> listofitems;

	public Order() {
		super();
	}

	public Order(Long id, String orderNumber, List<Orderlineitems> listofitems) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.listofitems = listofitems;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<Orderlineitems> getListofitems() {
		return listofitems;
	}

	public void setListofitems(List<Orderlineitems> listofitems) {
		this.listofitems = listofitems;
	}



}

package com.deepak.Orderrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.deepak.Order.model.Order;

@Repository
@Component
public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.moshop.backend.repository;

import com.moshop.backend.model.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartRepository extends MongoRepository<Cart, String> {
    List<Cart> findAllByCustomerId(String customerId);

    Cart findByCartIdAndCustomerId(String cartId, String customerId);

    long countByCustomerId(String customerId);
}

package com.dorian.dreamshops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dorian.dreamshops.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    // Cart findByUserId(Long userId);

}

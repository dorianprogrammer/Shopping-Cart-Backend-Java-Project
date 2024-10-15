
package com.dorian.dreamshops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dorian.dreamshops.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    void deleteAllByCartId(Long id);

}
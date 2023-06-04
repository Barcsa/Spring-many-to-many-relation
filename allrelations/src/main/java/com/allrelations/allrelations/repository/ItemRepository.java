package com.allrelations.allrelations.repository;

import com.allrelations.allrelations.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

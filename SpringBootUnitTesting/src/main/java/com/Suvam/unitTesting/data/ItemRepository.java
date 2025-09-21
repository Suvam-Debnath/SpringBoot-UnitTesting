package com.Suvam.unitTesting.data;

import com.Suvam.unitTesting.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}

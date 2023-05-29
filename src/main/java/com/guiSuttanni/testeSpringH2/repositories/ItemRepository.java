package com.guiSuttanni.testeSpringH2.repositories;

import com.guiSuttanni.testeSpringH2.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

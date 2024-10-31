package com.fruitshop.repository;

import com.fruitshop.model.Fruit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitRepository extends JpaRepository<Fruit,Integer> {
    Fruit findFruitByName(String name);

    List<Fruit> findAllFruitByColor(String color);

    Fruit findFruitByPrice(int price);
}

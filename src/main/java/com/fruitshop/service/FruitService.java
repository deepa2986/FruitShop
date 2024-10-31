package com.fruitshop.service;

import com.fruitshop.model.Fruit;

import java.util.List;

public interface FruitService {

    Fruit addFruit (Fruit fruit);
    List<Fruit> getAllFruit();
    Fruit getFruitById(int id);
    Fruit updateFruit(Fruit fruit);
    Fruit deleteFruit(int id);
    Fruit getFruitByName(String name);
    List<Fruit> getAllFruitByColor(String color);
    Fruit getFruitByPrice(int price);

    List<Fruit> saveAllFruit(List<Fruit> fruits);


}

package com.fruitshop.service.impl;

import com.fruitshop.model.Fruit;
import com.fruitshop.repository.FruitRepository;
import com.fruitshop.service.FruitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    public FruitServiceImpl (FruitRepository fruitRepository){
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> getAllFruit() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit getFruitById(int id) {
        return fruitRepository.findById(id).get();
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        Fruit existedFruit = fruitRepository.findById(fruit.getId()).get();
        existedFruit.setId(fruit.getId());
        existedFruit.setName(fruit.getName());
        existedFruit.setColor(fruit.getColor());
        existedFruit.setQuantity(fruit.getQuantity());
        existedFruit.setPrice(fruit.getPrice());
        return fruitRepository.save(existedFruit);
    }

    @Override
    public Fruit deleteFruit(int id) {
        fruitRepository.deleteById(id);
        return null;
    }

    @Override
    public Fruit getFruitByName(String name) {
        return fruitRepository.findFruitByName(name);
    }

    @Override
    public List<Fruit> getAllFruitByColor(String color) {
        return fruitRepository.findAllFruitByColor(color);
    }

    @Override
    public Fruit getFruitByPrice(int price) {
        return fruitRepository.findFruitByPrice(price);
    }

    @Override
    public List<Fruit> saveAllFruit(List<Fruit> fruits) {
        return fruitRepository.saveAll(fruits);
    }
}

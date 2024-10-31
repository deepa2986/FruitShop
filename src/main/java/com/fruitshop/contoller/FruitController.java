package com.fruitshop.contoller;

import com.fruitshop.model.Fruit;
import com.fruitshop.service.FruitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fruit")
public class FruitController {

    private final FruitService service;

    public FruitController(FruitService service) {
        this.service = service;
    }

    @PostMapping("/fruit")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        Fruit saveFruit = service.addFruit(fruit);
        return new ResponseEntity<>(saveFruit, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Fruit>> viewAllFruit(){
        List fruitList = service.getAllFruit();
        return new ResponseEntity<>(fruitList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable int id){
        Fruit fruit = service.getFruitById(id);
        return new ResponseEntity<>(fruit,HttpStatus.OK);
    }

    @DeleteMapping("/fruitId/{id}")
    public ResponseEntity<Fruit> deleteFruit(@PathVariable int id){
        Fruit deletedFruit= service.deleteFruit(id);
        return new ResponseEntity<>(deletedFruit,HttpStatus.OK);
    }

    @GetMapping("/fruitName/{name}")
    public ResponseEntity<Fruit> getFruitByName(@PathVariable String name){
        Fruit fruitByName = service.getFruitByName(name);
        return new ResponseEntity<>(fruitByName,HttpStatus.OK);
    }

    @GetMapping("/fruitPrice/{price}")
    public ResponseEntity<Fruit> getFruitByPrice(@PathVariable int price){
        Fruit fruitByPrice = service.getFruitByPrice(price);
        return new ResponseEntity<>(fruitByPrice,HttpStatus.OK);
    }


    @GetMapping("/fruits/{color}")
    public ResponseEntity<List<Fruit>> getAllFruitByColor(@PathVariable String color){
       List<Fruit>  fruitsByColor = service.getAllFruitByColor(color);
       return new ResponseEntity<>(fruitsByColor,HttpStatus.OK);
    }

    @PutMapping("/fruitUpdate")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit){
     Fruit updatedFruit = service.updateFruit(fruit);
     return new ResponseEntity<>(updatedFruit,HttpStatus.OK);
    }

    @PostMapping("/fruits")
    public ResponseEntity<List<Fruit>> saveAll(@RequestBody List<Fruit> fruits){
        List<Fruit> savedFruitList = service.saveAllFruit(fruits);
        return new ResponseEntity<>(savedFruitList,HttpStatus.OK);
    }
}

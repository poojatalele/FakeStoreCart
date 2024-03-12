package com.sst.cartService.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;

import com.sst.cartService.models.Cart;
import com.sst.cartService.models.Product;
import com.sst.cartService.service.CartService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class CartController {
    CartService cs;

    CartController(CartService cs){
        this.cs = cs;
    }

    //Get all carts
    @GetMapping("/carts")
    public ArrayList<Cart> getAllCarts(){
        return cs.getAllCarts();
    }
    //Get a single cart
    @GetMapping("/carts/{id}")
    public Cart getCartbyId(@PathVariable Long id){
        // return new Cart();
        return cs.getCartbyId(id);
    }

    public ArrayList<Cart> getDatesinRange(@PathVariable String startDate, @PathVariable String endDate){
        return cs.getDatesinRange();
    }
    //Get user carts
    @GetMapping("/carts/user/{id}")
    public ArrayList<Cart> getUserCarts(@PathVariable Long userId){
        // return new ArrayList<ArrayList<Cart>>();
        return cs.getUserCarts(userId);
    }

    //Add a new product
    @PostMapping("/carts")
    public Cart addNewCart(@RequestBody Cart cart) {        
        return null;
    }

    //Update a product
    @PatchMapping("/carts/{id}")
    public Cart updateCart(@RequestBody Cart cart){
        return null;
    }    

    //Delete a cart
    @DeleteMapping("/carts/{id}")
    public void deleteCart(@PathVariable Long id){ 
        return;
    }  
}

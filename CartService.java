package com.sst.cartService.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sst.cartService.DTO.FakeStoreCart;
import com.sst.cartService.models.Cart;

@Service
public class CartService {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public ArrayList<Cart> getAllCarts(){
        // ArrayList<Cart> allCarts = getAllCarts();
        ArrayList<Cart> carts = new ArrayList<>();
        for(int id=1;id<8;id++){
            var response = restTemplate.getForObject(
            url+"/carts/" +id,
             Cart.class);
             carts.add(response);
        }
        return carts;
    }

    public Cart getCartbyId(Long id){
        var response = restTemplate.getForObject(
            url+"/carts/" +id,
             Cart.class);
        return response;
    }
    public ArrayList<Cart> getDatesinRange(Long  startDate, Long endDate) {
        ArrayList<Cart> carts = new ArrayList<>();
        for(int id=1;id<8;id++){
            var response = restTemplate.getForObject(
            url+"/carts/" +id,
             Cart.class);
             carts.add(response);
        }
        ArrayList<Cart> cartDates = new ArrayList<>();
        for(int i=0;i<carts.size();i++){
            if(carts.get(i).getDate() <= endDate && carts.get(i).date >=startDate){

            }
        }
    }

    public ArrayList<Cart> getUserCarts(Long userId){
        ArrayList<Cart> userCarts = new ArrayList<>();
        for(int i=0;i<10;i++){
            var response = restTemplate.getForObject(
            url+"/carts/" +userId,
             Cart.class);
             userCarts.add(response);
        }
        return userCarts;
        }
    
    public Cart addNewCart(Cart cart){
        var response = restTemplate.postForObject("https://fakestoreapi.com/carts", cart, null);
        return (Cart) response;
        // return null;
    }
    public Cart updateCart(Cart cart){
        restTemplate.patchForObject("https://fakestoreapi.com/carts", cart, null);
        return null;
    }
    public void deleteCart(Long id){
        restTemplate.delete("https://fakestoreapi.com/carts/{id}", id);
        return;
    }
}


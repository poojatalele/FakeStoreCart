package com.sst.cartService.models;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cart {

    Long id;
    Long userId;
    public String date;
    ArrayList<Product> products;
    int __v;

}

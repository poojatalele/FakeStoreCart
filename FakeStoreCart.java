package com.sst.cartService.DTO;

import java.util.ArrayList;

import com.sst.cartService.models.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreCart {
    Long id;
    Long userId;
    String date;
    ArrayList<Product> pro;
}

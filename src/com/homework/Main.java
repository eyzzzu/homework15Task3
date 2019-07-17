package com.homework;

public class Main {

    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        Backpack backpack2 = new Backpack();

        backpack.productListToString();
        backpack.setBestPriceAndValue();
        backpack.productListToString();

        backpack.productListSort();

        backpack.productListToString();

        backpack.addProductsInBackpack();
        backpack.backPackToString();


    }
}

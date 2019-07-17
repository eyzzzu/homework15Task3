package com.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Backpack {

    private final int MAX_WEIGHT_IN_BACKPACK = 15; // in kg
    private int currentWeightInBackPack = 0;
    private List<Product> productList = new ArrayList<>();
    private List<Product> inBackPack = new ArrayList<>();

    {
        productList.add(new Product(4, 12));
        productList.add(new Product(2, 2));
        productList.add(new Product(2, 1));
        productList.add(new Product(1, 1));
        productList.add(new Product(10, 4));
    }

    public void addProductsInBackpack() {
        int i = 0;
        while (currentWeightInBackPack <= MAX_WEIGHT_IN_BACKPACK) {
            if (!checkProductInBackpack(i)) {
                inBackPack.add(productList.get(i));
                productList.get(i).ProductInBackpack();
                currentWeightInBackPack += inBackPack.get(i).getWeight();
                if (currentWeightInBackPack + productList.get(i + 1).getWeight() > MAX_WEIGHT_IN_BACKPACK){
                    break;
                }
                i++;
            }
        }
    }

    //проверяем продукт в рюкзаке или нет, если нет, добавляем, если рюкзак полный, добавляем в другой рюкзак
    private boolean checkProductInBackpack(int i) {
        return productList.get(i).isProductInBackpack();
    }

    public void setBestPriceAndValue() {
        for (int i = 0; i < productList.size(); i++) {
            productList.get(i).setBestPriceAndWeightRatio();
        }
    }

    public void productListToString() {
        System.out.println();
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + " " + productList.get(i));
        }
    }

    public void backPackToString() {
        System.out.println();
        for (int i = 0; i < inBackPack.size(); i++) {
            System.out.println((i + 1) + " " + inBackPack.get(i));
        }
    }

    public void productListSort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getBestPriceAndWeightRatio(), o1.getBestPriceAndWeightRatio());
            }
        });
    }


}

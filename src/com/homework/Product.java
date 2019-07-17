package com.homework;

public class Product {

    private int price;  // in $
    private int weight; // in kg
    private boolean isProductInBackpack = false;
    private double bestPriceAndWeightRatio;

    public Product(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public void setBestPriceAndWeightRatio() {
        double d = price / (double) weight;
        this.bestPriceAndWeightRatio = d;
    }

    public double getBestPriceAndWeightRatio() {
        return bestPriceAndWeightRatio;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isProductInBackpack() {
        return isProductInBackpack;
    }

    public void ProductInBackpack() {
        this.isProductInBackpack = true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", weight=" + weight + " " + bestPriceAndWeightRatio +
                '}';
    }
}

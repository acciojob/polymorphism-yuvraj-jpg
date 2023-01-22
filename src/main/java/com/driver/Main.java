package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(4, 3);
        p.product(4, 3, 6);
        p.product(3.0, 4.0);
    }

    static class Product {
        public static int product(int x, int y) {
            return x * y;
        }

        public static int product(int x, int y, int z) {
            return x * y * z;
        }

        public static double product(double x, double y) {

            return x * y;
        }

    }
}
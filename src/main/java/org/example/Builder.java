package org.example;

public class Builder {

    String name = "Builder";
    double date;
    int count;

    public Builder(String string, double v, int i) {
        StringBuilder stringBuilder = new StringBuilder("String",12.12,2);
        System.out.println("Я StringBuilder!");
    }
        Builder(int count) {
         this.count = 7;
        StringBuilder stringBuilder2 = new StringBuilder("String",12.12,2);
        stringBuilder2.date = 7;
        System.out.println("Я StringBuilder!");

      }
      public  Builder(String name) {
        this.name = "String";
        StringBuilder stringBuilder3 = new StringBuilder("String",12.12,2);
        stringBuilder3.name = "Я BuilderString";
        System.out.println("Я StringBuilder!");
    }
}

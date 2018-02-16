package com.company.Question_3;

import java.util.ArrayList;
import java.util.List;

public class Main {



    private List<Car> carsList = new ArrayList<>();

    public Main() {
        System.out.println(populateArrayList());
    }


    public static void main(String[] args) {


        Main main = new Main();
        main.populateArrayList();


    }
        protected void populateArrayList(){

        carsList.add(new Car("Toyota", "Prius", "Red"));
        carsList.add(new Car("Toyota", "Tacoma", "Silver"));
        carsList.add(new Car("Honda", "Civic", "Black"));
        carsList.add(new Car("Honda", "Insight", "Blue"));
        carsList.add(new Car("Tesla", "Model 3", "Grey"));


    }


}



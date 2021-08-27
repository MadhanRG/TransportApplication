package com.company;

public class Main {

    public static void main(String[] args) {

        Train train=new Train();
        train.setTrainName("Brindhavan express");
        System.out.println(train.getTrainName());

        Bike bike=new Bike();
        bike.setBikeName("Ducati");
        System.out.println(bike.getBikeName());
    }
}

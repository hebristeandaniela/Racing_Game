package org.example;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args ) {
        Game game = new Game();
        game.start();

        //Vehicle vehicle1 = new Vehicle();
        //vehicle1.name="Dacia";
        //vehicle1.totalVehicleCount = 1;

        //Vehicle vehicle2 = new Vehicle();
        //vehicle2.name="Lada";
        //vehicle2.totalVehicleCount = 2;

         //System.out.println("Total count from vehicle " + vehicle1.name + ":" + vehicle1.totalVehicleCount);
         //System.out.println("Total count from vehicle " + vehicle2.name + ":" + vehicle2.totalVehicleCount);
         //System.out.println("Total count from Vehicle class: " + Vehicle.totalVehicleCount);



    }
//        Engine autoVehicleEngine = new Engine();
//        autoVehicleEngine.manufacturer="VW";
//
//        AutoVehicle autoVehicle = new AutoVehicle(autoVehicleEngine);
//
//        Engine engine1= new Engine();
//        engine1.manufacturer="Ferrari";
//        engine1.capacity=3000;
//
//        Car carReference = new Car(engine1);
//        //invocarea variabilei
//        carReference.name = "Ferrari";
//        carReference.maxSpeed = 300;
//        carReference.fuelLevel = 60;
//        carReference.mileage = 12.5;
//        carReference.totalTraveledDistance = 0;
//        carReference.damaged = false;
//        carReference.doorCount = 1;
//        carReference.color = "Red";
//
//        System.out.println("Engine capacity: " + engine1.capacity);
//        System.out.println("Car engine capacity: " + carReference.engine.capacity);
//
//        engine1.capacity=4000;
//        System.out.println("Car engine capacity after update: " + carReference.engine.capacity);
//
//
//        //concatenare
//        System.out.println("Properties of car " + carReference.name);
//        System.out.println("Max speed: " + carReference.maxSpeed);
//        System.out.println("Fuel level: " + carReference.fuelLevel);
//        System.out.println("Mileage: " + carReference.mileage);
//        System.out.println("Total Traveled Distance: " + carReference.totalTraveledDistance);
//        System.out.println("Damaged: : " + carReference.damaged);
//        System.out.println("Door Count: " + carReference.doorCount);
//        System.out.println("Color: " + carReference.color);
//        System.out.println(carReference);
//
//        Car car2 = new Car(new Engine());
//        car2.name = "Audi";
//        car2.fuelLevel = 70;
//        car2.maxSpeed = 300;
//        car2.mileage = 10;
//        car2.totalTraveledDistance = 100;
//
//        car2.engine.capacity = 2000;
//
//        System.out.println("Properties of car" + car2.name);
//        System.out.println("Max speed: " + car2.maxSpeed);
//        System.out.println("Fuel level: " + car2.fuelLevel);
//        System.out.println("Mileage: " + car2.mileage);
//        System.out.println("Total Traveled Distance: " + car2.totalTraveledDistance);
//        System.out.println("Damaged: : " + car2.damaged);
//        System.out.println("Door Count: " + car2.doorCount);
//        System.out.println("Color: " + car2.color);
//        System.out.println(car2);
//        System.out.println("***********************************************************");
//        double distanceForCar1 = carReference.accelerate(60,1);
//        double distanceForCar2 = car2.accelerate(100, 1);
//        System.out.println("Engine manufacturer before repair:" + carReference.engine.manufacturer);
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Engine manufacturer after repair:" + carReference.engine.manufacturer);
//
//       // System.out.println("Modulo example:");
//        //System.out.println(4 % 2);
//       // System.out.println(4 % 3);
//        //if(4 %2 ==0){
//        //System.out.println("4 is an even number");
//        //}
//    }
}


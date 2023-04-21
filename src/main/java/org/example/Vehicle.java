package org.example;

//"is-a" relationship (inheritance)
public class Vehicle {
    String name;
    double fuelLevel; //combustibil
    double mileage; //consum mediu
    double totalTraveledDistance; //distanta parcursa
    double maxSpeed; //viteza maxima
    boolean damaged; //masina stricata? true or false
    String color;

    public double accelerate(double speed, double durationInHours){
        System.out.println(name + "is accelerating with " + speed + "km/h for" + durationInHours + "h");
    double distance = speed * durationInHours;
    totalTraveledDistance += distance;
        System.out.println("Total traveled distance for vehicle" + name + ":" + totalTraveledDistance);
        double usedFuel = distance * mileage / 100;
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle" + name + ":" + fuelLevel);

        return distance;
    }

}

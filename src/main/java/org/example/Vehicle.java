package org.example;

//"is-a" relationship (inheritance)
public class Vehicle {
    // class variable (static variable)
    static int totalVehicleCount;


    //instance variables
    String name;
    double fuelLevel; //combustibil
    double mileage; //consum mediu
    double totalTraveledDistance; //distanta parcursa
    double maxSpeed; //viteza maxima
    boolean damaged; //masina stricata? true or false
    String color;

    public Vehicle() {
        totalVehicleCount++;
    }

    public double accelerate(double speed, double durationInHours){
        if(fuelLevel<=0 ||damaged){
            System.out.println("You cannot accelerate.");
            return 0;
        }

       if(speed > maxSpeed){
           System.out.println("Max speed exceeded.");
           return 0;
       }else if(speed==maxSpeed){
           System.out.println("Careful, max speed reached.");
        }else{
           System.out.println("Valid speed entered.");
       }

        System.out.println(name + "is accelerating with " + speed + "km/h for" + durationInHours + "h");
        double distance = speed * durationInHours;
        totalTraveledDistance += distance;
        System.out.println("Total traveled distance for vehicle" + name + ":" + totalTraveledDistance);
        double mileageMultiplayer = 1;

        if(speed > 120){
            mileageMultiplayer = speed/100;
        }
        double usedFuel = distance * mileage * mileageMultiplayer / 100;

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle" + name + ":" + fuelLevel);

        return distance;
    }

}

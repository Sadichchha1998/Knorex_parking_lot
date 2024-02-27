package com.knorex.MainP;

public class Main {

    public static void main(String[] args) throws ParkingFullException {
        
        ParkingLot parkingLot = new ParkingLot(2);
        
        // Park cars
        Vehicle car1 = new Vehicle("MH01-1234", VehicleType.CAR);
        ParkingTicket ticket1 = parkingLot.park(car1);
        
        Vehicle car2 = new Vehicle("MH02-5678", VehicleType.CAR); 
        ParkingTicket ticket2 = parkingLot.park(car2);

        // Park bike
        Vehicle bike = new Vehicle("MH05-3456", VehicleType.BIKE);
        ParkingTicket ticket3 = parkingLot.park(bike);
        
        // Parking full
        try {
            Vehicle car3 = new Vehicle("RJ11-2345", VehicleType.CAR); 
            ParkingTicket ticket4 = parkingLot.park(car3);
        } catch (ParkingFullException e) {
            System.out.println("Parking is full!"); 
        }
        
        // Remove car1
        double fees1 = parkingLot.remove(ticket1);
        System.out.println("Fees collected for MH01-1234: " + fees1);
        
        //Remove bike 
        double fees2 = parkingLot.remove(ticket3);
        System.out.println("Fees collected for MH05-3456: " + fees2);
        
    }

}
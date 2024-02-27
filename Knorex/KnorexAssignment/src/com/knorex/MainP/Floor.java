package com.knorex.MainP;

import java.util.HashMap;
import java.util.Map;

class Floor {
	  
	  private int floorNumber;
	  private Map<VehicleType, Integer> slots = new HashMap<>();
	  
	  public Floor(int floorNumber) {
	    this.floorNumber = floorNumber;
	  }
	  
	  public boolean hasAvailability(VehicleType vehicleType) {
	    Integer capacity = slots.get(vehicleType);
	    return capacity == null || capacity > 0; 
	  }
	  
	  public void takeSlot(VehicleType vehicleType) {
	    Integer capacity = slots.get(vehicleType);
	    if (capacity == null) {
	      capacity = 0;
	    }
	    slots.put(vehicleType, capacity - 1);
	  }
	  
	  public void freeSlot(VehicleType vehicleType) {
	    Integer capacity = slots.get(vehicleType);
	    if (capacity == null) {
	      capacity = 0; 
	    }
	    slots.put(vehicleType, capacity + 1);    
	  }
	}

package com.knorex.MainP;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {

	  private int numFloors;
	  private List<Floor> floors = new ArrayList<>();
	  private List<ParkingTicket> tickets = new ArrayList<>();
	  
	  private CostStrategy costStrategy;
	  
	  public ParkingLot(int numFloors, CostStrategy costStrategy) {
	    this.numFloors = numFloors;
	    this.costStrategy = costStrategy;
	    
	    // Initialize floors
	    for(int i = 0; i < numFloors; i++) {
	      floors.add(new Floor(i)); 
	    }
	  }
	  public ParkingLot(int i) {
		// TODO Auto-generated constructor stub
	}
	private int capacity;
	    
	    public ParkingTicket park(Vehicle vehicle) throws ParkingFullException {
	        
	        if(isFull()) {
	            throw new ParkingFullException("Sorry, parking is full!"); 
	        }
			return null;
	        
	        // issue ticket
	        
	    }
	    
	    private boolean isFull() {
			return false;
	      // check capacity 
	    }
	  
	  public ParkingTicket parkVehicle(Vehicle vehicle) {
	    // Find available slot
	    Floor floor = null;
	    for(Floor f : floors) {
	      if (f.hasAvailability(vehicle.getType())) {
	        floor = f;
	        break;
	      }
	    }
	    
	    if (floor == null) {
	      throw new RuntimeException("Parking full!");
	    }
	    
	    int slotNumber = floors.indexOf(floor); 
	    floor.takeSlot(vehicle.getType());
	    
	    ParkingTicket ticket = new ParkingTicket(vehicle, floor, slotNumber); 
	    tickets.add(ticket);
	    
	    return ticket;
	  }
	  
	  public double removeVehicle(ParkingTicket ticket) {
	    Floor floor = ticket.getFloor();
	    floor.freeSlot(ticket.getVehicle().getType());
	    
	    double amount = costStrategy.getCost(
	        ticket.getVehicle().getType(), 
	        ticket.getDurationParked()
	    );
	    
	    tickets.remove(ticket);
	    return amount; 
	  }

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}

	public List<ParkingTicket> getTickets() {
		return tickets;
	}

	public void setTickets(List<ParkingTicket> tickets) {
		this.tickets = tickets;
	}

	public CostStrategy getCostStrategy() {
		return costStrategy;
	}

	public void setCostStrategy(CostStrategy costStrategy) {
		this.costStrategy = costStrategy;
	}
	public double remove(ParkingTicket ticket1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	  
	
	  
	}

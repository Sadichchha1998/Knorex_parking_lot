package com.knorex.MainP;

class ParkingTicket {
	  
	  private Vehicle vehicle;
	  private long entryTime;
	  private Floor floor;
	  private int slotNumber;
	  
	  public ParkingTicket(Vehicle vehicle, Floor floor, int slotNumber) {
	    this.vehicle = vehicle;
	    this.floor = floor;
	    this.slotNumber = slotNumber;
	    this.entryTime = System.currentTimeMillis();
	  }
	  
	  public long getDurationParked() {
	    return (System.currentTimeMillis() - entryTime) / 3600000; // in hours
	  }
	  
	  public Vehicle getVehicle() {
	    return vehicle;
	  }

	public long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getTicketNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	
	
	  
	}

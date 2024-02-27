package com.knorex.MainP;

class Vehicle {
	  private String registrationNumber;
	  private VehicleType type;
	  
	  public Vehicle(String registrationNumber, VehicleType type) {
	    this.registrationNumber = registrationNumber;
	    this.type = type;
	  }

	public Vehicle(String regNo, String type2) {
		// TODO Auto-generated constructor stub
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}
	  
	  
	  
	  
	}
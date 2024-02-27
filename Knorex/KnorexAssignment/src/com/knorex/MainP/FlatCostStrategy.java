package com.knorex.MainP;

class FlatCostStrategy implements CostStrategy {
	  
	  private CurrencyType currency;
	  
	  public FlatCostStrategy(CurrencyType currency) {
	    this.currency = currency; 
	  }

	  public double getCost(VehicleType vehicleType, int hoursParked) {
	    switch(vehicleType) {
	      case BIKE: 
	        return currency == CurrencyType.INR ? 10 * hoursParked : 0.5 * hoursParked;
	      case CAR:
	        return currency == CurrencyType.INR ? 20 * hoursParked : 1 * hoursParked;
	      case BUS: 
	      case TRUCK:
	        return currency == CurrencyType.INR ? 30 * hoursParked : 1.5 * hoursParked;    
	    }
	    return 0;
	  }

	@Override
	public double getCost(VehicleType vehicleType, long l) {
		// TODO Auto-generated method stub
		return 0;
	}
	}

package com.nttdata.reto.builder;

public class VehicleBuilder implements CarBuilder {
	private String engine;
	private int wheel;
	private int airbags;

	public String getEngine() 
	{
		return this.engine;
	}

	public int getWheel() 
	{
		return this.wheel;
	}

	public int getAirbags()
	{
		return this.airbags;
	}

	public VehicleBuilder(){
		
	}

	public VehicleBuilder(String eng, int wh)
	{
		this.engine = eng;
		this.wheel = wh;
	}
	
	public VehicleBuilder(String eng, int wh, int air)
	{
		this.engine = eng;
		this.wheel = wh;
		this.airbags = air;
	}
	
	public void setAirbags(int airbags) 
    {
      this.airbags = airbags;
    }
	
	public void setEngine(String eng) 
    {
      this.engine = eng;
    }
	
	public void setWheel(int wh) 
    {
      this.wheel = wh;
    }
	
	@Override
    public VehicleBuilder build(){
        VehicleBuilder car = new VehicleBuilder();
        car.setEngine(this.engine);
        car.setWheel(this.wheel);
        car.setAirbags(this.airbags);
       
        return car;
    }
}

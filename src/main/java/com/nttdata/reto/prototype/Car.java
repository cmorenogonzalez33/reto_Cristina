package com.nttdata.reto.prototype;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {
	private List<String> carList;
	  
	  public Car() 
	  {
	    this.carList = new ArrayList<String>();
	  }
	  
	  public Car(List<String> list) 
	  {
	    this.carList = list;
	  }
	  
	  public void insertData()
	  {
	    carList.add("Honda");
	    carList.add("Audi");
	    carList.add("Hyundai");
	    carList.add("Ford");
	    carList.add("Renault");
	  }
	  
	  public List<String> getCarList() 
	  {
	    return this.carList;
	  }
	  
	  @Override
	  public Object clone() throws CloneNotSupportedException 
	  {
	    List<String> tempList = new ArrayList<String>();
	    
	    for(String s : this.getCarList()) 
	    {
	      tempList.add(s);
	    }
	    
	    return new Car(tempList);
	  }

}

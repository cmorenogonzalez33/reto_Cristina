package com.nttdata.reto.singleton;

public class Singleton {
	private static String cadena;
	  
	  private static Singleton instance; 
	  
	  private Singleton(String cad)
	  {
		  cadena = cad;
	  }
	  public static Singleton getInstance(String cad) 
	  {
	    if(instance == null) 
	    {
	      instance = new Singleton(cad);
	    }
	    return instance;
	  }
}

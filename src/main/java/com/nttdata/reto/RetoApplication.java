package com.nttdata.reto;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.reto.builder.VehicleBuilder;
import com.nttdata.reto.prototype.Car;
import com.nttdata.reto.singleton.Singleton;

@SpringBootApplication
public class RetoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("");
		System.out.println("Patrón de Diseño Singleton");
		String cade = "prueba";
		String caden = "prueba2";
	    Singleton instance = Singleton.getInstance(cade);
	    System.out.println(instance);
	    System.out.println("");
	    Singleton instance1 = Singleton.getInstance(caden); 
	    System.out.println(instance1);
	    System.out.println("Sólo tenemos una instancia de la clase");
	    System.out.println("");
	    
	    System.out.println("Patrón de Diseño Prototype");
	    Car a = new Car();
	    a.insertData();
	    
	    Car b = (Car) a.clone();
	    List<String> list = b.getCarList();
	    list.add("Honda new Amaze");
	    
	    System.out.println("Imprimo la lista de modelos del coche inicial");
	    System.out.println(a.getCarList());
	    System.out.println("");
	    System.out.println("Imprimo la lista de modelos del coche clonado con el añadido");
	    System.out.println(list);
	    System.out.println("");
	    b.getCarList().remove("Audi");
	    System.out.println("Imprimo la lista de modelos del coche clonado al que le he eliminado uno");
	    System.out.println(list);
	    System.out.println("");
	    System.out.println("Imprimo la lista de modelos del coche inicial");
	    System.out.println(a.getCarList());
	    System.out.println("");
	    
	    System.out.println("Patrón de Diseño Builder");
	    VehicleBuilder car = new VehicleBuilder("1500cc", 4);
	    car.setAirbags(4);
	    car.build();
	    VehicleBuilder bike = new VehicleBuilder("250cc", 2).build();
	    
	    System.out.println("Construyo un coche:");
	    System.out.println("El motor del coche es: " +car.getEngine());
	    System.out.println("El coche tiene " + car.getWheel() + " ruedas.");
	    System.out.println("El número de airbags del coche es: " + car.getAirbags());
	    
	    System.out.println("");
	    System.out.println("Creo una motocicleta:");
	    System.out.println("El motor de la motocicleta es " + bike.getEngine());
	    System.out.println("La motocicleta tiene " + bike.getWheel() + " ruedas.");
	    System.out.println("La motocicleta tiene " + bike.getAirbags() + " airbags.");
	}

}

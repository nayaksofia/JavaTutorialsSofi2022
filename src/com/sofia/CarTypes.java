package com.sofia;

class Car{
	
	//Step-1: Declare instance variable / fields
	
	private String type;
	private String model;
	private String color;
	private int speed;
	
	//Step-2: Generate Non-Parameterised Constructor
	
	public Car() {
		
	}

	//Step-3: Generate Parameterised Constructor
	
	public Car(String type, String model, String color) {
		
		this.type = type;
		this.model = model;
		this.color = color;
		
	}
	//Step-4: Generate Getter And Setter 
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//Step-5 : Generate ToString Method
	@Override
	public String toString() {
		return "Car [type=" + type + ", model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}
	
	

	//Step-6 :Define Method increaseSpeed()
	public int increaseSpeed(int increment) {
		if(increment > 0) {
			this.speed += increment;
		}else {
			System.out.println("Increment can't be negative.");
		}
		return this.speed;
		
	}
	
	//Step-7 :Define Method decreaseSpeed()
	public int decreaseSpeed(int decrement) {
		if(decrement > 0 && decrement <= this.speed) {
			this.speed -= decrement;
		}else {
			System.out.println("Decrement can't be negative or greater than current speed");
		}
		return this.speed;
	}
		
	//Step-8 :Define Method playMusic()
	public void playMusic() {
		System.out.println("Ok Google..Play the music...");
	}
		
	//Step-9 :Define Method stopMusic()
	public void stopMusic() {
		System.out.println("Ok Google..Stop the music...");
	}
		
	
}
public class CarTypes {

	public static void main(String[] args) {
		
	//Step-10: Instantiate objects of class Car
		Car carFocus = new Car("Ford", "Focus" ,"Red");
		Car carAuris = new Car ("Toyota", "Auris","Blue");
		Car carGolf = new Car ("Volkswagen","Golf","Green");
		
	//For Object-1:: carFocus	
		System.out.println(carFocus.toString());
		int IsF = carFocus.increaseSpeed(19);
		int DsF = carFocus.decreaseSpeed(10);
		System.out.println("Increase Speed of Ford :: " + IsF);
		System.out.println("Decrease Speed of Ford :: " + DsF);
		carFocus.playMusic();
		carFocus.stopMusic();
		
		
		System.out.println("----------------------------------------------------");
		
	//For Object-2:: carAuris	
		System.out.println(carAuris.toString());
		int IsA = carAuris.increaseSpeed(40);
		int DsA = carAuris.decreaseSpeed(10);
		System.out.println("Increase Speed of Toyota :: " + IsA);
		System.out.println("Decrease Speed of Toyota :: " + DsA);
		carAuris.playMusic();
		carAuris.stopMusic();
		
		System.out.println("----------------------------------------------------");
		
	//For Object-3:: carGolf
		System.out.println(carGolf.toString());
		int IsG = carGolf.increaseSpeed(80);
		int DsG = carGolf.decreaseSpeed(30);
		System.out.println("Increase Speed of Toyota :: " + IsG);
		System.out.println("Decrease Speed of Toyota :: " + DsG);
		carGolf.playMusic();
		carGolf.stopMusic();
				
		System.out.println("----------------------------------------------------");
					
		

	}

}

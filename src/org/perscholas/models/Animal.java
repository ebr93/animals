package org.perscholas.models;

public class Animal {
	private String name;
	private String movement;
	private short weight;
	private String diet;
	
	public Animal(String name, String movement, short weight, String diet) {
		this.name = name;
		this.movement = movement;
		this.weight = weight;
		this.diet = diet;
	}

	public void printAnimalInformation() {
		System.out.printf("Animal: %s Movement: %s Diet: %s %n", this.name, this.movement, this.diet);
	}
	
	@Override
	public String toString() {
		return String.format("%s moves by using %s. It is a %s", this.name, this.movement, this.diet);
	}



	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getMovement() {
		return movement;
	}

	
	public void setMovement(String movement) {
		this.movement = movement;
	}

	
	public short getWeight() {
		return weight;
	}

	
	public void setWeight(short weight) {
		this.weight = weight;
	}


	public String getDiet() {
		return diet;
	}
	
	public void setDiet(String diet) {
		this.diet = diet;
	}
	
	
	
	
}

package org.perscholas.models;

import org.perscholas.Movement;

public class Marine extends Animal {
	private String waterType;

	public Marine(String name, short weight, String diet, String waterType) {
		super(name, Movement.fins.toString(), weight, diet);
		this.waterType = waterType;
	}
	
	public Marine(String name, String movement, short weight, String diet, String waterType) {
		super(name, movement, weight, diet);
		this.waterType = waterType;
	}
	
	@Override
	public void printAnimalInformation() {
		System.out.printf("Animal: %s Movement: %s Biome: %s water %n", super.getName(), super.getMovement(), this.waterType);	
	}

	@Override
	public String toString() {
		return String.format("The %s is an animal that lives in %s water. It uses its %s to move.", super.getName(), this.waterType, super.getMovement());
	}

	public String getWaterType() {
		return waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}
}

package org.perscholas.models;

import org.perscholas.Movement;

public class Avian extends Animal {
	private short wingSpan;
	private String beakShape;

	public Avian(String name, short weight, String diet, short wingSpan, String beakShape) {
		super(name, Movement.wings.toString(), weight, diet);
		this.wingSpan = wingSpan;
		this.beakShape = beakShape;
	}
	
	public Avian(String name, String movement, short weight, String diet, short wingSpan, String beakShape) {
		super(name, movement, weight, diet);
		this.wingSpan = wingSpan;
		this.beakShape = beakShape;
	}
	
	@Override
	public void printAnimalInformation() {
		System.out.printf("Animal: %s Movement: %s Wingspan: %d Beak: %s %n", super.getName(), super.getMovement(), this.wingSpan, this.beakShape);	
	}


	@Override
	public String toString() {
		return String.format("The %s is a bird that has a wingspan of %d cm. It has a %s beak.", super.getName(), this.wingSpan, this.beakShape);
	}


	public short getWingSpan() {
		return wingSpan;
	}

	
	public void setWingSpan(short wingSpan) {
		this.wingSpan = wingSpan;
	}

	
	public String getBeakShape() {
		return beakShape;
	}

	
	public void setBeakShape(String beakShape) {
		this.beakShape = beakShape;
	}
}

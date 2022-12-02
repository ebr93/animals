package org.perscholas.models;

import org.perscholas.Movement;

public class Terrestrial extends Animal {
	private short legsAmount;

	public Terrestrial(String name, short weight, String diet, short legsAmount) {
		super(name, Movement.legs.toString(), weight, diet);
		this.legsAmount = legsAmount;
	}
	
	public Terrestrial(String name, String movement, short weight, String diet, short legsAmount) {
		super(name, movement, weight, diet);
		this.legsAmount = legsAmount;
	}

	@Override
	public void printAnimalInformation() {
		System.out.printf("Animal: %s Movement: %s Legs: %d  %n", super.getName(), super.getMovement(), this.legsAmount);	
	}

	@Override
	public String toString() {
		return String.format("The %s is a terrestrial animal with %d legs. It is a %s", super.getName(), this.legsAmount, this.getDiet());
	}

	public short getLegsAmount() {
		return legsAmount;
	}

	public void setLegsAmount(short legsAmount) {
		this.legsAmount = legsAmount;
	}
}

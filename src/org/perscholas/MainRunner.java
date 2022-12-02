package org.perscholas;

import org.perscholas.models.Avian;
import org.perscholas.models.Marine;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine anglerfish = new Marine("anglerfish", (short)15, "carnivore", "salt");
		anglerfish.printAnimalInformation();
		System.out.println(anglerfish.toString());
		
		System.out.println("-------------");

		
		Marine octopus = new Marine("octopus", "tentacles", (short)20, "carnivore", "salt");
		octopus.printAnimalInformation();
		System.out.println(octopus.toString());
		
		System.out.println("-------------");

		
		Avian goldenEagle = new Avian("Golden Eagle", (short)25, "carnivore", (short)185, "Raptorial");
		goldenEagle.printAnimalInformation();
		System.out.println(goldenEagle.toString());
	}

}

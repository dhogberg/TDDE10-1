package npc;

import the_adventure.Player;

public class Torbjorn extends Human {
	
	
	public Torbjorn(String name, Player player) {
		super(name, player);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void interactWith(Player player) {
		System.out.printf("I am you course admin...\n");

	}
	
	@Override
	public void observe() {
		System.out.printf("%s is standing, lurking in the shadows...\n", this.getName());
	}
	
	

}

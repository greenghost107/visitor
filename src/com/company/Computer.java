package com.company;

import java.util.ArrayList;

public class Computer{
	
	private ArrayList<ComputerPart> items = new ArrayList<>();
	
	public Computer()
	{
		items.add(new Screen());
		items.add(new Keyboard());
		items.add(new Mouse());
	}
	
	public void visitParts(Visitor visitor){
		items.forEach(i->i.accept(visitor));
		System.out.println("Visited Computer");
	}
	
}

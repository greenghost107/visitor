package com.company;

public class Mouse implements ComputerPart {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String printPart(){
		return "Visiting Mouse";
	}
}

package example;

public class Keyboard implements ComputerPart{
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String printPart(){
		return "Visiting Keyboard";
	}
}

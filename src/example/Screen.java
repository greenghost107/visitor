package example;

public class Screen implements ComputerPart {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String printPart(){
		return "Visiting Screen";
	}
}

package example;

public interface Visitor {

	public void visit(Screen screen);
	
	public void visit(Keyboard keyboard);
	
	public void visit(Mouse mouse);
	
	

}

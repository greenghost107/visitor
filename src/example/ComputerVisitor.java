package example;

public class ComputerVisitor implements Visitor {
	@Override
	public void visit(Screen screen) {
		System.out.println(screen.printPart());
	}
	
	@Override
	public void visit(Keyboard keyboard) {
		System.out.println(keyboard.printPart());
	}
	
	@Override
	public void visit(Mouse mouse) {
		System.out.println(mouse.printPart());
	}
}

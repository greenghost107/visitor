package example;

public class Main{

    public static void main(String[] args) {
	// write your code here
        Computer computer = new Computer();
        computer.visitParts(new ComputerVisitor());
        
    }
}

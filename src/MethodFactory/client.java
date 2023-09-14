package MethodFactory;

public class client {

	public static void main(String[] args) {
		
		AbsFactoryclass[] factory = {
				new ConcreteFactoryA(),
				new ConcreteFactoryB()
		};
		
		IProduct ProductA = factory[0].createOperation();
		IProduct ProductB =  factory[1].createOperation();
		
		
	}

}

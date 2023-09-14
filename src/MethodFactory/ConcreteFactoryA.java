package MethodFactory;

public class ConcreteFactoryA extends AbsFactoryclass{

	@Override
	protected IProduct createProduct() {
		return new ConcreteProductA();
	}

}

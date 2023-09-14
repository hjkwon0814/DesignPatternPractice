package MethodFactory;

public class ConcreteFactoryB extends AbsFactoryclass{

	@Override
	protected IProduct createProduct() {
		return new ConcreteProductB();
	}

}

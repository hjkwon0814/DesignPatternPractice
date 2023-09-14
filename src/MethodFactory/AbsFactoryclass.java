package MethodFactory;

abstract class AbsFactoryclass {
	
	final IProduct createOperation() {
		IProduct iProduct = createProduct();
		iProduct.setting();
		return iProduct;
	}
	
	abstract protected IProduct createProduct();
}

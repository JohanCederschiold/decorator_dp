package car_decorator.decorator;

public class V8Engine extends CarDecorator {

	public V8Engine(Car temporaryCar) {
		super(temporaryCar);
	}
	
	@Override
	public String getDescription() {
		return temporaryCar.getDescription() + " : V8 Engine with 392 BHP";
	}

	@Override
	public double getCost() {
		return temporaryCar.getCost() + 55000;
	}

}

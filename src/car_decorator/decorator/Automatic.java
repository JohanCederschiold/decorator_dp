package car_decorator.decorator;

public class Automatic extends CarDecorator {

	public Automatic(Car temporaryCar) {
		super(temporaryCar);
	}
	
	@Override
	public String getDescription() {
		return temporaryCar.getDescription() + " : Automatical 7 speed gearbox";
	}

	@Override
	public double getCost() {
		return temporaryCar.getCost() + 13200;
	}

}

package car_decorator.decorator;

public class Sunroof extends CarDecorator {

	public Sunroof(Car temporaryCar) {
		super(temporaryCar);
	}
	
	@Override
	public String getDescription() {
		return temporaryCar.getDescription() + " : Electrical Sunroof";
	}

	@Override
	public double getCost() {
		return temporaryCar.getCost() + 27500;
	}

}

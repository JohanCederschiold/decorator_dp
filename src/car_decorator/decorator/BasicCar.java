package car_decorator.decorator;

public class BasicCar implements Car {
	
	@Override
	public String getDescription() {
		return "Four wheels : Steering wheel";
	}

	@Override
	public double getCost() {
		return 150000;
	}

}

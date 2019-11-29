package car_decorator.decorator;

public class Main {
	
	public static void main(String[] args) {
		
		
		Car myNewCar = new Sunroof(new Automatic(new BasicCar()));
		
		System.out.println(myNewCar.getDescription());
		System.out.println(myNewCar.getCost());
		
		
		Car myCar = new BasicCar();
		myCar = new Sunroof(myCar);
		
		System.out.println("With " + myCar.getDescription() + " my new car will cost " + myCar.getCost());
		
		
	}

}

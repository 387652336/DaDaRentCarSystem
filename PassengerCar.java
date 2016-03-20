package imooc.src.car.rental;

public class PassengerCar extends Car {
	private int carCapacity;
	public PassengerCar(String carName, int Rent, int carCapacity) {
		this.carName = carName;
		this.Rent = Rent;
		this.setCarCapacity(carCapacity);
	}
	public int getCarCapacity() {
		return carCapacity;
	}
	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}
}

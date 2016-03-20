package imooc.src.car.rental;

public class Pickup extends Car {
	private int carCapacity;
	private int carCargo;
	public Pickup(String carName, int Rent, int carCapacity, int carCargo) {
		this.carName = carName;
		this.Rent = Rent;
		this.setCarCapacity(carCapacity);
		this.carCargo = carCargo;
	}
	public int getCarCargo() {
		return carCargo;
	}
	public void setCarCargo(int carCargo) {
		this.carCargo = carCargo;
	}
	public int getCarCapacity() {
		return carCapacity;
	}
	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}
}

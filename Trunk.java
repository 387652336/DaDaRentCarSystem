package imooc.src.car.rental;

public class Trunk extends Car {
	private int carCargo;
	public Trunk(String carName, int Rent, int carCargo) {
		// TODO Auto-generated constructor stub
		this.carName = carName;
		this.Rent = Rent;
		this.carCargo = carCargo;
	}
	public int getCarCargo() {
		return carCargo;
	}
	public void setCarCargo(int carCargo) {
		this.carCargo = carCargo;
	}

}

package imooc.src.car.rental;

public abstract class Car {
	public String carName;
	int Rent;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getRent() {
		return Rent;
	}
	public void setRent(int rent) {
		Rent = rent;
	}
}


public class Vehicle implements Loan,Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	@Override
	public double takeInsurance() {
		double insuranceAmount=0;
		if(price <= 150000)
			insuranceAmount = 3500;
		else if(price <= 300000 && price > 150000)
			insuranceAmount = 4000;
		else if(price > 300000)
			insuranceAmount = 5000;
		return insuranceAmount;
	}
	
	@Override
	public double issueLoan() {
		double loanAmount=0;
		if(vehicleType.equals("4 wheeler"))
			loanAmount = price * 80/100;
		else if(vehicleType.equals("3 wheeler"))
			loanAmount = price * 75/100;
		else if(vehicleType.equals("2 wheeler"))
			loanAmount = price * 50/100; 
		return loanAmount;
	}


}

package fall2020.FinalProject1;

public class Package {
	
	private double weight;
	private String description;
	private double distance;
	private Address address;
	private final static double BASEPRICE = 5.0;

	private double shippingCharge1;
	private static double shippingCharge2;
	
	public Package(double w, String s, double d, Address a) throws MissingDataException {
		this.weight = w;
		this.description = s;
		this.distance = d;
		this.address = new Address(a);
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static double calculateShippingCharges(double weight ) {
		double shippingCharge1 = 0;
		
			
		if(weight<=10)
		{
		shippingCharge1 = 2.50;
		}

		else if (weight <=20)
		{
		shippingCharge1 = 5.50;

		}

		else if (weight <=30)
		{
		shippingCharge1 = 8.50;

		}

		else if (weight <=40)
		{
		shippingCharge1 = 11.50;

		}

		else if (weight <=50)
		{
		shippingCharge1 = 14.50;
		}

		return shippingCharge1;
		}

	public static double calculateShippingChargesDistance(double distance ) {
		
		
			
		if(distance <=10)
		{
		shippingCharge2 = 0.00;
		}

		else if (distance <=100)
		{
		shippingCharge2 = 2.50;

		}

		else if (distance <=500)
		{
		shippingCharge2 = 10.50;

		}

		else if (distance <=1000)
		{
		shippingCharge2 = 20.50;

		}

		else if (distance <= 5000)
		{
		shippingCharge2 = 50.50;
		}
		
		else
		{
			shippingCharge2 = 60.50;
		}

		return shippingCharge2;
		}
	

	public static double getTotal(double shippingCharge1, double shippingCharge2) {
		double total = shippingCharge1+ shippingCharge2 + BASEPRICE;
		return total;
	}
}

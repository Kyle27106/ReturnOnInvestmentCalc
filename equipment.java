public class equipment {
	private String brandName;
	private double gain;
	private double cost;
	
	public equipment(String brandName, double gain, double cost) {
		this.brandName = brandName;
		this.gain = gain;
		this.cost = cost;
		
	}
	
	public double getROI() {
		return (gain-cost) / cost;
		
	}

	public String toString() {
		return "Brand Name: " + brandName + "\n" +
				"Gain: " + gain + "\n" +
				"Cost: " + cost + "\n" +
				"Return on Investment:" + getROI() + "\n";
	}
}

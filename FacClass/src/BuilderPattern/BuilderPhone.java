package BuilderPattern;

public class BuilderPhone {
	
	private String OS;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public BuilderPhone setOS(String oS) {
		OS = oS;
		return this;
	}
	public BuilderPhone setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public BuilderPhone setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public BuilderPhone setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public BuilderPhone setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	
	public Phone getPhone()
	{
		return new Phone(OS, ram, processor, screenSize, battery);
	}
	

}

package BuilderPattern;

public class Shop {
	public static void main(String[] args) {
		System.out.println("First Commit");
		Phone obj = new BuilderPhone().setBattery(1234).setOS("Mukeh").getPhone();
		System.out.println(obj);
	}

}

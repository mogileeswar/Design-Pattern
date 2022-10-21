package Online_trading;

//Buyer class
////Implementation of the person class
public class Buyer extends Person {

	Buyer() {
		super(ProductMenu);
	}
	//To show the appropriate items on the menu according to the need of the buyer
	public void showMenu() {
			System.out.println("Items on the menu for Buyer...")
	}
	// To create a concrete menu according to the product type
	public ProductMenu CreateProductMenu() {
		String test = "Produce";
		if (test.equalsIgnoreCase("Produce")){
			return new Produce();
		}
		return new Meat();
	}

}

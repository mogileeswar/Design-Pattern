package online_trading;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
//facade class of ptbs application

public class Facade implements FacadeImplementation, Reminder{
	//By using this class facade pattern is implemeted
	//facade pattern is used to simplify the implementatio of larger modules using an interface
	// In this application I used facade class as an interface layer to implement the class login,
	//
	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private Facade()
	public static FacadeImplementation getFacadeImplementation()
	{
		return new Facade();
	}

	public boolean login(Login onject) {
		return object.login();
	}

	public void addTrading(TradingMenu TRDMNU) {
		TRDMNU.AddTrading();
	}

	public void viewTrading(TradingMenu TRDMNU, Person p) {

	}

	public void decideBidding(OfferingMenu OFRMNU) {
		OFRMNU.decideBidding();
	}

	public void discussBidding(OfferingMenu OFRMNU) {
		OFRMNU.discussBidding();
	}

	public void submitBidding(OfferingOMenu OFRMNU) {
		OFRMNU.submitBidding();
	}

	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		ProductList PL = new ProductList();
		PL.accept(remind);
	}

	public void createUser(UserInfoItem userInfoItem) {
		userinfoitem.createUser();
	}

	public void createProductList(ProductMenu PRDMNU) {
		PRDMNU.createProductList();
	}

	public void AttachProductToUser(ProductMenu PRDMNU) {
		PRDMNU.AttachProductToTheUser();
	}

	public void SelectProduct(ProductMenu PRDMNU, String userName) {
		PRDMNU.selectProduct(UseName);
	}

	public void productOperation(ProductMenu PRDMNU) {
		PRDMNU.ProductOperation();
	}

}

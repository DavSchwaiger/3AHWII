package ahwi;

import java.util.ArrayList;

import ahwi.DVD.COUNTRYCODE;

public class ShoppinCart {
	public static void main(String[] args) {
		ArrayList<ARTIKEL> shoppingCart = new ArrayList<>();

		DVD item1 = new DVD("Chainsaw Man", 180,COUNTRYCODE.AT, 8.99, 1);
		shoppingCart.add(item1);

		DVD item2 = new DVD("One Piece", 130, COUNTRYCODE.AT, 9.99, 2);
		shoppingCart.add(item2);

	}
}
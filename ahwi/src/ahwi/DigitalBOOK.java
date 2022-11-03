package ahwi;

public class DigitalBOOK extends BOOK{
	
	private int size;

	public DigitalBOOK(String author, String title, int year,double price, double articleNumber, int size) {
		super(author, title, year,price,articleNumber);
		this.size = size;
	
	}

}

package ahwi;

public class BOOK extends ARTIKEL{

		private String author;
		private String title;
		private  int year;
		final double VAT = 0.19;
	
	public BOOK(String author, String title, int year, double price, double articleNumber) {
		super(price,articleNumber);
		this.author = author;
		this.title = title;
		this.year = year;
		
	}
	public double getprice() {
		return super.getPrice() * (1+VAT);
		
	}

}
package ahwi;

public class ARTIKEL{
					
				private double articleNumber;
				private double price;

			public ARTIKEL(double articleNumber, double price) {
				
				this.articleNumber = articleNumber;
				this.setPrice(price);
				
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}
	}

package ahwi;

public class DVD extends ARTIKEL{

				private String name;
				private int duration;
				private enum COUNTRYCODE{DE,AT;};
				private COUNTRYCODE cc;
				private final double VAT = 0.07
						;
				public DVD(String name, int duration, COUNTRYCODE cc, double price, double articleNumber) {
					super(price, articleNumber);
					this.name = name;
					this.duration = duration;
					this.cc = cc;
				
				}
				public double getprice() {
					return super.getPrice() * (1+VAT);
					
				}		
			}
public class Receipt{
	public static void main(String[] args) {
	  printHeader();
	  printItem("Bread", 1500);
	  printvat(225.0);
    System.out.println("Total: " + calculateTotal(1500, 2));
    System.out.println("GrandTotal:" + grandTotal(225.0, 3000));
	

	  	
    printHeader();
	  printItem("Milk", 2500);
	  printvat(562.5);
    System.out.println("Total: " + calculateTotal(2500, 3));
    System.out.println("GrandTotal:" + grandTotal(562.5, 7500));
	}
	
	public static void printHeader() {
	  System.out.println("=====DAVID AND SONS=====");
	}
	
	public static void printItem(String name, int price) {
	  System.out.println("Item: " + name);
	  	System.out.println("Price: " + price);
	}
	
	public static void printvat(double vat){
	System.out.println("VAT:" + vat);
	}
	
	public static double grandTotal(double vat, int calculateTotal){
  return vat + calculateTotal;
	}
	
	public static int calculateTotal(int price, int quantity) {
	  return price * quantity;
	}
}

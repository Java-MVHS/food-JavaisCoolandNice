
/* 
 * Kavin Kumar
 * Period 5
 * 10/25/24
 * FoodTester3.java
 * 
 * 
 * 
*/

public class FoodTester3
 {
	 public FoodTester3()
	 {
		 
	 }
		public static void main (String[]args) //create objects of each food object and give them properties
		{
			System.out.println("\n\n\n");
			Food3 food1 = new Food3 ("baked", "banana", "muffins", 50, 4);
			food1.printForSale();
			Food3 food2 = new Food3 ("fried", "yam", "fritters", 100, 3);
			food2.printForSale();
			Pizza3 pizza = new Pizza3 ("pepperoni","Hawaian", 250, 8);
			pizza.printForSale();
			DeepDishPizza3 ddp = new DeepDishPizza3("extra extra extra cheese");
			ddp.printForSale();
			System.out.println("\n\n\n");;
		}
	}


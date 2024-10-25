/* 
 * Kavin Kumar
 * Period 5
 * 10/25/24
 * Food3.java

 * 
*/

public class Food3
{
	protected String str; // create a string
	
	public Food3 () //create 
	{
		str = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int price, int numOfFood) // overloaded constructor, declare variables and give them value
	{	
		double total=0;
		total = (price*numOfFood/100);
		String str2="";
		str2 = String.format(" Will be sold for %d cents each. With %d %s(s), $%.2f can be made.", price, numOfFood ,name, total);
		
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient + str2;
		
	}

	public void printForSale() //print out str and the values of each food
	{
		System.out.println(str);
	}
	
}



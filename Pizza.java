public class Pizza extends Food
{
	public Pizza(String ingredient, String name) //deep dish
	{
		super("baked", ingredient, name);
		
	}

	public Pizza(String ingredient) //pizza
	{
		super("baked", ingredient, "pizza");
		
	}


}

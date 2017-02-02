package hwassignment2csc300;

public class Driver 
{
	public static void main(String[] args)
	{
		Alist lst = new Alist();
		lst.add("s");
		lst.add("c");
		lst.add("v");
		lst.add("b");
		lst.add("g");
		lst.add("n");
		lst.display();
		lst.removeAtIndex(1);
		try 
		{
		System.out.println(lst.getAtIndex(1));
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		lst.display();
		lst.reverse();
		lst.display();
	}
}

package classes;

import java.util.ArrayList;
import java.util.List;

/*These problems were assigned by Professor Burton Ma at York University*/
public class ModerateProblems {
	/*Recursive sum of even numbers in list method*/
	// computes the last element of the list
	// truncates it to zero if it is not even
	// then deletes that element from the list
	public static int sumEven(List<Integer> t)
	{
		int n = t.get(t.size() - 1); // get the last element
		if (n % 2 != 0)
		{
			n = 0; // if n is not even, change it to 0 so it 
			// does not affect the sum
		}
		if (t.size() == 1)
		{
			return n; // if there is only one element, return it
		}
		return n + sumEven(t.subList(0, t.size() -1)); // recursive call
		// to this method on a sublist ending at the second last element
	}
	/*Recursive method to return all even numbers in the list*/
	public static List<Integer> allEven(List<Integer> t)
	{
		List<Integer> n = new ArrayList<Integer>(); // instantiate an empty list
			// you will be adding the even elements to
		if (t.isEmpty()) // when the passed by list is empty
			// return the list you are adding the even elements to
		{
			return n;
		}
		int element = t.get(t.size() - 1); // get the last element from t
		if (element % 2 == 0)
		{
			// if the number is even
			n.add(element);
		}
		n.addAll(allEven(t.subList(0, t.size() - 1)));
		// make the passd-by list smaller but don't change t
		// do this by calling the recursive method on the sublist of t, where the sublist
		// ends at the second last element (inclusive)
		return n;
	}
	/*Recursive method returns a String by concatenating every second string in t starting
	 * from index idx*/
	public static String everySecond(List<String> t, int idx)
	{
		String returnString = "";
		if (idx >= t.size()) // just return the empty string if the specified index is
			// out of range
		{
			return returnString;
		}
		returnString += t.get(idx); // concatenate String in list to the returnString
		return returnString + everySecond(t, idx + 2); // recursive call to call this method
		// on the element 2 indeces from the current one, i.e. every other element
	}
}

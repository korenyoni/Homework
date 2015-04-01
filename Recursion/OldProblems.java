package classes;

import java.util.List;

/*Recursion problems from 2009, assigned by Professor Burton Ma at York University*/
public class OldProblems {
	/*Recursive method to count letter 'a'*/
	//return the number of occurrences of the letter a
	public static int countA(String s)
	{
		int n = 0;
		if (s.charAt(s.length() - 1) == 'a')
			// if the last character in the passed by String is equal to 'a'
			// then increment the counter by one
		{
			n++;
		}
		if (s.length() == 1)
		{
			return n;
		}
		return n + countA(s.substring(0, s.length() - 1));
	}
	/*Recursive method that checks if a list contains a valid mathematical
	 * expression*/
	// return true if it does, false otherwise
	public static boolean expressionCheck(List<Character> a, int idx)
	{
		boolean result = false;
		// result is by default false
		// it is only true if it meets the conditions of the list
		// based on the current character and the last character
		
		// if the index is out of range, return the boolean value
		if (idx >= a.size())
		{
			return true;
		}
		char testChar = a.get(idx); 
		
		if (idx == 0)
		{
			result = (testChar > 48 && testChar < 58);
			// the first character has to be a number
			// i.e. char that represents 1 to 9
		}
		else if (idx > 0 && idx < a.size() - 1)
			// if the index is greater than 0 but does not refer to the
			// last element
		{
			char lastChar = a.get(idx - 1); //get the last character
			if (testChar > 48 && testChar < 58)
				// char is 1 or 2 or 3 ... or 9
			{
				result = (lastChar == 43 || lastChar == 45);
				// char is '+' or '-'
				// if this character is a number, the last character 
				// has to be a plus or minus sign
			}
			else if (testChar == 43 || testChar == 45)
				// char is '+' or '-'
			{
				result = (lastChar > 48 && lastChar < 58);
				// if this character is a plus or minus sign, 
				// the last character has to be a number
			}
		}
		else if (idx == a.size() - 1)
			// if the index refers to the last element
		{
			result = (testChar > 48 && testChar < 58);
			// the last element has to be a number! (char that represents 1 to 9)
		}
		
		return result && expressionCheck(a, idx + 1);
		// recursive call on a sublist of a which ends on the second last element
		// (inclusive)
	}
	/*Recursive method that checks if list is sorted low to high*/
	// passes by a sublist of the list, which omits the first element from the last
	// call of the method
	// passes by the last first element
	// checks if the first element of the sublist is greater than or equal to
	// the passed by value
	public static boolean sortedCheck(List<Integer> array, int lastElement)
	{
		boolean result = false;
		// the boolean value to return
		// false by default, only changed if the arrayList meets the conditions
		
		if (array.isEmpty())
		{
			return true; // if the sublist is empty, return the boolean value
		}
		int element = array.get(0);
		if (element >= lastElement)
			// is the current first element greater than or equal to
			// the passed by value i.e. the last first element
		{
			result = true; // return true if it is
		}
		
		return result && sortedCheck(array.subList(1, array.size()), element);
		// recursive call using a sublist that omits the first element
		// passes by the element omitted
	}
	/*Recursive that checks the following rules*/
	// string begins with 'a'
	// each 'a' is followed by nothing or an 'a' or "bb"
	// each "bb" is followed by nothing or an 'a'
	public static boolean stringCheck(String s, int idx)
	{
		boolean result = false;
		// the result to return
		// false by default, only true if it meets the conditions of the String
		
		if (idx >= s.length())
		{
			return true;
		}
		char thisChar = s.charAt(idx);
		// the current character
		// initialize last character
		char lastChar;
		boolean bb = (s.length() - idx >= 2) && s.substring(idx, idx + 2).equals("bb"); // used to check if there
		//is a substring "bb" for idx and idx + 1 (inclusive)
		if (idx == 0)
		{
			result = s.charAt(idx) == 'a';
			// the first character must be 'a'
		}
		else if (idx > 0 && idx < s.length() - 1)
		{
			// if we are not at the beginning of the string
			// but there are more characters in the list
			lastChar = s.charAt(idx - 1);
			if (lastChar == 'a')
			{
				result = (thisChar == 'a' || bb);
				// if the last character is an 'a', this char has to be another 'a' or the next two 
				// characters have to be "bb" (but the string needs to have enough room for two more characters)
				if (bb)
				{
					// if the case was that we have "bb", on the next call, skip a character
					idx++;
				}
			}
			else if (lastChar == 'b')
			{
				result = thisChar == 'a';
			}
		}
		else if (idx == s.length() - 1 && idx > 0)
		{
			// if we have reached the end of the string
			// but there is more than one element
			lastChar = s.charAt(idx - 1);
			result = thisChar == 'a' || (thisChar == 'b' && lastChar == 'b');
			// true if the last character is an 'a' or the last two characters nake a substring "bb"
		}
		
		return result && stringCheck(s, idx + 1);
		// recursive call using the same string, but starting at the next character
	}
}

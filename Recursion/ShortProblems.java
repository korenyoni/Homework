package classes;

/*Short problems assigned by Professor Burton Ma at York University*/
public class ShortProblems {
	/*calculate sum of sequence  1,2,3...n*/
	public static int sum(int n)
	{
		if (n == 1)
		{
			return n;
		}
		return n + sum(n -1);
	}
	/*factorial method*/
	//return the factorial of a given integer
	public static long factorial(int n)
	{
		if (n == 1)
		{
			return n;
		}
		return n * factorial(n - 1);
	}
	/*Determine if a number is prime recursively*/
	// precondition: client calls the method using isPrime(x,x)
	public static boolean isPrime(int x, int divisor)
	{
		if (divisor == 1)
		{
			return true;
		}
		else if (x != divisor && x % divisor == 0)
		{
			return false;
		}
		return isPrime(x, divisor -1);
	}
	/*Recursive String reverse method*/
	public static String reverse(String s)
	{
		if (s.length() == 1)
		{
			return s;
		}
		String substring = s.substring(s.length() - 1, s.length());
		return substring + reverse(s.substring(0, s.length() - 1));
	}
	/*Returns every second character from index idx*/
	public static String everySecondChar(String s, int idx)
	{
		String returnString = "";
		if (idx >= s.length() - 2)
		{
			return "" + s.charAt(idx); // if the next recursive call will be out of
			// range for the String, then return the current character as a String
		}
		System.out.println(s.charAt(idx));
		return returnString + everySecondChar(s, idx + 2); // plus two because we are
		// skipping a character
	}
}

package classes;

import java.util.ArrayList;
import java.util.List;

public class OldProblemsTest {
	public static void main(String[] args)
	{
		String test = "androida";
		System.out.println("COUNT CHAR a: " + OldProblems.countA(test));
		List<Character> abc = new ArrayList<Character>();
		abc.add('1');
		abc.add('+');
		abc.add('2');
		abc.add('+');
		abc.add('9');
		System.out.println("EXPRESSION CHECK: " + OldProblems.expressionCheck(abc, 0));
		List<Integer> test2 = new ArrayList<Integer>();
		test2.add(-1);
		test2.add(2);
		test2.add(3);
		test2.add(5);
		test2.add(7);
		System.out.println("SORTED CHECK: " + OldProblems.sortedCheck(test2));
		System.out.println("STRING CHECK: " + OldProblems.stringCheck("aabbabbaaaabb", 0));
	}
}

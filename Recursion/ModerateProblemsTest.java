package classes;

import java.util.ArrayList;
import java.util.List;

public class ModerateProblemsTest {
	public static void main(String[] args)
	{
		List<Integer> t = new ArrayList<Integer>();
		t.add(1);
		t.add(3);
		t.add(4);
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(2);
		List<String> abc = new ArrayList<String>();
		abc.add("hello");
		abc.add("world");
		abc.add("123");
		abc.add("a");
		abc.add("aa");
		System.out.println(ModerateProblems.sumEven(t));
		System.out.println(t);
		System.out.println(ModerateProblems.allEven(t));
		System.out.println(t);
		System.out.println(abc);
	}
}

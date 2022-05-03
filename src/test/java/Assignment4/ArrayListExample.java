package Assignment4;

import java.util.ArrayList;

public class ArrayListExample {

	public void largestString() {

		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Thanks");
		strings.add("For");
		strings.add("Attempting");
		strings.add("A");
		strings.add("Randall");
		strings.add("Reilly");
		strings.add("Coding");
		strings.add("Exercise");

		/*
		 * we will get the length of the 0th index of list and then we will compare with
		 * other elements i.e if new element is greater then the 0th index length then
		 * longest=element
		 */
		String longest = strings.get(0);
		//System.out.println(longest);

		for (String element : strings) {
			if (element.length() > longest.length()) {
				longest = element;
			}
		}
		System.out.println(longest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListExample al = new ArrayListExample();
		al.largestString();

	}

}

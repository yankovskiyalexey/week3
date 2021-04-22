package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {

	public void run() {

		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0)
				break;
			println(addCommasToNumericString(digits));

		}
	}

	public String addCommasToNumericString(String digits) {
		String result = "";
		for (int i = 1; i <= digits.length(); ++i) {
			char ch = digits.charAt(digits.length() - i);
			if (i % 3 == 1 && i > 1) {
				result = "," + result;
			
			}
			result = ch + result;
		}

		return result;
	}

}

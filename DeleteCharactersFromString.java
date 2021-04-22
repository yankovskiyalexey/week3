package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {

	public void run() {
		String strValue = "This is a test";
		// call a method to delete all occurrences
		String newString = removeAllOccurrences(strValue, "e");
		// print the new string value
		println("New String:" + newString);

	}

	private static String removeAllOccurrences(String strValue, String charToRemove) {
		return strValue.replaceAll(charToRemove, "");

	}
}
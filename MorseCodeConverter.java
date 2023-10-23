import java.util.*;

public class MorseCodeConverter {
	public static void convertMorseToEnglish(String[] code, String morseCode) {
		String[] morseWords = morseCode.split(" ");
		System.out.print("Morse code " + morseCode + " to English is ");
		for (String morseWord : morseWords) {
			for (int j = 0; j < code.length; j++) {
				if (morseWord.compareTo(code[j]) == 0) {
					System.out.print((char) (j + 'a') + " ");
					break;
				}
			}
		}
	}

	public static void convertEnglishToMorse(String[] code, String englishText, char[] letter) {
		System.out.print("Morse code of " + englishText + " is ");
		for (int i = 0; i < englishText.length(); i++) {
			for (int j = 0; j < letter.length; j++) {
				if (englishText.charAt(i) == letter[j]) {
					System.out.print(code[j] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5',
				'6', '7', '8', '9', '0' };

		String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
				".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
				"..-", "...-", ".--", "-..-", "-.--", "--..", "|" };

		System.out.print("Enter '1' to convert Morse code to English or '2' to convert English to Morse code: ");
		int choice = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		if (choice == 1) {
			System.out.print("Enter Morse code: ");
			String morseInput = scanner.nextLine();
			convertMorseToEnglish(morseCode, morseInput);
		} else if (choice == 2) {
			System.out.print("Enter English text: ");
			String englishInput = scanner.nextLine().toLowerCase();
			convertEnglishToMorse(morseCode, englishInput, alphabet);
		} else {
			System.out.println("Invalid choice. Please enter '1' or '2'.");
		}
	}
}
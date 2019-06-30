import java.util.Scanner;

public class capstone1 {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Pig Latin Translator!");

		char ch;

		do

		{

			System.out.println("Please enter the Senence:");

			String word = scan.nextLine();
			word = word.toLowerCase();
			String words[] = word.split(" ");

			for (int i = 0; i < words.length; i++)

				System.out.print(pigLatin(words[i]) + " ");

			System.out.println("\nEnter another Sentence to be translated (y/n):");

			ch = scan.next().charAt(0);

			scan.nextLine();

		} while (ch != 'n');
		System.out.println("Good Bye!");
	}

	private static String pigLatin(String word) {

		int vowelIndex = findFirstVowel(word);

		if (vowelIndex == -1)

			return word;

		else if (vowelIndex == 0)

		{

			word = word + "way";

			return word;

		}

		else

		{

			String substr = word.substring(0, vowelIndex);

			word = word.replaceFirst(substr, "");

			word = word.concat(substr) + "ay";

			return word;

		}

	}

	public static int findFirstVowel(String word)

	{

		for (int i = 0; i < word.length(); i++)

		{

			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u')

			{

				return i;

			}

		}

		return -1;

	}

}



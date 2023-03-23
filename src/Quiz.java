public class Quiz {
    public static void main(String[] args)

    {

    }

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/

    public static int numberOfVowels(String line)
    {
        int count = 0;

        for(int i = 0; i < line.length(); i++)
        {
            if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u')
            {
                count++;
            }
        }



        return count;
    }


    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/

    public static int notDivisibleBy235(int number)
    {
        int count = 0;

        while(number > 0)
        {
            if(!(number % 2 == 0 || number % 3 == 0 || number % 5 == 0))
            {
                count++;
            }
            number--;
        }

        return count;
    }


    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/

    public static String camelCaseMe(String phrase)
    {
        String[] splited = new String[0];
        String finalString = "";

        String currString = phrase.replace("-", " ");
        String currString2 = currString.replace("_", " ");
        System.out.println(currString2);

        if(currString2.charAt(0) == " ")
        {
            currString2.
        }

        splited = currString2.split(" ", 0);

        for(String currWord : splited)
        {
            currWord = currWord.substring(0,1).toUpperCase() + currWord.substring(1).toLowerCase();
            finalString = finalString + currWord;
        }

        System.out.println(finalString);

        return finalString;
    }


}
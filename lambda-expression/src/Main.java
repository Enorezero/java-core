import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        TextFileRepository textFileRepository = new TextFileRepository();
        ArrayList<String> entries = textFileRepository.getTextEntries();
        String longestString = getString(entries,(first, second) -> {
            if(first.length() > second.length()){
                return first;
            }
            else return second;
        });
        String stringWithTheMostCapitalLetters = getString(entries, ((first, second) -> {
            Pattern pattern = Pattern.compile("[A-Z]*");
            Matcher matcher = pattern.matcher(first);
            int numberOfCapitalLettersInFirstString = first.length() - matcher.replaceAll("").length();
            matcher = pattern.matcher(second);
            int numberOfCapitalLettersInSecondString = second.length() - matcher.replaceAll("").length();
            if(numberOfCapitalLettersInFirstString > numberOfCapitalLettersInSecondString){
                return first;
            }
            else return second;
        }));

        String stringWithTheMostVowels = getString(entries, ((first, second) -> {
            Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
            Matcher matcher = pattern.matcher(first);
            int numberOfVowelsInFirstString = first.length() - matcher.replaceAll("").length();
            matcher = pattern.matcher(second);
            int numberOfVowelsInSecondString = second.length() - matcher.replaceAll("").length();
            if(numberOfVowelsInFirstString > numberOfVowelsInSecondString){
                return first;
            }
            else return second;
        }));
        System.out.println("Longest string: " + longestString);
        System.out.println("String with the most capital letters: " + stringWithTheMostCapitalLetters);
        System.out.println("String with the most vowels: " + stringWithTheMostVowels);
    }

    public static String getString(ArrayList<String>entries, StringComparator comparator){
        if(entries.isEmpty()){
            return "";
        }
        String result = entries.get(0);
        for (int i = 1; i < entries.size();i++){
            result = comparator.compare(result,entries.get(i));
        }
        return result;
    }

}
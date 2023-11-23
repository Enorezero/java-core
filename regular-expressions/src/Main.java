
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String personValidBaga = "Terekhin; Bogdan; Denisovich; 24.10.2023; 2023; Novo-Nikolsk";
        String personNonValidBaga = "Terekhin; Bogd@n; Denisovich; 243.10.2023; 2023; @ssuriysk";
        System.out.println(isCorrect(personNonValidBaga));

    }

    public static boolean isCorrect(String str){
        String[] words = str.split(";\\s");
        if(words.length != 6){
            //System.out.println("bobre");
            return false;
        }
        String fullnameRegex = "[a-zA-Z]*";
        Pattern pattern = Pattern.compile(fullnameRegex);//Пример работы через классы Pattern и Matcher
        Matcher surnameMatcher = pattern.matcher(words[0]);
        return surnameMatcher.matches() && words[1].matches(fullnameRegex) && words[2].matches(fullnameRegex) &&
                words[3].matches("\\d{2}.\\d{2}.\\d{4}") && words[4].matches("\\d{4}") && words[5].matches("(\\w)*-?(\\w)*");
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>(List.of("an", "band", "band", "abandon"));
        ArrayList<String> arrayList2 =new ArrayList<>(List.of("to", "too", "stool", "tools"));
        ArrayList<String> arrayList3 =new ArrayList<>(List.of("catch", "bobcat", "catchacat", "cat", "at"));
        WordChecker wordChecker = new WordChecker(arrayList);
        WordChecker wordChecker2 = new WordChecker(arrayList2);
        WordChecker wordChecker3 = new WordChecker(arrayList3);
        System.out.println(wordChecker.isWordChain());
        System.out.println(wordChecker2.isWordChain());
        System.out.println(wordChecker3.createList("cat"));
        System.out.println(wordChecker3.createList("catch"));
        System.out.println(wordChecker3.createList("dog"));
    }
}
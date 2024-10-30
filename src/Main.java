import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/WordChecker.txt");
        Scanner scanner = null;
        int count = 0;
        try {
            scanner = new Scanner(file);
        }catch (FileNotFoundException ignored){
            System.err.println("wrong file");
        }
        do {
            assert scanner != null;
            String[] strings = scanner.nextLine().split(" ");
            count += new WordChecker(new ArrayList<>(List.of(strings))).isWordChain()?1:0;

        } while (scanner.hasNextLine());
        System.out.println(count);
    }
}
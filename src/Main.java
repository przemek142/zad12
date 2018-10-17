import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\przemo\\IdeaProjects\\zad12\\src\\data");
        Scanner scanner;
        Integer readNumber;
        Map<Integer, Integer> list = new TreeMap<>();

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("no file");
            return;
        }

        do {
            readNumber = scanner.nextInt();
            if (!list.containsKey(readNumber)){
                list.put(readNumber, 1);
            }else {
                list.put(readNumber, (list.get(readNumber) + 1));
            }

        } while(scanner.hasNext());

        Set<Integer> keySet= list.keySet();

        for (Integer number : keySet) {
            System.out.printf("%d, liczba wystąpień: %d\n", number, list.get(number) );
        }

    }
}

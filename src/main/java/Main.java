import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] words = {"Zoo", "Open", "Only", "Beer", "Panda",
                "Bear", "Animals", "See", "Bar", "Nice",
                "Panda", "Wine", "Milk", "Milk", "Rabbit",
                "Cat", "Want", "Bear", "Panda", "Animals",
                "Bar", "Beer", "Panda", "Panda"};

        printCountWords(words);

        Phonebook.add("Popov", "+78988908989");
        Phonebook.add("Popov", "+78988944989");
        Phonebook.add("Filatov", "+78988558989");
        Phonebook.add("Popov", "+78988778989");
        Phonebook.get("Popov");
        Phonebook.get("Filatov");


    }

    private static void printCountWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }

}

import java.util.ArrayList;
import java.util.HashMap;


public class Phonebook {
    private static HashMap<String, ArrayList<String>> book = new HashMap<>();

    public static void add(String lastName, String phone) {
        ArrayList<String> phones = book.get(lastName);
        if (phones == null) {
            phones = new ArrayList<>();
            phones.add(phone);
            book.put(lastName, phones);
        } else {
            phones.add(phone);
        }
    }

    public static void get(String lastName) {
        ArrayList<String> phones = book.get(lastName);
        System.out.println(lastName + ":" + phones);
    }
}

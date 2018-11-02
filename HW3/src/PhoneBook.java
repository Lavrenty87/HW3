import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> phonebook = new HashMap<>();

    public PhoneBook() {
        phonebook.put("Vasya", "89184452905");
        phonebook.put("Stas", "89184452909");
        phonebook.put("Fedor", "89184452906");
        phonebook.put("Igor", "89184452907");
        phonebook.put("Petr", "89184452908");
    }

    public void getPhoneBook(String a) {
        System.out.println("Поиск: " + a + " - " + phonebook.get(a));
    }

    public void setPhoneBook() {
        phonebook.put("Lavrenty", "89185514545");
    }

    public void getAllBook() {
        System.out.println("All phone book: " + phonebook);
    }
}

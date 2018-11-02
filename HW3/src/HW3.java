import java.util.ArrayList;
import java.lang.System.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Java. Leve 2.  Home Work 3
 *
 * @author Gaponov Lavrenty
 * @version dated 11.2018
 */
/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 Найти и вывести список уникальных слов, из которых состоит массив
 (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит
в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов
(в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании
(т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
 */

public class HW3 {
    public static void main(String[] args) {
        System.out.println("Java 2 Home work 3.1");
        String[] words = {"Михаил", "Анатолий", "Виктория", "Алексей", "Анатолий",
                "Денис", "Денис", "Иван", "Пётр", "Игорь", "Максим", "Женя", "Юля",
                "Маша", "Ольга", "Виктория", "Ирина", "Даша", "Виктория", "Николай",};
        scanArry(words);
        System.out.println("Java 2 Home work 3.2");
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.getPhoneBook("Stas");
        phoneBook1.setPhoneBook();
        phoneBook1.getAllBook();
    }
    private static void scanArry(String[] words) {
        ArrayList<String> one_name = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            one_name.add(words[i]);
        }
        Set<String> set = new LinkedHashSet<>(one_name);
        System.out.println("Исходный массив " + one_name);
        System.out.println("Без повторов " +  set);
    }
}

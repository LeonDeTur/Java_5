// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

// Написать программу, которая выведет список людей с их телефонами
// Отсортировать по колличеству телефонов.
package Java.Java_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class program_1 {
    public static String Scanner (){
        java.util.Scanner scanner = new Scanner(System.in);
        String scanned = scanner.nextLine();
        return scanned;
    }

    public static vod find(){
        System.out.println("Введите имя: ");
        String name = Scanner();
        System.out.println(phonbook.get(name));
    }

    public static void PrintAllPhonebook(){
        System.out.println(phonbook);
    }

    public static void AddName(){
        System.out.println("Если хотите выйте хотите перестать вводить номера введите /");
        System.out.println("Введите имя: ");
        String name = Scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String phon = scanner();
            if (phon.equals("/")) {
                break;
            } else {
                number.add(phon);
            }
        }
    }
    public static void main(String[] args){
        Map<String, List<String>> phonBook = new HashMap<>();
        phonBook.put("Ivan", List.of("8 926 333 33 33", "8 926 222 22 99"));
        phonBook.put("Nicolai", List.of("8 926 333 33 55", "8 926 222 22 00"));
        phonBook.put("Alexandra", List.of("8 926 333 33 66", "8 926 222 22 44"));
        phonBook.put("Petr", List.of("8 926 333 33 77", "8 926 222 22 11"));
        phonBook.put("Dmitry", List.of("8 926 333 33 88", "8 926 222 22 22"));

        System.out.println("Введите команду из списка: find - найти контакт, add - добавить контакт, all - показать всю телефонную книгу");
        String comands = Scanner();
            switch (comands) {
                case "find":
                    find(phonBook);
                    break;
                case "add":
                    add(phonBook);
                    break;
                case "all":
                    allBook(phonBook);
                    break;
                default:
                    break;
            }
    }
}

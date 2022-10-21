import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Journal journal = new Journal();


        while (true) {
            System.out.println("Введите имя ученика");
            journal.setFirstName(scanner.next());
            System.out.println("Введите фамилию ученика");
            journal.setSecondName(scanner.next());
            System.out.println("Введите оценку за четверть");
            journal.setGrade(scanner.nextInt());
            System.out.println("Нажмите Завершить, чтобы выйти из программы. Чтобы продолжить – введите любой символ");
            scanner.nextLine();
            if (scanner.nextLine().equals("Завершить")) {
                break;
            }
        }

        System.out.println(journal.out());
    }
}
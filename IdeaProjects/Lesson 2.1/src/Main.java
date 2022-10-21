import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();


        while (true) {
            System.out.println("Введите имя ученика");
            student.setFirstName(scanner.next());
            System.out.println("Введите фамилию ученика");
            student.setSecondName(scanner.next());
            System.out.println("Введите оценку за четверть");
            student.setGrade(scanner.nextInt());
            System.out.println("Нажмите Завершить, чтобы выйти из программы. Чтобы продолжить – введите любой символ");
            scanner.nextLine();
            if (scanner.nextLine().equals("Завершить")) {
                break;
            }
        }

        System.out.println(student.out());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Date date1 = getDateFromScanner();
        System.out.println(date1.getWeekdayName());
        System.out.println(date1.toString());

    }


    public static Date getDateFromScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.println("Введите день: ");
        int day = scanner.nextInt();

        return new Date(year, month, day);

    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Date date1 = new Date(2023,12 , 3);
        Date date1 = getDateFromScanner();
        //System.out.println(date1.getWeekdayName());
        System.out.println(date1.toString());

    }


    public static Date getDateFromScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year (900-2400): ");
        int year = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        return new Date(year, month, day);

    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(2020, 2, 29);
        System.out.println(date1.getDay());
        //date1.year = 2021;
        System.out.println(date1.getDay());
        //Date[] datesToCheck = {date1, date2};

    }

   /* public static Date getDateFromScanner(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день: " );
        int day=scanner.nextInt();

        System.out.println("Введите месяц: " );
        int month=scanner.nextInt();

        System.out.println("Введите год: " );
        int year=scanner.nextInt();

        Date date = new Date(day,month,year);

        return date;
    }*/
}

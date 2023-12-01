public class Date {
    private int day;
    private int month;
    private int year;

    private static final String[] weekdays =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public Date(int year, int month, int day) {

        this.year = year;
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (day > getCurrentMonthDays()) throw new RuntimeException("Invalid day");
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12) throw new RuntimeException("Invalid month");
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > getCurrentMonthDays()) throw new RuntimeException("Invalid day");
        this.day = day;
    }


    private int getMonthIndex() {

        switch (this.month) {
            case 1:
            case 10:
                return 1;
            case 11:
            case 2:
            case 3:
                return 4;
            case 4:
            case 7:
                return 0;
            case 5:
                return 2;
            case 6:
                return 5;
            case 8:
                return 3;
            case 9:
            case 12:
                return 6;
            default:
                throw new RuntimeException("Invalid day");
        }
    }

    private int getDaysForMonth(int year, int month) {
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default: //return -1; //TODO: sout -1 as error message.
                throw new RuntimeException("Invalid month");
        }
    }

    private int getCurrentMonthDays() {

        return getDaysForMonth(this.year, this.month);
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 400 == 0 ^ year % 100 != 0));

    }

    public String getWeekdayName(int dayOfTheWeek) {
        return weekdays[dayOfTheWeek];
    }

    public int weekdayCountAlgorythm() {

        int dayIndex = (ammountDays + monthIndex + yearIndex) % 7;

        return weekdaySort();
    }
}

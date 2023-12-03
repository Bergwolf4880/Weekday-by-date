public class Date {
    private int day;
    private int month;
    private int year;

    private static final String[] weekdays =
            {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public Date(int year, int month, int day) {

        this.year = year;
        setMonth(month);
        setDay(day);

    }

    //region GetterSetter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
       //if (year <= 900 && year >= 2500 ) throw new RuntimeException("Invalid year");
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12) throw new RuntimeException("Invalid month");
        this.month = month;
    }

    public void setDay(int day) {
        if (day > getCurrentMonthDays()) throw new RuntimeException("Invalid day");
        this.day = day;
    }

    //endregion

    //region Weekday logic
    private int getMonthIndex() {

        return switch (this.month) {
            case 1, 10 -> 1;
            case 11, 2, 3 -> 4;
            case 4, 7 -> 0;
            case 5 -> 2;
            case 6 -> 5;
            case 8 -> 3;
            case 9, 12 -> 6;
            default -> throw new RuntimeException("Invalid day");
        };
    }

    public String getWeekdayName() {
        return weekdays[getWeekdayNumber()];
    }

    private int getWeekdayNumber() {

        int m = getMonthIndex();
        int y = getYearIndex();

        return (this.day + m + y) % 7;

    }

    //endregion

    //region Helpers
    private int getDaysForMonth(int year, int month) {

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> throw new RuntimeException("Invalid month");
        };
    }


    private int getCurrentMonthDays() {

        return getDaysForMonth(this.year, this.month);
    }

    private boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }

    private int getYearIndex() {

        int y = (year/100);

        y = switch (y) {
            case 12, 16, 20, 24 -> 6;
            case 9, 13, 17, 21 -> 4;
            case 10, 14, 18, 22 -> 2;
            case 11, 15, 19, 23 -> 0;
            default -> y;
        };
        return (y + year % 100 + year % 100 / 4) % 7;
    }

    public String toString() {

        return this.day + "-" + this.month + "-" + this.year + " was " + getWeekdayName();
    }
    //endregion

}

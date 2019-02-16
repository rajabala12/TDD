public class DaysInMonth {
    public String getDaysOfMonth(int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return "Days in the month is 31";
            case 2:
                if (year % 4 == 0)
                    return "Days in the month is 29";
                else {
                    return "Days in the month is 28";
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return "Days in the month is 30";
            default:
                return "Please enter a valid value for month and year";
        }
    }
}

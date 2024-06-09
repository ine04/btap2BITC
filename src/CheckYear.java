public class CheckYear {
    
    public int CheckLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Day la nam nhuan!");
        }
        else
        System.out.println("Day khong phai la nam nhuan!");
        return year;

    }
    
}

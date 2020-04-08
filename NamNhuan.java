import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("enter your year: ");
        year=scanner.nextInt();

        boolean isLeapYear=false;

        if (year % 4==0){
            if (year %100 ==0){
                if (year % 400==0){
                    isLeapYear=true;
                }
                else {
                    isLeapYear=true;
                }
            }
        }
        if (isLeapYear==true){
            System.out.println(year+" la nam nhuan");
        }
        else {
            System.out.println(year+" khong la nam nhuan");
        }
    }
}

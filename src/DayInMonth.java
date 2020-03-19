import java.util.Scanner;
public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month: ");
        String month = scanner.nextLine();
        switch (month) {
            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            case "10":
            case "12":
                System.out.print("Co 31 ngay");
                break;
            case "2":
                System.out.print("co 28 or 29 ngay");
                break;
            case "4":
            case "9":
                System.out.print("co 30 Ngay");
                break;
            default:
                System.out.print("Xin moi ban nhap lai chu y 1 nam co 12 thang thoi ban oiii !!!");
        }
    }
}

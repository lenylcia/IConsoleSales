public class RunConsoleSales {
}
import java.util.Scanner;

public class RunConsoleSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the console type: ");
        String consoleType = input.nextLine();
        System.out.print("Enter the store: ");
        String store = input.nextLine();
        System.out.print("Enter the total " + consoleType + " sales for " + store + ": ");
        int totalSales = input.nextInt();

        ConsoleSalesReport report = new ConsoleSalesReport(consoleType, store, totalSales);
        report.printConsoleSalesReport();
    }
}
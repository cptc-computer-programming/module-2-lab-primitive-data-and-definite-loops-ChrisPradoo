package day2.part01_receipt_totals;

public class ReceiptTotals {

    public static void main(String[] args) {
        printReceiptSummary();
        printClosingCountdown();
    }

    // Scenario:
    // A store sold items numbered 100 through 105.
    // Each item costs $5.
    // Every 3rd item starting at 100 is on sale for $3 instead.
    //

    // - Calculate and print the total cost.
    // - Do NOT hard-code the total.
    public static void printReceiptSummary() {
        int totalCost = 0;

        // loop through all items from 100 to 105
        for(int item = 100; item <= 105; item++) {
            // % will give remainder after interger division
            if ((item - 100) % 3 == 0)
                totalCost += 3;
            else {
              // take a running total
            // where every item is $5
            totalCost += 5;  
            }

        }
        System.out.println("Total Cost $" + totalCost);

    }

    // TODO:
    // Print a countdown from 5 down to 0 on one line.
    public static void printClosingCountdown() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + " ");
        }  

    }
}

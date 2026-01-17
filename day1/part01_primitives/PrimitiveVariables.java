package day1.part01_primitives;

public class PrimitiveVariables {

    public static void main(String[] args) {
        // declare an int value and do not initialize it yet:
        //   int a;
        int value1;
        
        // declare and inititalize another int. Give your first int a value
        // a = 7
        // int b = 2;
        value1 = 10;
        int value2 = 5;

        

        // print integer division result (a / b) with a label
        int intResults = value1 / value2;
        System.out.println("Results from integer division value 1 and value 2: " + intResults);
        

        // print double division result ((double) a / b) with a label
        double doubleResults = value1 / value2;
        System.out.println("Results now from double divison value 1 and 2: " + doubleResults);
        
        

        // declare a double named price and an int named quantity
        //         initialize them to any values you choose
        double price = 10;
        int quantity = 10;
        
        
        // compute total cost (double) and print it with a label
        
        double totalCost = price * quantity;
        System.out.println("Total cost: " + totalCost);

        // declare a char variable and print the char and its int code

        char letter = 'A';
        System.out.println(letter);

        

        // Modify an existing int variable once using a unary operator (++ or --).
        // Modify it once using an augmented assignment operator (+=, -=, *=, or /=).
        // Print the value after each modification.

        System.out.println("Existing variable i chose to use is quantity, value before: " + quantity);
        System.out.println("Value after modifying with ++ unary operator: " + ++quantity);
        System.out.println("Modifying it now with an augmented operator: " + (quantity += 10));
        
    }
}

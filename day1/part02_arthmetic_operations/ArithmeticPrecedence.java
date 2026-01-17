package day1.part02_arthmetic_operations;

public class ArithmeticPrecedence {

    public static void main(String[] args) {

        
        // Declare and initialize two int variables.
        // Choose values that will NOT divide evenly.
        int unEven1 = 5;
        int unEven2 = 3;

       
        // Compute and print each result with a label:
        // a + b
        // a - b
        // a * b
        // a / b
        int adding = unEven1 + unEven2;
        System.out.println("Adding results: " + adding);

        int subract = unEven1 - unEven2;
        System.out.println("Subracting results: " + subract);

        int multiply = unEven1 * unEven2;
        System.out.println("Multiplying results: " + multiply);

        int divide = unEven1 / unEven2;
        System.out.println("Dividing results: " + divide);



       
        // Repeat the division, but force a double result.
        // Do NOT change the variable types.

        System.out.println("forced double results: " + (double) divide);

        // Declare a double variable.
        // Combine it in an arithmetic expression with an int.
        // Print the result and observe the type of the expression.

        double doubleExperiment = 5;
        int intExperiment = 4;
        System.out.println("Combing? not sure what its asking exactly, added both values and it prints as a double: " + doubleExperiment + intExperiment);


        // Write ONE expression that uses:
        // +, -, *, /, and parentheses.
        // Print the result.
        double resultParanthesis = ((10 + 5) * 2 - (20/5));
        System.out.println("Result with paraenthesis: " + resultParanthesis);
        
        // TODO 6:
        // Rewrite the expression above WITHOUT parentheses.
        // Print the result.

        double resultNoParanthesis = (10 + 5 * - 20/5);
        System.out.println("Result without paranthesis: " + resultNoParanthesis);

    }
}

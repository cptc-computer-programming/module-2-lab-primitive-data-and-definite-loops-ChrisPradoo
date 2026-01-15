package day2.part03_pattern_section;

public class PatternSection {
    // this is a constant like in python just more complicated to create lol
    public static final int SIZE = 3;

    public static void main(String[] args) {
        // TODO: Call each method below in this order:
        printEdge();
        printDiamondTop();
        // printDiamondBottom();
        printEdge();
    }

    // TODO: Print the edge line that fits the width for SIZE.
    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {
        // print a +
        System.out.print("+");

        // write a loop to print =* a variable number of time
        for (int i = 0; i < SIZE * 2; i++) {
            System.out.print("=*");
        }
        System.out.println();

    }

    // TODO: Print the top half of the “double-diamond” section.
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {

        // loop through the total rows in the top half of the diamond
        // we know that when SIZE = 3, total rows is 6

        for (int row = 0; row < SIZE * 2; row ++) {
            // begin the row with |
            System.out.print("|");

            /* when a value is decsreaing in a loop, but the loop variable is increasing
            you probably need to subtract to get that inverse relationship */

            int dots = (SIZE * 2 -1 ) - row;
            // print leading dots (hard coded first row)
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }
            int triangles = row + 1;
            // print triangles (hardcoded first row)
            for (int i = 0; i < triangles; i ++) {
                System.out.print("/\\");
            }

            // print trailing dots (hardcoded first row)
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            // end the row with a | and a mew line
            System.out.println("|");
        }

    }

    // TODO: Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {

    }
    
}

/*
                        // when row = 0, we print 5. and one /\, then 5 dots




*/

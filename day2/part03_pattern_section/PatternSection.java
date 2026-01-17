package day2.part03_pattern_section;

public class PatternSection {
    // this is a constant like in python just more complicated to create lol
    public static final int SIZE = 3;

    public static void main(String[] args) {
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();
    }

    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {
        // print a +
        System.out.print("+");

        // write a loop to print =* a variable number of time
        for (int i = 0; i < SIZE * 2; i++) {
            System.out.print("=*");
        }
        // end with +
        System.out.print("+");
        System.out.println();

    }

    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {
 

        for (int row = 0; row < SIZE * 2; row ++) {
            // begin the row with |
            System.out.print("|");


            // we declare a variable for dots, and basically we get the size of the dots from the set constanst for SIZE and subtract 1 and then for each row.
            int dots = (SIZE * 2 - 1) - row;
            // print leading dots (hard coded first row)
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            // this is where we declare a variable for the triangles, and basically we create another set of triangle after each row
            // example, at the first loop row is equal to 0 then we add 1, which will print 1 set of triangle, after another loop its going to be 2,
            //  so will loop 2 times printing two triangles.
            int triangles = row + 1;
            // print triangles (hardcoded first row)
            for (int i = 0; i < triangles; i ++) {
                System.out.print("/\\");
            }

            // print trailing dots (hardcoded first row)
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }


            // end the row with a | and a new line
            System.out.println("|");
        }

    }

    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {

        // this is going to loop whatever is inside currently 6 times since the constant SIZE is set to 3, 3 times 2, is 6.
        for (int row = 0; row < SIZE * 2; row++) {
            // again start each row with |
            System.out.print("|");

            // dot beginning part, we need to start at 1 dot then add our way up to the dots size
            int dot = 0 + row; 
            for (int i = 0; i < dot; i++) {
                System.out.print(".");
            }

            // triangle part, so if we started at 1 triangle and added our way up, we need to do the opposite, start at the biggest and subract our way down.
            int triangle = (SIZE * 2) - row;
            for (int i = 0; i < triangle; i++) {
                System.out.print("\\/");
            }
            
            // dot end part, same logic as the beginning, we need to start at 1 dot then add out way up
            for (int i = 0; i < dot; i++) {
                System.out.print(".");
            }

            // end with | printing a new line at the end of each loop
            System.out.println("|");
        }


    }
    
}

/*
+=*=*=*=*=*=*+      // so if here we start at 6 dots and subtract our way down.
|...../\.....|      // and start at 1 triangle and add our way up.
|..../\/\....|
|.../\/\/\...|
|../\/\/\/\..|
|./\/\/\/\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
|...../\.....|      // im guessing to invert we must start at 1 dot and add our way up
|..../\/\....|      // also for the triangle but inverted, instead of starting at 1 triangle, 
|.../\/\/\...|      // we start at 6 or however much the size is and work out way down
|../\/\/\/\..|
|./\/\/\/\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
+=*=*=*=*=*=*+ */
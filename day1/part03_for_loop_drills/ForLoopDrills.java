package day1.part03_for_loop_drills;

public class ForLoopDrills {
    
    public static void main(String[] args) {

        // print numbers 1..10 on one line
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // print numbers 10..1 on one line
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // print even numbers 2..20 on one line
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        // print multiples of 5 from 5..50 on one line

        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }

        System.out.println();

        // print powers of 2 (1, 2, 4, 8, 16, 32) on one line

        for (int i = 1; i <= 32; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        // print 20 '*' characters on one line (use a loop)

        for (int i = 0; i <= 20; i++) {
            System.out.print("*");
        }

    }

}

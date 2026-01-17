package day2.part02_sensor_readings;

public class SensorReadings {

    public static void main(String[] args) {

        // Scenario: A sensor reports every 5 minutes for 1 hour.
        // Minutes: 0, 5, 10, ..., 60

        // TODO:
        // A sensor reports data every 5 minutes for 1 hour (minutes 0 through 60).
        // Use a for loop with a step size of 5 to iterate over the minute marks.
        // At each minute, compute a value equal to (minute / 5) * 2,
        // then print the minute and the computed value.

        // example of pseudocode: loop over minutes 0 to 60, updating by 5 each time
        // how the loop works, starts at 0, stops when it is equal to 60, adds 5 to minute variable every loop
            for (int minute = 0; minute <= 60; minute += 5) {
                System.out.print("Minute: " + minute);
                // computing the random equation, teacher used double i used int, double would be better.
                double randomCalculation = (minute / 5) * 2;
                System.out.println();
                System.out.println("Random calculation:" + randomCalculation);

            }



    }
    
}

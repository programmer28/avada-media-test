package org.example;


public class Main
{
    public static void main( String[] args ) {
        Training[] trainingsPerWeek = {
                new Running(100, 60, 75, 10),
                new Running(95, 20, 60, 5),
                new Crossfit(110, 50, 85, 90),
                new Boxing(90, 120, 78)
        };

        for (Training training : trainingsPerWeek) {
            training.printInfo();
        }
    }
}

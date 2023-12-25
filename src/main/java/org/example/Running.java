package org.example;

public class Running extends Training {
    private double distance;

    public Running(double averageHeartRate, int trainingDuration, int athleteWeight, double distance) {
        super(averageHeartRate, trainingDuration, athleteWeight);
        this.distance = distance;
    }

    @Override
    public void printInfo() {
        System.out.println("Беговая тренировка! Длительность: " + getTrainingDuration() + " минут. " +
                "Дистанция: " + distance + " км. Килокалорий: " + calculateCaloriesPerTraining());
    }
}

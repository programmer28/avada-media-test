package org.example;

public class Crossfit extends Training {
    private double projectileWeight;

    public Crossfit(double averageHeartRate, int trainingDuration, int athleteWeight, double projectileWeight) {
        super(averageHeartRate, trainingDuration, athleteWeight);
        this.projectileWeight = projectileWeight;
    }

    @Override
    public void printInfo() {
        System.out.println("Кросфит тренировка! Длительность: " + getTrainingDuration() + " минут. " +
                "Средний вес штанги: " + projectileWeight + " кг. Килокалорий: " + calculateCaloriesPerTraining());
    }
}

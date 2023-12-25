package org.example;

public abstract class Training {
    private double averageHeartRate;
    private int trainingDuration;
    private int athleteWeight;

    public Training(double averageHeartRate, int trainingDuration, int athleteWeight) {
        this.averageHeartRate = averageHeartRate;
        this.trainingDuration = trainingDuration;
        this.athleteWeight = athleteWeight;
    }

    public double getAverageHeartRate() {
        return averageHeartRate;
    }

    public int getTrainingDuration() {
        return trainingDuration;
    }

    public int getAthleteWeight() {
        return athleteWeight;
    }

    public double calculateCaloriesPerTraining() {
        return 0.014 * athleteWeight * trainingDuration * (0.12 * averageHeartRate - 7);
    }

    public abstract void printInfo();
}

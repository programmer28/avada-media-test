package org.example;

public class Boxing extends Training {

    public Boxing(double averageHeartRate, int trainingDuration, int athleteWeight) {
        super(averageHeartRate, trainingDuration, athleteWeight);
    }

    @Override
    public void printInfo() {
        System.out.println("Тренировка по кикбоксингу! Длительность: " + getTrainingDuration() + " минут. " +
                "Килокалорий: " + calculateCaloriesPerTraining());
    }
}

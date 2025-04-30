package org.example;

public class Player {
    private int points;

    public Player() {
        this.points = 0;
    }

    public void updatePointsBy(int diff) {
        this.points += diff;
    }

    public int getPoints() {
        return points;
    }
}


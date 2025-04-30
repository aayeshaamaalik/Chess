package org.example;

public class Piece {
    private Color color;
    private Role role;

    public Piece(Color color, Role role) {
        this.color = color;
        this.role = role;
    }

    public Color getColor() {
        return color;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return color + " " + role;
    }
}


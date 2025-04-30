package org.example;

import java.util.*;

import java.util.*;

public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;
    private int steps;
    private Piece[][] board = new Piece[8][8];

    public void joinGame(Player player, Color color) {
        if (color == Color.WHITE) whitePlayer = player;
        else blackPlayer = player;
    }

    public void initializeBoard() {
        // Initialize pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Piece(Color.BLACK, Role.PAWN);
            board[6][i] = new Piece(Color.WHITE, Role.PAWN);
        }
        // Rooks
        board[0][0] = board[0][7] = new Piece(Color.BLACK, Role.ROOK);
        board[7][0] = board[7][7] = new Piece(Color.WHITE, Role.ROOK);
        // Knights
        board[0][1] = board[0][6] = new Piece(Color.BLACK, Role.KNIGHT);
        board[7][1] = board[7][6] = new Piece(Color.WHITE, Role.KNIGHT);
        // Bishops
        board[0][2] = board[0][5] = new Piece(Color.BLACK, Role.BISHOP);
        board[7][2] = board[7][5] = new Piece(Color.WHITE, Role.BISHOP);
        // Queens
        board[0][3] = new Piece(Color.BLACK, Role.QUEEN);
        board[7][3] = new Piece(Color.WHITE, Role.QUEEN);
        // Kings
        board[0][4] = new Piece(Color.BLACK, Role.KING);
        board[7][4] = new Piece(Color.WHITE, Role.KING);

        currentPlayer = whitePlayer;
        steps = 0;
    }

    public boolean move(Piece piece, int row, int col) {
        if (piece == null || piece.getColor() != getCurrentPlayerColor()) return false;

        // simple movement logic: just allow if within bounds
        board[row][col] = piece;
        steps++;
        return true;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == whitePlayer) ? blackPlayer : whitePlayer;
    }

    public boolean isCurrentPlayerWin() {
        // naive check for now: return false
        return false;
    }

    public boolean gameDraw() {
        return steps >= 100;
    }

    public void rewardCurrentPlayer() {
        currentPlayer.updatePointsBy(1);
    }

    private Color getCurrentPlayerColor() {
        return (currentPlayer == whitePlayer) ? Color.WHITE : Color.BLACK;
    }
}

# Chess Game System

This project is a modular and extensible Object-Oriented Design (OOD) implementation of a two-player Chess Game. It models essential components of a chess environment, including players, the board, and pieces, and supports actions like joining a game, initializing the board, executing moves, and tracking game outcomes.

**Design Reference:**  
Based on the design structure from [ycwkatie's OOD repository](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/chess.md).

---

## Key Components and Responsibilities

| Class / Enum        | Responsibility |
|---------------------|----------------|
| `Game`              | Core class that manages the board, players, moves, turn switching, and game status. |
| `Player`            | Represents a player and tracks their points. |
| `Piece`             | Models a chess piece with color and role. |
| `ChessPlayRoom`     | Maintains a list of all ongoing games. |
| `Color` (enum)      | Enumerates `WHITE` and `BLACK` sides. |
| `Role` (enum)       | Enumerates chess roles: `KING`, `QUEEN`, `ROOK`, `BISHOP`, `KNIGHT`, `PAWN`. |

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/chess-game-system.git
   ```

2. Navigate to the project directory:
   ```bash
   cd chess-game-system
   ```

3. Open the project in your preferred Java IDE.

4. Compile and run the `Main` class to simulate or test game functionality.

---


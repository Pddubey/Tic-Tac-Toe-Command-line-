/** 1--> Goal of the class
 * A=>To create a 2D grid
 * B=>initialize it with Bank spaces
 * C=>Ask user for putting their move i.e.Cross or Zero
 */

public class Board {
    static char[][] board;//Declaration of a 2D character array (Board)
    Board(){
        board = new char[3][3];//creation of the 2D board
        initBoard();//method for initializing the Board with blank spaces
    }
    void initBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
    }



}

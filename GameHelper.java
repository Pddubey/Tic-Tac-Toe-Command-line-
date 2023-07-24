import java.util.Scanner;
import java.util.Random;
public class GameHelper {
    //Listing the instance variables of the class
    int userChoice;
    Scanner in=new Scanner(System.in);//object creation the Scanner class
    Random rno=new Random();
    int takeChoice(){
        System.out.println("Enter your choice :\n1) Human Vs Human\n2) Human vs Computer");
        userChoice=in.nextInt();
        return userChoice;
    }
    void placeMark(int r, int c, char mark) {
        if(r>=0 && r<=2 && c>=0 && c<=2)
            Board.board[r][c] = mark;
        else
            System.out.println("Invalid move");
    }
    void displayBoard() {
        System.out.println("-------------------------");
        for (int row = 0; row < Board.board.length; row++) {
            System.out.print("|   ");
            for (int col = 0; col <Board.board[row].length; col++) {
                System.out.print(Board.board[row][col]);
                System.out.print("   |   ");
            }
            System.out.println("");
            System.out.println("-------------------------");
        }

    }
    boolean checkColWin(char mark) {
        for (int j = 0; j < 3; j++) {
            if (Board.board[0][j]!=' ' && Board.board[0][j] == Board.board[1][j] && Board.board[1][j] == Board.board[2][j]) {
                return true;
            }
        }
        return false;
    }
    boolean checkRowWin(char mark) {
        for (int i = 0; i < 3; i++) {
            if (Board.board[i][0]!=' ' && Board.board[i][0] == Board.board[i][1] && Board.board[i][1] == Board.board[i][2]) {
                return true;
            }
        }
        return false;
    }
    boolean checkDiagonalWin(char mark) {
        if (Board.board[0][0]!=' ' && ( Board.board[0][0]==Board.board[1][1] && Board.board [1][1]==Board.board[2][2] || Board.board[0][2]!=' ' && Board.board[0][2]==Board.board[1][1] && Board.board[1][1]==Board.board[2][0]) ) {
            return true;
        }
        return false;
    }
    boolean checkWin(char mark){
        if(checkColWin(mark) || checkRowWin(mark) || checkDiagonalWin(mark)){
            return true;
        }
        return false;
    }
    boolean checkDraw(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (Board.board[i][j]==' '){
                    return false;
                }
            }
        }
        return true ;
    }

}

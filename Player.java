abstract public class Player {
    //listing the instance variables of the class
     String name;
     char mark;
    //Constructor for intializing the instance
    //listing the instance methods of the class
    abstract void makeMove();//abstract methos so that subclasses override this accordingly

    //this method is shared between both subclasses
    boolean isValid(int row,int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2 && Board.board[row][col]==' ') {
            return true;
        }else
            return false;
    }
   }



/*ComPlayer class inheriting the Player class*/
public class ComPlayer extends Player {
    //constructor of HumanPlayer class
    ComPlayer(String name,char mark) {
        this.name=name;
        this.mark=mark;
    }
    GameHelper helper=new GameHelper();

    @Override
    void makeMove(){
        int row,col;
        do {
            System.out.println("Enter the row and column: ");
            row=helper.rno.nextInt(3);
            //System.out.println("Enter the column: ");
            col=helper.rno.nextInt(3);
            //System.out.println("Invalid move\nEnter another place");
        }while (!isValid(row,col));
        helper.placeMark(row,col,mark);
    }
}

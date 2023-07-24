/*HumanPlayer class inheriting the Player class*/
public class HumanPlayer extends Player {
    //constructor of HumanPlayer class
    HumanPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
        }

    GameHelper helper=new GameHelper();
    @Override
    void makeMove(){
        int row,col;
        do {
            System.out.println("Enter the row ad column: ");
            row=helper.in.nextInt();
            //System.out.println("Enter the column: ");
            col=helper.in.nextInt();
        }while (!isValid(row,col));
        helper.placeMark(row,col,mark);
    }
}

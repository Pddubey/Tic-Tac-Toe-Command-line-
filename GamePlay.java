public class GamePlay {
    //Listing the instance variables of the class
    Player p1;
    Player p2;
    int userChoice;
    String name;
    char mark;
    GameHelper helper=new GameHelper();
    Board board=new Board();

    //Instance methods of the class

    void createPlayer(){
        if(helper.takeChoice()==1){
            System.out.println("Enter Player1 name: ");
            name=helper.in.next();
            p1=new HumanPlayer(name,'X');
            System.out.println("Enter Player2 name: ");
            name=helper.in.next();
            p2=new HumanPlayer(name,'0');
        }
        else{
            System.out.println("Enter player name: ");
            name=helper.in.next();
            p1=new HumanPlayer(name,'X');
            name="Computer";
            p2=new ComPlayer(name,'0');
        }
    }
    void startPlay(){
        System.out.println("This is "+p1.name+" 🆚 "+p2.name);
        Player cp=p1;
        while(true){
            System.out.println(cp.name+" turn:");
            cp.makeMove();
            helper.displayBoard();
            if (helper.checkWin(cp.mark) ){
                System.out.println(cp.name+" won the match🎉🎉");
                break;
            }
            if (helper.checkDraw()){
                System.out.println("Match draw😒😒");
                break;
            }
            if (cp==p1){
                cp=p2;
            }
            else{
                cp=p1;
            }


        }
    }



    void finishGame(){

    }
}

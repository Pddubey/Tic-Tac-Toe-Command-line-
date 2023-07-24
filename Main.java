public class Main {
    public static void main(String[] args) {
        GameHelper helper=new GameHelper();

        //For delay of 2 second
        try {
            System.out.println("TIC TAC TOE ❌ ⭕ is launching... ");
            Thread.sleep(1000);
            Board board=new Board();//Creation of board
            Thread.sleep(500);
            helper.displayBoard();//Display the board on the console(after 2 second of delay)
            Thread.sleep(1000);
        }

        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        GamePlay play=new GamePlay();


        play.createPlayer();
        play.startPlay();

    }
}
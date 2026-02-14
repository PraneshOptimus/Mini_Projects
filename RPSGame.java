import java.util.*;

class RPSGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RPS game = new RPS();
        
        int player = 0;
        int computer = 0;

        for(int i=0;i<3;i++){
            System.out.println("Round "+(i+1));

            char user = game.getUserResult(sc).toUpperCase().charAt(0);

            String computer_res = game.getComputerResult();

            delay(2000);

            System.out.println("\nComputer Selection : "+computer_res);

            char comp = computer_res.toUpperCase().charAt(0);

            int ans = game.getRes(user, comp);

            delay(2000);

            switch (ans) {
                case 1 -> {
                    System.out.println("\nPlayer Won the Round "+(i+1));
                    player++;
                }
                case 2 -> {
                    System.out.println("\nComputer Won the Round "+(i+1));
                    computer++;
                }
                case 3 -> {
                    System.out.println("Play Again ! ");
                    i--;
                }
                default -> {
                    System.out.println("Invalid");
                    i--;
                }
            }
            
        }

        if(player > computer){
            System.out.println("\nPlayer Won the Game");
        }
        else{
            System.out.println("\nComputer Won the game");
        }

    }
    static void delay(int num){
        try {
                Thread.sleep(num);
            } catch (Exception e) {
        }
    }

}

class RPS{

    String getUserResult(Scanner sc){
        System.out.println(
            "Select One "+
            "\nRock    - 1"+
            "\nPaper   - 2"+
            "\nScissor - 3"
        );
         int num = sc.nextInt();

        switch (num) {
            case 1 -> {
                return "Rock";
            }
            case 2 -> {
                return "Paper";
            }
            case 3 -> {
                return "Scissor";
            }
            default -> {
            }
        }
         return "Error";
    }

    String getComputerResult(){

        Random rand = new Random();
        int num = rand.nextInt(3)+1;

        switch (num) {
            case 1 -> {
                return "Rock";
            }
            case 2 -> {
                return "Paper";
            }
            case 3 -> {
                return "Scissor";
            }
            default -> {
            }
        }
         return "Error";
    }

    int getRes(char a, char b){
        
        if(a==b) return 3;

        if (
            (a == 'R' && b == 'S') ||
            (a == 'P' && b == 'R') ||
            (a == 'S' && b == 'P')
        ) return 1;

        if (
            (a == 'R' && b == 'P') ||
            (a == 'P' && b == 'S') ||
            (a == 'S' && b == 'R')
        ) return 2;

        return -1;
    }
}
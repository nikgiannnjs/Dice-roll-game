import java.util.Scanner;

public class DiceJack{
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the roll dice game. You will pick three numbers and then you will roll a dice. If the sum of your numbers are greater than the sum of the dice rolls, with a difference of less than three, you WIN. Ok?");
    input.nextLine();

    boolean playAgain = true;

    while (playAgain){
        int choice1 = 0, choice2 = 0, choice3 = 0;
        boolean validInput = false;

        while(!validInput){
        System.out.println("Pick three numbers between 1-6");
        choice1 = input.nextInt();
        choice2 = input.nextInt();
        choice3 = input.nextInt();
        input.nextLine();

        if(choice1 >= 1 && choice1 <= 6 && choice2 >= 1 && choice2 <= 6 && choice3 >= 1 && choice3 <= 6){
            validInput = true;
        }else{
            System.out.println("Invalid input. All numbers have to be between 1 and 6.");
        };
    };
        

    int userSum = choice1 + choice2 + choice3;

    System.out.println("Great! Your sum is " + userSum);
    System.out.println("Now type 'roll' to roll the dice");
    String command = input.nextLine();
        
    if(command.equalsIgnoreCase("roll")){
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
    
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);

        int diceSum = roll1 + roll2 + roll3;

        System.out.println("Press enter to continue");
        input.nextLine();

        System.out.println("Dice roll sum is " + diceSum);

        if(userSum > diceSum && (userSum - diceSum) < 3){
            System.out.println("That means you won!! Congratulations!");
        }else{
            System.out.println("That means you lost. Im sorry. You can try again.");
        };

        System.out.println("Type 'again' to play again, or anything else to quit.");
        String again = input.nextLine();

        if (!again.equalsIgnoreCase("again")) {
            playAgain = false;
            System.out.println("Thanks for playing!");
        };            
        };
        };
    };

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    };
};
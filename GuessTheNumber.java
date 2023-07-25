import java.util.*;
public class GuessTheNumber {
    public static void main(String args[]) {
        System.out.println("WELCOME TO GUESS THE NUMBER GAME");
        System.out.println("THE NUMBER IS BETWEEN 1 AND 100. YOU HAVE TO GUESS THE NUMBER");
        System.out.println("YOU WILL BE GIVEN 5 ATTEMPTS TO GUESS THE NUMBER. THE LESS NUMBER OF ATTEMPTS YOU TAKE TO GUESS THE NUMER,MORE WILL BE THE SCORE");
        int m = (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i=0 ; i<5 ; i++) {
          int k = sc.nextInt();
          if(k > m) {
            System.out.println("THE NUMBER YOU GUESSED IS TOO LARGE");
            count++;
            if(i<4) {
                System.out.println("TRY AGAIN");
            }else {
                System.out.println("YOU LOSE THE GAME.PLAY AGAIN");
                System.out.println("THE NUMBER WAS "+ m);
            }
          }else if(k<m) {
            System.out.println("THE NUMBER YOU GUESSED IS TOO SMALL");
            count++ ;
            if(i<4) {
                System.out.println("TRY AGAIN");
            }else {
                System.out.println("YOU LOSE THE GAME.PLAY AGAIN");
                System.out.println("THE NUMBER WAS "+ m);
            }
          }else {
             System.out.println("CONGRATULATIONS! YOU GUESSED THE RIGHT NUMBER");
             count++;
             System.out.println("YOU GUESSED THE NUMBER " + m +" in " + count + " attempts");
             return;
          }
        }
    }
}
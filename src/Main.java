
import storage.DataBase;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите value&risk через пробел:");
        String str = scanner.nextLine();
        String[] bet = str.split(" ");
        int value = Integer.valueOf(bet[0]);
        double risk = Double.valueOf(bet[1]);
        bet.Bet user3Bet = new bet.Bet(value, risk);
        DataBase.bets[0]= user3Bet;
        System.out.println("выводим результат");
        System.out.println(Arrays.toString(DataBase.bets));
    }
}
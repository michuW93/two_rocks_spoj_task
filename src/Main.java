import java.util.Scanner;
import java.util.function.BiPredicate;

public class Main {
    private static String SPACE = " ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String positionFirstRook = input.split(SPACE)[0];
        String positionSecondRook = input.split(SPACE)[1];
        if (positionChecker.test(positionFirstRook, positionSecondRook)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    private static BiPredicate<String, String> positionChecker = (firstRook, secondRook) ->
            firstRook.charAt(0) == secondRook.charAt(0) || firstRook.charAt(1) == secondRook.charAt(1);
}
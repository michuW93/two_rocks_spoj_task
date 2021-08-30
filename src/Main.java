import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String positionFirstRook = input.split(" ")[0];
        String positionSecondRook = input.split(" ")[1];

        if (positionFirstRook.charAt(0) == positionSecondRook.charAt(0) || positionFirstRook.charAt(1) == positionSecondRook.charAt(1)){
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
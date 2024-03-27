import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();

        boolean diviableByFour = number % 4 == 0;
        boolean diviableBySix = number % 6 == 0;
        boolean diviableByTen = number % 10 == 0;

        if (diviableByFour){
            System.out.println(4);
        }
        if (diviableBySix){
            System.out.println((diviableByFour ? " , " : "") + "6");
        }
        if (diviableByTen){
            System.out.print(((diviableByFour || diviableBySix) ? ", " : "") + "10");
        }
        System.out.println((diviableByFour || diviableBySix || diviableByTen) ?
                " divides " + number + "." : "None of 4, 6, or 10 divides " + number + ".");
    }
}
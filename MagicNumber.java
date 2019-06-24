import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int numberOne = 1; numberOne <=9; numberOne++) {
            for (int numberTwo = 0; numberTwo <=9; numberTwo++){
                for (int numberThree = 0; numberThree <=9; numberThree++){
                    for (int numberFour = 0; numberFour <=9; numberFour++){
                        for (int numberFive = 0; numberFive <=9; numberFive++){
                            for (int numberTSix = 0; numberTSix <=9; numberTSix++){
                                int total = numberOne * numberTwo * numberThree * numberFour * numberFive * numberTSix;
                                if (total == magicNumber){
                                    System.out.printf("%d%d%d%d%d%d ",numberOne, numberTwo, numberThree, numberFour, numberFive, numberTSix);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

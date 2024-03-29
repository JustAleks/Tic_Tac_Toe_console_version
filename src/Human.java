
import java.util.Scanner;

public class Human extends Player {

    //================== Declaration =====================//

    public static Scanner playerInput = new Scanner(System.in);

    private int rowIndex,
                columnIndex;
    private char playerSign;

    //================== Constructors ====================//

    public Human() {
    }

    public Human(String playerName, char newPlayerSign) {
        super(playerName, newPlayerSign);
    }

    //================== Methods =========================//

    public void makeMove(){

        int cellIndex;

        playerSign = getPlayerSign();

        while (true){

            System.out.println("Your move, " + getName() + ".");
            System.out.print("Enter cell index [from 1 to 9] -> ");
            if (playerInput.hasNextInt()) {
                cellIndex = playerInput.nextInt();
                if(cellIndex < 1 || cellIndex > 9) {
                    System.out.println("Wrong input! Try again.");
                }
                // sets row and cell indexes;
                // example: cell = 5, so rowIndex = 1 and columnIndex = 1;
                setIndexes(cellIndex);
                Field.writeCell(playerSign, rowIndex, columnIndex);
                break;
            }else {
                System.out.println("Wrong input! Try again.");
                playerInput.next();
            }
        }
    }
    private void setIndexes(int cellIndex){

        switch (cellIndex){

            case 1:
                rowIndex = 0;
                columnIndex = 0;
                break;

            case 2:
                rowIndex = 0;
                columnIndex = 1;
                break;

            case 3:
                rowIndex = 0;
                columnIndex = 2;
                break;

            case 4:
                rowIndex = 1;
                columnIndex = 0;
                break;

            case 5:
                rowIndex = 1;
                columnIndex = 1;
                break;

            case 6:
                rowIndex = 1;
                columnIndex = 2;
                break;

            case 7:
                rowIndex = 2;
                columnIndex = 0;
                break;

            case 8:
                rowIndex = 2;
                columnIndex = 1;
                break;

            case 9:
                rowIndex = 2;
                columnIndex = 2;
                break;
        }
    }
}

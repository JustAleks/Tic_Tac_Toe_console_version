/**
 *
 */
public class Main {

    public static void main(String[] args) {

        Field GameField = new Field();

//        char tic = 'X';
//        char tac = 'O';
//        char toe = 'L';

        //GameField.showField();
       // GameField.eraseField();
       // System.out.println();
       // GameField.showField();
        GameField.writeCell(Field.SYMBOL_O,0,0);
//        GameField.showField();
        GameField.writeCell(Field.SYMBOL_X,1,0);
        GameField.showField();
//        Human player1 = new Human("vasya",Player.CROSS_CHAR);
//        Human player2 = new Human();
        System.out.println(Field.isCellFree(1, 0));
        System.out.println(Field.isCellFree(1, 1));


    }
}

/**
 *
 */
public class Field {

    //================== Declaration =====================//

    public static final char SYMBOL_X = 'X';

    public static final char SYMBOL_O = 'O';

    private static final char DEF_FIELD = ' ';

    private static final int DEFAULT_FIELD_SIZE = 3;

    private final int FIELD_SIZE;

    private static char[][] field;

    //================== Constructors ====================//

    public Field(){

        this(DEFAULT_FIELD_SIZE);
    }

    public Field(int fieldSize){
        FIELD_SIZE = fieldSize;
        field = new char[FIELD_SIZE][FIELD_SIZE];
        eraseField();
    }

    //================== Methods =========================//

    public void showField() {
        System.out.println("-------------");
        for (int i = 0; i < FIELD_SIZE; i++) {
            drawLine(i);
        }
    }

    private void drawLine(int lineNum){
        for (int i = 0; i < FIELD_SIZE; i++){
            drawCell(i, lineNum);
        }
        System.out.print("|");
        System.out.println("\n-------------");
    }

    private void drawCell(int x, int y){

        System.out.print("| " + field[x][y] + " ");
    }

    public void eraseField(){
        for (int i = 0; i <FIELD_SIZE; i++){
            eraseLine(i);
        }
    }

    private void eraseLine(int lineNum){
        for (int i = 0; i < FIELD_SIZE; i++){
            eraseCell(i,lineNum);
        }
    }

    private void eraseCell(int x, int y){
        field[x][y] = DEF_FIELD;
    }

    public static void writeCell(char value, int x, int y){
        if (x < field.length && y <field.length ) {
            if (value == 'X' || value == 'O') {
                if (field[x][y] == 0 || field[x][y] == ' ') {
                    field[x][y] = value;
                } else {
                    System.out.println("Current cell is already written!");
                }
            } else {
                System.out.println("Wrong symbol! You can use only O or X");
            }
        } else {
            System.out.println("Current cell is out of array!");
        }
    }

    public static boolean isCellFree(int row, int column){
        return field[row][column] == DEF_FIELD;
    }

    public char[][] getField() {
        return field;
    }
}

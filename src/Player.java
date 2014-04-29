
public class Player {

    //================== Declaration =====================//

    public static final char CROSS_CHAR = 'X';

    public static final char ZERO_CHAR = 'O';

    private static final char DEF_CHAR = 'O';

    private char playerSign;

    private String name;

    private static final String DEFAULT_NAME = "Player";

    //================== Constructors ====================//

    public Player(){
        this(DEFAULT_NAME,DEF_CHAR);
    }

    public Player(String playerName, char newPlayerSign){
        name = playerName;
        playerSign = newPlayerSign;
    }

    //================== Methods =========================//


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPlayerSign() {
        return playerSign;
    }

    public void setPlayerSign(char playerSign) {
        this.playerSign = playerSign;
    }
}

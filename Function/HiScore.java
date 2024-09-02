package Function;

public class HiScore {
    

    public static void displayHighScorePosition (String name2,int pos2)
    {
        System.out.println(name2+""+"Your position is"+pos2);

    }

    public static int calculateHighscorePoition(int hscore)
    {
        int pos1;                                   
        if (hscore >= 1000)
        {
            pos1=1;
        }
        else if (hscore >=500 && hscore <100)
        {
            pos1=2;
        }
        else if (hscore >=100 && hscore <500)
        {
            pos1=3;
        }
        else
        {
            pos1=4;
        }
        return pos1;
    }

    public static void main(String[] args) {
        {
            int pos = calculateHighscorePoition(1200);
            String name = "Ramesh";
            displayHighScorePosition(name, pos);
        }
    }
}

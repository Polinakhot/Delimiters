import java.util.*;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> result = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                result.add(token);
            }
        }
        return result;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int balance = 0;
        for (String token : delimiters) {
            if (token.equals(openDel)) {
                balance++;
            } else if (token.equals(closeDel)) {
                balance--;
                if (balance < 0) return false;
            }
        }
        return balance == 0;
    }
}

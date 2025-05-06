import java.util.*;

public class Main {
    public static void main(String[] args) {
        Delimiters d1 = new Delimiters("(", ")");
        String[] tokens1 = { "(", "x + y", ")", "* 5" };
        ArrayList<String> list1 = d1.getDelimitersList(tokens1);
        System.out.println("Test 1 (Math): " + d1.isBalanced(list1)); 

        Delimiters d2 = new Delimiters("(", ")");
        String[] tokens2 = { "(", "x + y", "* 5" };
        ArrayList<String> list2 = d2.getDelimitersList(tokens2);
        System.out.println("Test 2 (Math Unbalanced): " + d2.isBalanced(list2)); 

        Delimiters d3 = new Delimiters("<B>", "</B>");
        String[] tokens3 = { "<B>", "Make this text bold", "</B>" };
        ArrayList<String> list3 = d3.getDelimitersList(tokens3);
        System.out.println("Test 3 (HTML): " + d3.isBalanced(list3)); 

        Delimiters d4 = new Delimiters("<B>", "</B>");
        String[] tokens4 = { "<B>", "Make this text bold", "</UB>" };
        ArrayList<String> list4 = d4.getDelimitersList(tokens4);
        System.out.println("Test 4 (HTML Invalid): " + d4.isBalanced(list4)); 
        Delimiters d5 = new Delimiters("<sup>", "</sup>");
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"));
        System.out.println("Test 5: " + d5.isBalanced(list5)); 

        ArrayList<String> list6 = new ArrayList<>(Arrays.asList("<sup>", "</sup>", "</sup>", "<sup>"));
        System.out.println("Test 6: " + d5.isBalanced(list6)); 

        ArrayList<String> list7 = new ArrayList<>(Arrays.asList("</sup>"));
        System.out.println("Test 7: " + d5.isBalanced(list7)); 

        ArrayList<String> list8 = new ArrayList<>(Arrays.asList("<sup>", "<sup>", "</sup>"));
        System.out.println("Test 8: " + d5.isBalanced(list8)); }
}


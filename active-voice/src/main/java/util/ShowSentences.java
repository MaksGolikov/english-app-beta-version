package util;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShowSentences {
    public static void showSentences(Map<Integer, String> sentences, List<String> answers, int randomValue) {
        System.out.println("--------------------------------------------\n");
        System.out.println((char) 27 + "[32m"+sentences.get(randomValue)+(char)27 + "[0m");
        //30 - черный. 31 - красный. 32 - зеленый. 33 - желтый. 34 - синий. 35 - пурпурный. 36 - голубой. 37 - белый.
        System.out.println("\n--------------------------------------------\n");

        System.out.println("Enter correct form:");
        String tmp = new Scanner(System.in).next();
        if (tmp.equals(answers.get(randomValue)))
            System.out.println((char) 27 + "[36mIt is correct! " + (char)27 + "[0m");
        else
            System.err.println("Ooops, you are даун. It's time to go to the дурка");
    }
}

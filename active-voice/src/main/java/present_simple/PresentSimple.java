package present_simple;

import util.IO;
import util.ShowSentences;

import java.io.FileNotFoundException;
import java.util.*;

public class PresentSimple {
    public PresentSimple() throws FileNotFoundException {
        IO io = new IO();
        answers = io.writeList("PresentSimpleAnswers.txt");
        sentences = io.writeMap("PresentSimpleSentences.txt");

        if (!(answers.size() == sentences.size())) {
            System.exit(1);
        }
    }

    private final Map<Integer, String> sentences;
    private final List<String> answers;

    public void show() {
        System.out.println("How many time to repeat this action?");
        int count = new Scanner(System.in).nextInt();
        List<Integer> tmpList = new ArrayList<>();

        if (count > answers.size() && count > sentences.size())
            System.exit(1);

        //проверка на то, что бы не повторялись предложения

//        for (int i = 0; i < count; i++) {
//            int randomValue = (int) (Math.random() * answers.size());
//            for (int j = 0; j < tmpList.size(); j++) {
//                if(tmpList.get(j)==randomValue){
//
//                }
//            }
//            tmpList.add(randomValue);
//            ShowSentences.showSentences(sentences, answers, );
//        }

        for (int i = 0; i < count; i++) {
            int randomValue = (int) (Math.random() * answers.size());
            ShowSentences.showSentences(sentences, answers, randomValue);
        }
    }
}

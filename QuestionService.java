package Projects.Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "OOP Language", "Java", "CPP", "Python", "CSharp", "Java");
        questions[1] = new Question(2, "Which language is platform independent?", "C", "C++", "Java", "Python", "Java");
        questions[2] = new Question(3, "Which language is mainly used for AI/ML?", "C#", "Java", "Python", "PHP", "Python");
        questions[3] = new Question(4, "Which is a compiled language?", "Python", "JavaScript", "C++", "PHP", "C++");
        questions[4] = new Question(5, "Which language is developed by Microsoft?", "Java", "C#", "Python", "C", "C#");

    }


    public void PlayQuiz() {
        int i = 0;
        for(Question q : questions){
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner input = new Scanner(System.in);
            selection[i] = input.nextLine();
            i++;
        }

        for(String s : selection){
            System.out.println(s);
        }

    }

    public void printScore(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];

            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is " + score);
    }
}

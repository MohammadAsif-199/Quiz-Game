package Projects.Quiz;

public class Main {
    public static void main(String[] args) {
        QuestionService quiz = new  QuestionService();
        quiz.PlayQuiz();
        quiz.printScore();
    }
}

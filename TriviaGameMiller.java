
/*
 1. Alex Miller
 2. 10 July, 2022
 3. This program utilizes arrays to play a simple trivia game with the user that has five questions.
 4. This program is complete and looks like the sample input but is late by a few days so I would hope to recieve around 60 due to it being late.
 */
import java.util.*;

public class TriviaGameMiller {
  public static final int SIZE = 5;
  // class constant for size of arrays

  // calls the method run
  public static void main(String[] args) {
    run();
  }

  // creates a scanner and initializes the arrays questions answers and points and
  // uses a while loops to play the trivia game
  public static void run() {
    Scanner kb = new Scanner(System.in);
    String[] questions = new String[SIZE];
    String[] answers = new String[SIZE];
    int[] points = new int[SIZE];
    initialize(questions, answers, points);
    boolean more = true;
    while (more) {
      int score = play(questions, answers, points, kb);
      System.out.println("Your score is: " + score);
      System.out.println("Is there another person who wants to play the game? Yes or no.");
      String another = kb.nextLine();
      if (another.toLowerCase().equals("no")) {
        more = false;
      }
    }
  }

  // this method fills the elements in the arrays questions, answers, and points
  public static void initialize(String[] questions, String[] answers, int[] points) {
    questions[0] = "When you first start to control your character, where are you?";
    answers[0] = "in a van";
    points[0] = 1;
    questions[1] = "You get your first Pokémon in Littleroot Town, but which Professor gives you your first Pokémon?";
    answers[1] = "professor birch";
    points[1] = 1;
    questions[2] = "Before challenging the Pokémon League Champion, you have to defeat a group of Elites first. How many of the Elites are there?";
    answers[2] = "four";
    points[2] = 2;
    questions[3] = "What is your dad's profession in this game?";
    answers[3] = "gym leader";
    points[3] = 2;
    questions[4] = "Where can you find Rayquaza in the game?";
    answers[4] = "sky pillar";
    points[4] = 3;
  }

  // this method plays the game and takes user input and compares it to the
  // correct answer
  public static int play(String[] questions, String[] answers, int[] points, Scanner kb) {
    int score = 0;
    for (int i = 0; i < SIZE; i++) {
      System.out.println(questions[i]);
      String userAnswer = kb.nextLine();
      if (userAnswer.toLowerCase().equals(answers[i])) {
        score += points[i];
        System.out.println("That is correct!");
      } else {
        System.out.println("Wrong answer. The correct answer is: " + answers[i]);
      }
    }
    return score;
  }
}
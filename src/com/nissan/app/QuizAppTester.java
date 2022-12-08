package com.nissan.app;

import static com.nissan.util.QuizAppUtil.getStatesAndCapitals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.nissan.model.QuizClass;

public class QuizAppTester {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);
				BufferedReader brRead = new BufferedReader(
						new InputStreamReader(System.in))) {
			Map<String, String> hashMap = getStatesAndCapitals();

			Set<String> stateSet = hashMap.keySet();
			List<QuizClass> quizClassList = new ArrayList<>();
			int score = 0;

			System.out.println("Enter your name: ");
			String name = brRead.readLine();

			boolean loop = true;

			while (loop) {
				System.out.println("Press 1 to start the quiz");
				System.out.println("Press 2 to see your report");
				System.out.println("Press 3 to exit");
				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					Iterator<String> stateIterator = stateSet.iterator();
					int i = 0;
					while (stateIterator.hasNext() && i++ < 5) {
						String state = stateIterator.next();
						String question = "What is the capital of " + state;
						System.out.println(question);
						String answer = brRead.readLine();
						if (hashMap.get(state).equalsIgnoreCase(answer)) {
							score++;
						}

						quizClassList.add(new QuizClass(question, hashMap
								.get(state), answer, hashMap.get(state)
								.equalsIgnoreCase(answer)));
					}
					break;

				case 2:
					System.out.println("Displaying " + name
							+ "'s quiz report.........");
					System.out
							.println("===========================================================================================");
					System.out.printf("%100s", name + "'s Quiz Report\n");
					System.out
							.println("===========================================================================================");
					System.out.println(String.format("%-20s%20s%50s%40s%20s",
							"Ques No.", "Question", "Correct Answer",
							"Your Answer", "Score"));
					System.out
							.println("===========================================================================================");
					int serialNo = 0;
					for (QuizClass quizClass : quizClassList) {
						byte point = 0;
						if (quizClass.isScored()) {
							point = 1;
						}
						System.out.println(String.format(
								"%-20s %20s%45s%40s%20s", ++serialNo,
								quizClass.getQuestion(),
								quizClass.getActualAnswer(),
								quizClass.getYourAnswer(), point));
					}
					System.out
							.println("===========================================================================================");
					System.out.println(name + " has scored " + score
							+ " out of 5");
					System.out
							.println("===========================================================================================");
					break;

				case 3:
					loop = false;
					break;

				default:
					System.out.println("Not a valid choice!!!");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

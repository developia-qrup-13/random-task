package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random randnum = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomNumber = randnum.nextInt(1000);
		System.out.println("Random number is " + randomNumber);
		int tryCount = 0;
		while (true) {
			System.out.println("Enter your guess (1-1000):");
			int playerGuess = scanner.nextInt();
			tryCount++;
			if (playerGuess == randomNumber) {
				System.out.println("Correct! You Win!");
				System.out.println("It took you " + tryCount + " tries");
				break;
			} else if (randomNumber > playerGuess) {
				System.out.println("Kiçik ədəd daxil etdiniz");
				System.out.println("Yeniden Texmin edin");
			} else {
				System.out.println("Böyük ədəd daxil etdiniz");
				System.out.println("Yeniden Texmin edin");
			}
		}
		scanner.close();
	}
}
package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Random r = new Random();
		    Scanner scanner = new Scanner(System.in);
		    
		    int randomNumber = r.nextInt(1000) + 1;
		    
		    int say = 0;//sayir
		    while(true) {
		      System.out.println("Ededi daxil edin:");
		      
		      int texmin = scanner.nextInt();
		      say++;
		      
		      if (texmin == randomNumber) {
		        System.out.println("Tebrikler.");//texmin randomNumbere beraber olanda mesaj cixardir
		        System.out.println("Ededi " + say + "-ci cehdinizde tapdiniz");//nece defe cehd etdiyinizi gosterir
		        break;
		      }
		      else if(randomNumber > texmin) {
		        System.out.println("Kicik eded daxil etdiniz.");
		      }
		      else {
		        System.out.println("Boyuk eded daxil etdiniz.");
		      }
		    }
		    scanner.close(); 
		  }
	}
package main;

import java.util.Scanner;
import jindongsu.TestJIndongsu;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		TestJIndongsu tdongsu = new TestJIndongsu();
		while(true) {
			System.out.println("1.한길용 2.이진원 3.진동수 4.이창훈 5.이동호");
			num = input.nextInt();
			switch(num) {
			case 1 : break;
			case 2 : break;
			case 3 : 
					 tdongsu.disp();
					 break;
			case 4 : break;
			case 5 : break;
			}
		}
	}
}

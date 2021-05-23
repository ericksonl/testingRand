//Created by: Liam Erickson
//Date: 5/22/2021
//Name: Main.java


import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main (String args []) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~Testing the java.util.Random Random Number Generator~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		int zero = 0, one = 0, two = 0, thre = 0, four = 0, fiv = 0, six = 0, sven = 0, eit = 0, nine = 0, ten = 0;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to generate?");
		int thous = sc.nextInt();
		System.out.println("Generating " + thous + " random numbers between 0 and 10 (inclusive)... \n");
		
		for (int i = 0; i < thous; i++) {
			int rand = ran.nextInt(11);
			if (rand == 0) {zero = zero + 1;}
			else if (rand == 1) {one = one + 1;}
			else if (rand == 2) {two = two + 1;}
			else if (rand == 3) {thre = thre + 1;}
			else if (rand == 4) {four = four + 1;}
			else if (rand == 5) {fiv = fiv + 1;}
			else if (rand == 6) {six = six + 1;}
			else if (rand == 7) {sven = sven + 1;}
			else if (rand == 8) {eit = eit + 1;}
			else if (rand == 9){nine = nine + 1;}
			else if (rand == 10) {ten = ten + 1;}
			else {}
		}
		System.out.println("Number of zeros: " + zero
				+ "\n" + "Number of ones: " + one 
				+ "\n" + "Number of twos: " + two 
				+ "\n" + "Number of threes: " + thre 
				+ "\n" + "Number of fours: " + four 
				+ "\n" + "Number of fives: " + fiv 
				+ "\n" + "Number of sixs: " + six
				+ "\n" + "Number of sevens: " + sven
				+ "\n" + "Number of eights: " + eit
				+ "\n" + "Number of nines: " + nine
				+ "\n" + "Number of tens: " + ten);
		int total = zero + one + two + thre + four + fiv + six + sven + eit + nine + ten;
		System.out.println("Total: " + total);
		
		double zeroPerc = ((double) zero)/thous * 100,
				onePerc = ((double) one)/thous * 100, 
				twoPerc = ((double) two)/thous * 100, 
				threPerc = ((double) thre)/thous * 100,
				fourPerc = ((double) four)/thous * 100,
				fivPerc = ((double) fiv)/thous * 100,
				sixPerc = ((double) six)/thous * 100,
				svenPerc = ((double) sven)/thous * 100,
				eitPerc = ((double) eit)/thous * 100,
				ninePerc = ((double) nine)/thous * 100,
				tenPerc = ((double) ten)/thous * 100; 
		
		System.out.println("\n" + "Percent zero: " + zeroPerc + "%"
				+ "\n" + "Percent one: " + onePerc + "%"
				+ "\n" + "Percent two: " + twoPerc + "%"
				+ "\n" + "Percent three: " + threPerc + "%"
				+ "\n" + "Percent four: " + fourPerc + "%"
				+ "\n" + "Percent five: " + fivPerc + "%"
				+ "\n" + "Percent six: " + sixPerc + "%"
				+ "\n" + "Percent seven: " + svenPerc + "%"
				+ "\n" + "Percent eight: " + eitPerc + "%"
				+ "\n" + "Percent nine: " + ninePerc + "%"
				+ "\n" + "Percent ten: " + tenPerc + "%");
		double totalPerc = zeroPerc + onePerc + twoPerc + threPerc + fourPerc + fivPerc + sixPerc + svenPerc + eitPerc + ninePerc + tenPerc;
		System.out.println("Total: " + totalPerc + "%");
		sc.close();
	}
}


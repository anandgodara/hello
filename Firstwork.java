/*  Created by IntelliJ IDEA.
 *   Author: Anand Godara
 *   Date: 16/07/20
 *   Time: 7:45 AM
 *   File: Firstwork.java
 */

import java.util.Scanner;
public class Firstwork {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String stuName = scn.next();
        System.out.println("Please enter your father's name: ");
        String fatName = scn.next();
        System.out.println("Please enter your mother's name: ");
        String motName = scn.next();
        System.out.println("Please enter address: ");
        String address = scn.next();
        System.out.println("Please enter your contact No. : ");
        long stuContNo = scn.nextLong();
        System.out.println("Please enter your father's contact No. : ");
        long fatContNo = scn.nextLong();
        System.out.println("Please enter your mother's contact No. : ");
        long motContNo = scn.nextLong();
        System.out.println("Please enter your percentage in 12th: ");
        double perInTwelve = scn.nextDouble();
        System.out.println("Please enter your percentage in 10th: ");
        double perInTen = scn.nextDouble();
        System.out.println("Please enter your hostChoice: ");
        boolean hostChoice = scn.nextBoolean();
        scn.close();
        System.out.println("Name : " + stuName + "\nFathre's Name : " + fatName + "\nMother's Name : " + motName + "\nAddress : "
         + address + "\nContact No : " + stuContNo + "\nFather's No : " + fatContNo + "\nMother's No : " + motContNo + "\n12th Precentage : " + 
         perInTwelve + "\n10th Percentage : " + perInTen + "\nHost Choice : " + hostChoice);
    }
}

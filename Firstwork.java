/*  Created by IntelliJ IDEA.
 *   Author: Nishant Mishra
 *   Date: 16/07/20
 *   Time: 7:45 AM
 *   File: Firstwork.java
 */

import java.util.Scanner;
public class Firstwork {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String stuName = scn.next();
        String fatName = scn.next();
        String motName = scn.next();
        String address = scn.next();
        long stuContNo = scn.nextLong();
        long fatContNo = scn.nextLong();
        long motContNo = scn.nextLong();
        double perInTwelve = scn.nextDouble();
        double perInTen = scn.nextDouble();
        boolean hostChoice = scn.nextBoolean();
        scn.close();
        System.out.println("Please enter your name: "+ stuName);
        System.out.println("Please enter your father's name: "+ fatName);
        System.out.println("Please enter your mother's name: "+ motName);
        System.out.println("Please enter your permanent address: "+ address);
        System.out.println("Please enter your contact number: "+ stuContNo);
        System.out.println("Please enter your father's contact number: "+ fatContNo);
        System.out.println("Please enter you mother's contact number: "+ motContNo);
        System.out.println("Percentage in 12th: "+ perInTwelve);
        System.out.println("Percentage in 10th: "+ perInTen);
        System.out.println("Hostel Choice: "+ perInTen);
    }
}

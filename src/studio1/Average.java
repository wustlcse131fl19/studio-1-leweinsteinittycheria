package studio1;

import support.cse131.ArgsProcessor;
public class Average {
    public static void main (String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What is the first number?");
        int n2 = ap.nextInt("What is the second number?");
        double average= (double)(n1+n2)/2;
        System.out.println("The average of these two numbers is " +average);
    }
}

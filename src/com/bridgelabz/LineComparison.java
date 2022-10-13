package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    static double calculateLine1Length(double x11,double y11,double x12,double y12){

        double line1Length = Math.sqrt(Math.pow(x12-x11,2)+Math.pow(y12-y11,2));

        return line1Length ;


    }

    static double calculateLine2Length(double x21,double y21,double x22,double y22){
        double line2Length = Math.sqrt(Math.pow(x22-x21,2)+Math.pow(y22-y21,2));

        return line2Length;
    }

    static void comparingLengthOfLines(double length1,double length2 ){

        Double line1 = Double.valueOf(length1);
        Double line2 = Double.valueOf(length2);

        int res = line1.compareTo(line2);

        if (res == 0){
            System.out.println("Line 1 length is equal to Line 2 length");
        }
        else if (res == 1) {
            System.out.println("Line 1 length is greater than Line 2 length");
        }
        else {
            System.out.println("Line 1 length is smaller than Line 2 length");
        }
    }

    static void checkingEqualityOfLines(double length1 , double length2 ){

        Double line1 = Double.valueOf(length1);
        Double line2 = Double.valueOf(length2);

        boolean result = line1.equals(line2);

        if (result == true){
            System.out.println("Line 1 length is equal to Line 2 length");
        }
        else {
            System.out.println("Line 1 length is not equal to Line 2 length");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line1 x11 co-ordinate");
        double x11 = sc.nextInt();
        System.out.println("Enter Line1 y11 co-ordinate");
        double y11 = sc.nextInt();
        System.out.println("Enter Line1 x12 co-ordinate");
        double x12 = sc.nextInt();
        System.out.println("Enter Line1 y12 co-ordinate");
        double y12 = sc.nextInt();
        System.out.println("Enter Line2 x21 co-ordinate");
        double x21 = sc.nextInt();
        System.out.println("Enter Line2 y21 co-ordinate");
        double y21 = sc.nextInt();
        System.out.println("Enter Line2 x22 co-ordinate");
        double x22 = sc.nextInt();
        System.out.println("Enter Line2 y22 co-ordinate");
        double y22 = sc.nextInt();
        System.out.println();
        double line1 = calculateLine1Length(x11,y11,x12,y12);
        System.out.println("Line 1 length = " + line1);
        double line2 = calculateLine2Length(x21,y21,x22,y22);
        System.out.println("Line 1 length = " + line2);
        System.out.println();
        checkingEqualityOfLines(line1,line2);
        System.out.println();
        comparingLengthOfLines(line1,line2);



    }
}

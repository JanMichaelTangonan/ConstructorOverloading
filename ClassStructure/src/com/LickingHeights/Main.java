package com.LickingHeights;

import java.util.Scanner;

public class Main {

    private Scanner scanner;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System. in);
        //Main main = new Main();
       doSquare(scanner);

        }

public static void doSquare(Scanner sc){
    System.out.println("What is the length and width of the square separated by a space?");

    int length = sc.nextInt();
    int width = sc.nextInt();
    Square square = new Square(length);

    System.out.println("I made a square with the following dimensions: "+ square.getLength() +" "+ square.getWidth());

}

public void doRectangle(){

        System.out.println("What is the length and width of the rectangle separated by a space?");

        double length2 = scanner.nextInt();
        double width2 = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length2,width2);

        System.out.println ( "I made a rectangle with the following dimensions"+rectangle.getlength() +" "+ rectangle.getWidth());




    }








    }


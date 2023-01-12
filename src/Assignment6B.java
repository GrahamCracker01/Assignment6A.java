//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment6B {

    //int
    public static String WhatsMyType(int i) {
        return ("'" + i + "' is an int value!");
    }

    //int
    public static String WhatsMyType(String i) {
        return ("'" + i + "' is a string value!");
    }

    //int
    public static String WhatsMyType(float i) {
        return ("'" + i + "' is a float value!");
    }

    //int
    public static String WhatsMyType(char i) {
        return ("'" + i + "' is a char value!");
    }

    //int
    public static String WhatsMyType(boolean i) {
        return ("'" + i + "' is a boolean value!");
    }

    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intInput;
        String strInput, strInputMain;
        float fltInput;
        char charInput;
        boolean boolInput;

        //initial output and get input
        System.out.print("[What's my datatype?]\n" +
                "Enter an int: ");
        intInput = scan.nextInt();
        System.out.print("Enter a string: ");
        strInput = scan.next();
        System.out.print("Enter a float: ");
        fltInput = scan.nextFloat();
        System.out.print("Enter a char: ");
        charInput = scan.next().charAt(0);
        System.out.print("Enter a boolean: ");
        boolInput = scan.nextBoolean();

        System.out.println("What datatype do you want to check?");
        strInputMain = scan.next();

        //if statements calling WhatsMyType
        if (strInputMain.equals("int")) {
            System.out.println(WhatsMyType(intInput));
        }
        else if (strInputMain.equals("string")) {
            System.out.println(WhatsMyType(strInput));
        }
        else if (strInputMain.equals("float")) {
            System.out.println(WhatsMyType(fltInput));
        }
        else if (strInputMain.equals("char")) {
            System.out.println(WhatsMyType(charInput));
        }
        else if (strInputMain.equals("boolean")) {
            System.out.println(WhatsMyType(boolInput));
        }
    }
}
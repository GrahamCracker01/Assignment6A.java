//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
import java.util.Random;
class Assignment6A {

    //randomize array
    public static void create_random_array(int[] array, int array_size){
        Random rand = new Random();
        for (int i = 0; i < array_size; i++) {
            array[i] = (rand.nextInt(1000) - 500);
        }
        System.out.print("Random Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    //sort check
    public static boolean is_array_sorted(int[] array, int array_size) {
        for (int i = 0; i < (array_size - 1); i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //selection sort array
    public static void sort_array(int[] array, int array_size) {
        int n = array.length;
        for (int i = 0; i < (n - 1); i++) {
            int minIndex = i;
            for (int j = (i + 1); j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        boolean boolStop = false, boolCheck;
        int[] array;
        int intInput;
        array = new int[10];

        //initial output
        System.out.println("[Is It Sorted?]");
        create_random_array(array, 10);

        //main loop
        while (!boolStop) {
            System.out.print("\nWhat do you want to do?\n" +
                    "1) Generate a new random array\n" +
                    "2) Is the array sorted?\n" +
                    "3) Sort the array\n" +
                    "4) Quit\n\n" +
                    "Choice: ");
            intInput = scan.nextInt();

            //new random array
            if (intInput == 1) {
                create_random_array(array, 10);
            }

            //check if array is sorted
            else if (intInput == 2) {
                boolCheck = is_array_sorted(array, 10);
                if (!boolCheck) {
                    System.out.println("The array is not sorted.");
                }
                else {
                    System.out.println("The array is sorted.");
                }
            }

            //sort array
            else if (intInput == 3) {
                sort_array(array, 10);
            }
            else {
                boolStop = true;
            }
        }

    }
}
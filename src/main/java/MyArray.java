package main.java;

/**
 * Generating array with random values [-10, 10]
 * Then searching max negative value and min positive value
 * Swaps them, and print in console
 * @author Blokhin Nikita
 */
public class MyArray {
    public static void main(String args[]) {
        int indexOfMax = 0;
        int indexOfMin = 0;
        int[] arr = new int[20];
        System.out.println("Our array with random values [-10,10] is: ");
        //fill array with random values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random()*21)-10);;
            System.out.print(arr[i] + " ");
        }
        //searching for first negative value in array. Let it be first 'max' negative value
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < 0) {
                indexOfMax = i;
                break;
            }
        }
        //searching for first positive value in array. Let it be first 'min' positive value
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > 0) {
                indexOfMin = i;
                break;
            }
        }
        //searching index of max negative value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (arr[i] > arr[indexOfMax]) {
                    indexOfMax = i;
                }
            }
        }
        //searching index of min positive value
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > 0) {
                    if (arr[i] < arr[indexOfMin]) {
                        indexOfMin = i;
                    }
                }
            }

        System.out.println(" ");
        System.out.println("Max negative element is on: " + (indexOfMax + 1));
        System.out.println("Min positive element is on: " + (indexOfMin + 1));
        System.out.println("Lets swap them");
        System.out.println("Swapped array looks like: ");
        //swaps max and min values
        int temp = arr[indexOfMax];
        arr[indexOfMax] = arr[indexOfMin];
        arr[indexOfMin] = temp;
        for (int i : arr)
            System.out.print(i + " ");
    }

}


package org.example.algos;


public class Sorting {

    public int[] bubbleSort(int[] numbers){
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }

    public int[] selectionSort(int[] numbers) {
        for(int i = 0; i< numbers.length; i++) {
            int min = i;
            int temp = numbers[min];
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < numbers[min]){
                    min = j;
                }
            }
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
        return numbers;
    }

    public int[] insertionSort(int[] numbers) {
        int arraySize = numbers.length;
        for(int j = 1; j < arraySize; j++ ){
            int key = numbers[j];
            int i = j-1;
            while((i > -1) && numbers[i] > key) {
                numbers[i+1] = numbers[i];
                i--;
            }
            numbers[i+1] = key;
        }
        return numbers;
    }

    public void mergeSort(int[] array) {
        int[] helper = new int[array.length];
         mergeSort(array, helper, 0, array.length - 1);
    }

    public void mergeSort(int[] array, int[] helper, int low, int high) {
        if(low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, helper, low, middle);
            mergeSort(array, helper, middle + 1, high);
            merge(array, helper, low, middle, high);
        }
    }
    public void merge(int[] array, int[] helper, int low, int middle, int high) {
        /* Copy both halves into helper array */
        for(int i = low; i<= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle+1;
        int current = low;

        /* Iterate through helper array. COmpare the left and right halves, copying
        * back the smaller element from the two halves into the original array*/
        while (helperLeft <= middle && helperRight <= high) {
            if(helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        /* Copy the rest of the left side of the array into the target array */
        int remaining = middle - helperLeft;
        for(int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}

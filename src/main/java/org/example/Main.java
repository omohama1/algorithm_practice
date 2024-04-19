package org.example;

import org.example.algos.BinarySearchTree;
import org.example.algos.Node;
import org.example.algos.Sorting;

public class Main {
    public static void main(String[] args) {
        /*
        Sorting sorting = new Sorting();
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] bubbleSorted =  {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] selectionSorted =  {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] insertionSorted =  {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] mergeSorted = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Bubble sort");
        bubbleSorted = sorting.bubbleSort(bubbleSorted);
        for(int i =0; i< bubbleSorted.length; i++) {
            System.out.print(bubbleSorted[i] + " ");
        }
        System.out.println();

        System.out.println("Selection sort");
        selectionSorted = sorting.selectionSort(selectionSorted);
        for(int i =0; i< selectionSorted.length; i++) {
            System.out.print(selectionSorted[i] + " ");
        }
        System.out.println();

        System.out.println("Insertion sort");
        insertionSorted = sorting.insertionSort(insertionSorted);
        for(int i =0; i< insertionSorted.length; i++) {
            System.out.print(insertionSorted[i] + " ");
        }
        System.out.println();

        System.out.println("Merge sort");
       sorting.mergeSort(mergeSorted);
        for(int i =0; i< mergeSorted.length; i++) {
            System.out.print(mergeSorted[i] + " ");
        }
        */
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Node(5));
        bst.insert(new Node(1));
        bst.insert(new Node(9));
        bst.insert(new Node(7));
        bst.insert(new Node(3));
        bst.insert(new Node(6));
        bst.insert(new Node(4));
        bst.insert(new Node(8));
        bst.display();
        System.out.println(bst.search(0));
        System.out.println(bst.search(9));
        System.out.println(bst.search(1));
        System.out.println(bst.search(10));
        bst.remove(1);
        bst.remove(5);
        bst.remove(9);
        bst.remove(0);
        bst.display();

    }
}
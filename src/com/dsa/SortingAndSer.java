package com.dsa;

import java.util.Arrays;
import java.util.Scanner;


public class SortingAndSer {
	
	Scanner scan;
	int[] array;
	int n;
	int begin = 0;
	int end;
	int searchElement;
	
	SortingAndSer(){
		System.out.print(" ___________________________________________________________________________________________\n");
		System.out.print("|                                           		                                    |\n");
		System.out.print("|                                           		                                    |\n");
		System.out.print("|                                           		                                    |\n");
		System.out.print("|                                           		                                    |\n");
		System.out.print("|                                           		                                    |\n");
		System.out.print("|                                           		                                    |\n");
		System.out.print("|                            WELCOME TO SORTING AND SERCHING TOOL                    |\n");
		System.out.print("|                                                                                           |\n");
		System.out.print("|                                                                                           |\n");
		System.out.print("|                                                                                           |\n");
		System.out.print("|                                                                                           |\n");
		System.out.print("|                                                                                           |\n");
		System.out.print("|                                                                                           |\n");
		System.out.print("|                                         -Brought To You by                                |\n");
		System.out.print("|                                      	 group 3 dcit 204       |\n");
		System.out.print("|___________________________________________________________________________________________|\n");
		
		System.out.print("Enter your array size: ");
		scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.print("Enter the elements of your array \n");
		System.out.println("For binarySearch items must be entered in a sorted order:");
		this.array = new int[n];
		for (int i = 0; i<n; i++) {
			array[i] = scan.nextInt();	
		}
		end = array.length-1;
		
	}
	
	
		
		
	
	
	private void pressAnyKeyToContinue(){ 
	        System.out.println("Press Enter key to try with a different algorithms...");
	        try{
	            System.in.read();
	        }catch(Exception e){
	        System.out.println("Press 'Enter' key to continue!");
	        }  
	 }
	
	
	void menu(){
		char k;
		//giving option to the user for their choice
		System.out.print("_______________________________________________________________________________________ \n");
		System.out.print("  			SEARCH AND SORT ALGORITHM \n\n");	
		System.out.print("_______________________________________________________________________________________ \n");
		System.out.print("Please, Choose from the following Options: \n\n");
		System.out.print(" _________________________________________________________________ \n");
		System.out.print("|                                           	                  	|\n");
		System.out.print("|             1  >> BUBLE SORT                        			|\n");
		System.out.print("|             2  >> INSERTION SORT            					|\n");
		System.out.print("|             3  >> SELECTION SORT                  		 		|\n");
		System.out.print("|             4  >> MERGE SORT		             		  	  	|\n");
		System.out.print("|             5  >> HEAP SORT		             		  	  		|\n");
//		System.out.print("|             6  >> QUIK SORT		             		  	  		|\n");
		System.out.print("|             *  **********************		             		|\n");
		System.out.print("|             A  >> LINEAR SEARCH		             		  	  	|\n");
		System.out.print("|             B  >> BINARY SEARCH		             		  	  	|\n");
//		System.out.print("|             C  >> RECURSIVE SEARCH		             		  	|\n");
		System.out.print("|             *  **********************		             		|\n");
		System.out.print("|             E  >> EXIT  		             		  	  		|\n");		
		System.out.print("|_________________________________________________________________|\n\n");
		System.out.print("Enter your choice algorithm: ");
		k=scan.next().charAt(0);
		if(k=='B')
			System.out.println("Elements must be entered in a sorted order!");
		if(k=='A' || k=='B' || k=='C') {
			System.out.println("Enter SearchElement: ");
			searchElement = scan.nextInt();
		}
		
		
			
		//if inputed choice is other than given choice
		switch(k) {
			case '1': bubbleSort();
				break;
			case '2': insertionSort();
				break;
			case '3': selectionSort();
				break;
			case '4': mergeSort(array, begin, end);
				break;
			case '5': heapSort(array);
				break;
			case 'A': linearSearch(array, searchElement);
				break;
			case 'B': binarySearch();
				break;
			case 'E': exit();
			break;
			default: System.out.print("\n\n\t\t\t\t\t\tInvalid Choice\n");
		  System.out.print("\t\t\t\t\t\tTry again...........\n\n");
		}
		
		
		pressAnyKeyToContinue();
		menu();
	}
	
	
	void exit(){
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\n");
		System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
		System.out.print("\t\t\t\t\t|                                           		                                |\n");
		System.out.print("\t\t\t\t\t|                                           		                                |\n");
		System.out.print("\t\t\t\t\t|                                           		                                |\n");
		System.out.print("\t\t\t\t\t|                                           		                                |\n");
		System.out.print("\t\t\t\t\t|                                           		                                |\n");
		System.out.print("\t\t\t\t\t|                               THANK YOU FOR USING                                     |\n");
		System.out.print("\t\t\t\t\t|                                                                                       |\n");
		System.out.print("\t\t\t\t\t|                           SEARCH AND SORT ALGORITHM                           |\n");
		System.out.print("\t\t\t\t\t|                                                                                       |\n");
		System.out.print("\t\t\t\t\t|                                                                                       |\n");
		System.out.print("\t\t\t\t\t|                                                                                       |\n");
		System.out.print("\t\t\t\t\t|                                                                                       |\n");
		System.out.print("\t\t\t\t\t|                                                                                       |\n");
		System.out.print("\t\t\t\t\t|                                              -Brought To You by group 3  |\n");
		System.out.print("\t\t\t\t\t|_______________________________________________________________________________________|\n");
		System.out.print("\t\t\t\t\t\n\n\n\n\t\t\t\t\t");
		System.exit(0);
	}
	
	void bubbleSort() {
		boolean sorted = false;
		int temp;
		System.out.println("The outcome of sorting algorithm using BUBBLE sort: ");
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i+1]) {
	                temp = array[i];
	                array[i] = array[i+1];
	                array[i+1] = temp;
	                sorted = false;
	            }
	        }
	        System.out.println(Arrays.toString(array));
	    }
	    
	}
	
	
	void insertionSort() {
		System.out.println("The outcome of sorting algorithm using INSERTION Sort: ");

		
	    for (int i = 1; i < array.length; i++) {
	        int current = array[i];
	        int j = i - 1;
	        while(j >= 0 && current < array[j]) {
	            array[j+1] = array[j];
	            j--;
	        }
	        // at this point we've exited, so j is either -1
	        // or it's at the first element where current >= a[j]
	        array[j+1] = current;
	    }
        System.out.println(Arrays.toString(array));

	}
	
	
	void selectionSort() {
		System.out.println("The outcome of sorting algorithm using SELECTION sort: ");

	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        int minId = i;
	        for (int j = i+1; j < array.length; j++) {
	            if (array[j] < min) {
	                min = array[j];
	                minId = j;
	            }
	        }
	        // swapping
	        int temp = array[i];
	        array[i] = min;
	        array[minId] = temp;
	    }
		
        System.out.println(Arrays.toString(array));

	}
	
	
void mergeSort(int[] array, int left, int right) {
	System.out.println("The outcome of sorting algorithm using MERGE sort: ");

    if (right <= left) return;
    int mid = (left+right)/2;
    mergeSort(array, left, mid);
    mergeSort(array, mid+1, right);
    merge(array, left, mid, right);
}

void merge(int[] array, int left, int mid, int right) {
    // calculating lengths
    int lengthLeft = mid - left + 1;
    int lengthRight = right - mid;

    // creating temporary subarrays
    int leftArray[] = new int [lengthLeft];
    int rightArray[] = new int [lengthRight];

    // copying our sorted subarrays into temporaries
    for (int i = 0; i < lengthLeft; i++)
        leftArray[i] = array[left+i];
    for (int i = 0; i < lengthRight; i++)
        rightArray[i] = array[mid+i+1];

    // iterators containing current index of temp subarrays
    int leftIndex = 0;
    int rightIndex = 0;

    // copying from leftArray and rightArray back into array
    for (int i = left; i < right + 1; i++) {
        // if there are still uncopied elements in R and L, copy minimum of the two
        if (leftIndex < lengthLeft && rightIndex < lengthRight) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        // if all the elements have been copied from rightArray, copy the rest of leftArray
        else if (leftIndex < lengthLeft) {
            array[i] = leftArray[leftIndex];
            leftIndex++;
        }
        // if all the elements have been copied from leftArray, copy the rest of rightArray
        else if (rightIndex < lengthRight) {
            array[i] = rightArray[rightIndex];
            rightIndex++;
        }
    }
    System.out.println(Arrays.toString(array));

}

	void heapify(int[] array, int length, int i) {
	    int leftChild = 2*i+1;
	    int rightChild = 2*i+2;
	    int largest = i;
	
	    // if the left child is larger than parent
	    if (leftChild < length && array[leftChild] > array[largest]) {
	        largest = leftChild;
	    }
	
	    // if the right child is larger than parent
	    if (rightChild < length && array[rightChild] > array[largest]) {
	        largest = rightChild;
	    }
	
	    // if a swap needs to occur
	    if (largest != i) {
	        int temp = array[i];
	        array[i] = array[largest];
	        array[largest] = temp;
	        heapify(array, length, largest);
	    }
	}

	void heapSort(int[] array) {
		System.out.println("The outcome of sorting algorithm using HEAP sort: ");

	    if (array.length == 0) 
	    	return;
	
	    // Building the heap
	    int length = array.length;
	    // we're going from the first non-leaf to the root
	    for (int i = length / 2-1; i >= 0; i--)
	        heapify(array, length, i);
	
	    for (int i = length-1; i >= 0; i--) {
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;
	
	        heapify(array, i, 0);
	    }
        System.out.println(Arrays.toString(array));

	}
	

	int partition(int[] array, int begin, int end) {
	    int pivot = end;

	    int counter = begin;
	    for (int i = begin; i < end; i++) {
	        if (array[i] < array[pivot]) {
	            int temp = array[counter];
	            array[counter] = array[i];
	            array[i] = temp;
	            counter++;
	        }
	    }
	    int temp = array[pivot];
	    array[pivot] = array[counter];
	    array[counter] = temp;

	    return counter;
	    
	}
	
	
	void linearSearch(int[] array, int searchElement) {
		this.searchElement = searchElement;
		for(int i = 0; i<array.length; i++) {
			if(array[i]==searchElement) {
				System.out.println("Search Element found at index: "+ i);
			}
		}
	}
	
	void binarySearch(){
		int result = Arrays.binarySearch(this.array, this.searchElement);
		if(result < 0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("elenment found at index: "+result);
		}
	}
		    


	 

		


	public static void main(String[] args) {
		
		SortingAndSer ss = new SortingAndSer();
		ss.menu();
		
	

}
}

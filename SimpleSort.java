public class SimpleSort {
    static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

        int temp;

        temp=arrayToSwap[lowerIndex];

        arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

        arrayToSwap[lowerIndex+1]=temp;

        return arrayToSwap;

        }   
    public static void main(String[] args){
        int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
        System.out.println("Unsorted Array");
        for (int i=0; i<arrayToSort.length; i++){

            System.out.println(arrayToSort[i]);
        }
        Boolean haveswapped = true;
        while(haveswapped){
            haveswapped = false;

            


            for (int i=0; i<arrayToSort.length-1; i++){
                if (arrayToSort[i]>arrayToSort[i+1]){
                    arrayToSort = swapTwoArrayElements(arrayToSort, i);
                    haveswapped = true;
                }   
            }

        }
        System.out.println("sorted Array");
        for (int i=0; i<arrayToSort.length; i++){

            System.out.println(arrayToSort[i]);
        }

    }
}

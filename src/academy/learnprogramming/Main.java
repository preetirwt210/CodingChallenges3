package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  SortedArray sa=new SortedArray();
        int[] myIntegers=SortedArray.getIntegers(5);
        int[] sortedArray= SortedArray.sortIntegers(myIntegers);
       SortedArray.printArray(sortedArray); */

      int wow=MinimumElement.readInteger();
      int[] ok=MinimumElement.readElements(wow);
      System.out.println("Minimum value in the array is: "+ MinimumElement.findMin(ok) );
    }
}

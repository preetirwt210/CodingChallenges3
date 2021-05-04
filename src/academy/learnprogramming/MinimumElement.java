package academy.learnprogramming;

import java.util.Scanner;

public class MinimumElement {

    public static int readInteger(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enters count: ");
        int readInteger=scanner.nextInt();
        return readInteger;
    }
    public static int[] readElements(int number){
        Scanner scanner=new Scanner(System.in);
         int[] array=new int[number];
         for(int i=0;i<array.length;i++){
             System.out.println("Enter values: ");
             int totalElementEntered=scanner.nextInt();
             scanner.nextLine();
             array[i]=totalElementEntered;

         }
        scanner.close();
        return array ;
    }
    public static int findMin(int[] minValue){ //{3,4,2,5,1}
      int min=Integer.MAX_VALUE;// min= max value;
      for(int i=0;i<minValue.length;i++){//0-4
          if (minValue[i]<min) {//3<min true;//4<3 false;//2<3 true//5<2 false//1<2 true
              min=minValue[i];//min=1;
          }
      }return min;
    }
}

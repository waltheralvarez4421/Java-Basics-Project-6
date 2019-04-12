/* 
   Walther Alvarez
   CISC 500
   Assignment #6
   This program prompts the user to first input a sequence of numbers and then a second set of numbers.
   Through the use of a method it then merges two array lists, alternating elements from both array lists. 
   If one array list is shorter than the other, 
   then it alternates as long as is needed and then appends the remaining elements from the longer array list. 
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6
{
   public static void main(String[] args)
    { 
       ArrayList<Integer> a = new ArrayList<Integer>();
 
       System.out.println("Please enter values a, q to quit:");
       Scanner in = new Scanner(System.in);
       while (in.hasNextInt())
       { 
          a.add(in.nextInt());
       }
       System.out.println("" + a);
       
       ArrayList<Integer> b = new ArrayList<Integer>();
       System.out.println("Please enter values b, q to quit:");
       Scanner in2 = new Scanner(System.in);
       
       while (in2.hasNextInt())
       { 
          b.add(in2.nextInt());
       }
       System.out.println("" + b);
       
       System.out.print("" + merge(a,b)); 
       }  
         public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
         {
            ArrayList<Integer> result = new ArrayList<Integer>();
            int size = Math.max(a.size(), b.size());
         
             for (int i = 0; i < size; i++) 
             {
                 if (i < a.size()) result.add(a.get(i));
                 if (i < b.size()) result.add(b.get(i));
             }
         
             return result;
         }
    
}
 

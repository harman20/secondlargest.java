import java.util.Scanner;
import java.util.*;

public class Secondlargest {
      public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter size of an array");
    int a=s.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<n;i++)
   {
    arr[i]=s.nextInt();
   }
   int max=arr[0];
   int max1=0;
   
   for(int i=0;i<n;i++)
   {
    if(arr[i]>max)
   max=arr[i];
  
   if(arr[i]>max1 && arr[i]>max)
     max1=arr[i];
   }
  System.out.print("Largest"+max);
  System.out.print("Second_Largest"+max1);
   }
   }
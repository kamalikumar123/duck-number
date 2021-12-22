import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
class FindAllDuckNumber  
{    
    public static void main(String args[])  
    {  
        int range;  
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the value of range");  
        range = sc.nextInt();  
        for(int i = 1; i <= range; i++)  
            if(checkNumber(i)){  
                System.out.println(i + " is a Duck number");  
            }  
    }  
    public static boolean checkNumber(int number) {  
     while(number != 0) {  
            if(number%10 == 0)  
                return true;    
            number = number / 10;  
        }  
  reurn false;     
   }  
}  

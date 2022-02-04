package com.atcs.main;
import java.util.Scanner;

public class CountLettersInArray {
	Scanner sc=new Scanner(System.in);
  
    
	
     char[] createArrays() {     
    		System.out.println("Enter character ");
    	 	char array[]=sc.next().toCharArray();
    	return array;
	}
    
    void display(char a[]) {
    	for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]);
    	}
    }
    
   int[] randomCharacter(char a[]) {
	   int l=a.length;
	   int c[];
	   c=new int[l];
	   for(int i=0;i<l;i++) {
		   c[i]=1;
		   for(int j=i+1;j<l;j++) {
		   if(a[i]==a[j]) {
			   c[i]++;
			   a[j]='0';
		   }
	       }
       }
	   return c;
   }
   
   void displayCount(char a[],int count[]) {
	   System.out.println("----  Character And their counts----");
	   int ii=a.length;
	   for(int i=0;i<ii;i++) {
		   if(a[i] !=' '  &&  a[i] !='0') {
	       System.out.println( a[i]+" has occured= "+count[i]);
           }
       }
   }
  
}
class ArrayMain{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	CountLettersInArray obj=new CountLettersInArray();
	
	char array1[]=obj.createArrays();
	obj.display(array1);
	
	//Pick the random character
	int c[]=obj.randomCharacter(array1);         //now we get the character we need to count
	
	obj.displayCount(array1,c);
	}

}






























































/*
 * package com.atcs.main;
import java.util.Scanner;

public class CountLettersInArray {
	Scanner sc=new Scanner(System.in);
     char[] createArrays() {      
    		System.out.println("Enter characters in ARRAY ::  ");
    	 	char array[]=sc.next().toCharArray();
    	return array;
	  }
    
    void display(char a[]) {
    	for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);}
        }
    
   char randomCharacter() {
	   char random;
	   System.out.println("Enter the character Which you want to count");
	   random=sc.next().charAt(0);
	   return random;
   }
   
   void displayCount(char random , char a[]) {
	   int count=0;
	   for(int i=0;i<a.length;i++) {
		   if(a[i]==random) {
			   count++;
		   }
	   }
	   System.out.println("The Number of times "+random+" has occured= "+count);
   }
  
}
class ArrayMain{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	CountLettersInArray obj=new CountLettersInArray();
	
	char array1[]=obj.createArrays();
	obj.display(array1);
	char c=obj.randomCharacter();   
	obj.displayCount(c,array1);
	}

}



*/


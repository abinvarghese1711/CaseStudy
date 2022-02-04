# CaseStudy


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
	
	int c[]=obj.randomCharacter(array1);         
	
	obj.displayCount(array1,c);
	}

}



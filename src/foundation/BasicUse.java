//Java Random，Math，String类相关成员函数的使用，ArrayList，Set，HashMap等各种容器类的使用
/**
 * @author Amy Xie
 * @date 2018-01-25
 */

package foundation;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class BasicUse {

	
	public static void main(String[] args)
	{
//	randomMethodDemo();
//	mathDemo();
//		stringDemo();
//		setDemo();
//		arrayListDemo();
		hashMapDemo();
		
	}
	
	  
	public static void randomMethodDemo() 
	{
		
		  Random rand = new Random();
		  int randomNum = 0;
//		  rand.setSeed(1);
		  
		  for (int i = 0; i<10;i++)
		  {	
			rand.setSeed(1);
			randomNum = rand.nextInt(10);
//			double randomNum = rand.nextDouble();//Math.random();
		  	System.out.println("Random number is: "+randomNum);
		  }
	}
/**
 * This method is used for testing  methods in Class Math.
 * floor method will return the largest double value (value equal to integer)less than the test num.
 * round method will return the closest integer value to the test num.
 * ceil method will return the smallest double value more than the test num.
 * @param num to test
 * @return
 *
 */
	public static void mathDemo()
	{
		double i = 1.4;
		System.out.println("Math floor result is: "+Math.floor(i));
		System.out.println("Math floor result is: "+Math.round(i));
		System.out.println("Math floor result is: "+Math.ceil(i));	 
		
	}
	
/**
 * This method is the demo of the string class.
 * length() function return the length of the string
 * a.compareTo(b) return the distance from a to b
 * a.concat(b) return the result  of string a link to string b
 * charAt return the char at position index of the string
 */
	public static void stringDemo()
	{
		String str = "hello world!";
		String str2 = "by amy";
		String str3 = "hellp";
		
		System.out.println("the lenght of the string is :"+str.length());
		System.out.println("string concat result is:"+str.concat(str2));
		
		System.out.println("Comparison result is:"+str.compareTo(str3));
		System.out.println("Char at result is:"+str.charAt(0));
	}
	
/*
 * This is the demo of set class.Includes hashset, tree set and hashlinkedset
 * HashSet will not sort.
 * LinkedHashSet will print based on the order of input.
 * Tree set will sort based on value.
*/
	
	public static void setDemo()
	{
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i = 0;i <6 ;i++)
		{
			set.add(i);
			
		}
		set.add(-2);
		set.add(-1);
		
		//set.addAll((2,3,4,5,6,7,8,9));
		System.out.println("set elements:"+set);
		
		
	}
	
/*
 * This is the demo of arrayList class.
 * Includes add, remove, index element.
 */	
	public static void arrayListDemo()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0;i<10;i++)
		{
			list.add(i);
			
		}
		System.out.println("Original list element"+list);
		list.remove(1);
		System.out.println("Remove list element"+list);
		System.out.println("list Contains element: "+list.contains(2));
		list.add(5);
		System.out.println(" list element first index: "+list.indexOf(5));
		System.out.println("list element last index: "+list.lastIndexOf(5));
		
		
		
	}
/*
 * 	This is the demo of HashMap class.
 *  Operations include add, deleting, search elements.
 */
	
	public static void hashMapDemo()
	{
		 HashMap map = new HashMap<String,Integer>();
		 
		 map.put("hello", 1);
		 map.put("hello2", 2);
		 map.put("hello3", 3);
		 
		 
		 
		 System.out.println("HashMap elements: "+map);
		 System.out.println("HashMap conatains key hello: "+map.containsKey("hello"));
		 System.out.println("HashMap elements: "+map.get("hello2"));
		 System.out.println("HashMap elements: "+map.keySet());
		 
	}
	
}

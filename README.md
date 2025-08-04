# Arrays_java
Technical Programs on Array :
----------------------------
//Prrinting the array elements using toString() method of Arrays class

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args)
    {
        int []x = {12,13,14,15};
       
        //Converting the array into String
        System.out.println(Arrays.toString(x));

    }

}
------------------------------------------------------------------
//Given an array of integers, return true if 15 appears as either the first or last element in the array. The array will be length 1 or more.

package com.ravi.array_basic;

public class ArrayDemo1  
{
    public static void main(String[] args)
    {
        int []x = {19,78,45,89,15};
       
        boolean b = firstLast(x);
        System.out.println("15 is available :"+b);
    }
       
   
    public static boolean firstLast(int[] nums)
    {
        if (nums[0] == 15 || nums[nums.length-1] == 15)
            return true;
        else
            return false;
    }
}
-------------------------------------------------------------------
//Given an array of integers, return true if the array length is 1 or more,and the first element and the last elements both are equal.

package com.ravi.array_basic;

public class ArrayDemo2
{
    public static void main(String[] args)
    {
        int []x = {12,12,90,89,56,13};
        boolean b = sameFirstLast(x);
        System.out.println(b);
    }

    public static boolean sameFirstLast(int[] nums)
    {
        if (nums.length >= 1 && nums[0] == nums[nums.length-1])
            return true;
        else
           return false;
    }

}
-------------------------------------------------------------------
//Given 2 arrays of integers, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

package com.ravi.array_basic;

public class ArrayDemo3
{
    public static void main(String[] args)
    {
        int []x = {55,12,78,45,89,75};
        int []y = {55,12,78,45,89,76};
        boolean b = commonEnd(x, y);
        System.out.println(b);
    }

    public static boolean commonEnd(int[] a, int[] b)
    {
        if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
            return true;
        else
            return false;
    }

}
-------------------------------------------------------------------
//Given an array of integers length 3, return the sum of all the elements.

package com.ravi.array_basic;

import java.util.Scanner;

public class ArrayDemo4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array :");
        int arrayLength = sc.nextInt();
       
        int []x = new int[arrayLength];
       
        for(int i=0; i<arrayLength; i++)
        {
        System.out.print("Enter the elements of an array :"+i+" position :");
        x[i] = sc.nextInt();
        }    
       
        int total = sum3(x);
        System.out.println("Sum is :"+total);
    }
   
    public static int sum3(int[] nums)
    {
        return nums[0] + nums[1] + nums[2];
    }


}
-------------------------------------------------------------------
//Given an array of integers length 3, return an array with the elements "rotated left" so {1, 2, 3} will become  {2, 3, 1}.

package com.ravi.array_basic;
import java.util.Arrays;

public class ArrayDemo5
{
    public static void main(String[] args)
    {
        int []x = {1,2,3};

        int []arr = rotateLeft3(x);
       
        System.out.println(Arrays.toString(arr));
    }
   
    public static int[] rotateLeft3(int[] nums)
    {
       nums[0] = 2;
       nums[1] = 3;
       nums[2] = 1;
       return nums;
    }
}
-------------------------------------------------------------------
package com.ravi.array;

import java.util.Arrays;

public class ChangeArrayElements
{
    public static void main(String[] args)
    {
        int []arr = {10,20,30,40,50};
       
        System.out.println("Array Elements before Change :"+Arrays.toString(arr));
       
        int []recArray = ChangeArray.changeArrayElements(arr);

        System.out.println("Array Elements After Change :"+Arrays.toString(recArray));
       
        System.out.println("Original Array will Modified or Not :"+Arrays.toString(arr));
       
    }    
}

class ChangeArray
{
   public static int [] changeArrayElements(int [] p)
   {
       p[0] = 100;
       p[1] = 200;
       
       return p;
   }    
}

H.W
Note :- Java always works with pass by value only.
-------------------------------------------------------------------

//Given an array of integers length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo6
{
    public static void main(String[] args)
    {
        int []x = {11,22,33};
        int []y = reverse3(x);
        System.out.println("Reverse is :"+Arrays.toString(y));
    }

    public static int[] reverse3(int[] nums)
    {
        int[] myArray = new int[3];    
        myArray[0] = nums[2];
        myArray[1] = nums[1];
        myArray[2] = nums[0];
        return myArray;
    }

}
-------------------------------------------------------------------
//Given an array of integers length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo7 {

    public static void main(String[] args)
    {
        int []x = {145,222,138};
       
        int []y = maxEnd3(x);
        System.out.println("Return larger value :"+Arrays.toString(y));
    }
   
       public static int[] maxEnd3(int[] nums)
       {
        int larger = Math.max(nums[0], nums[2]);  //max is Math class static method
        System.out.println("larger value is :"+larger);
        nums[0] = larger;
        nums[1] = larger;
        nums[2] = larger;
        return nums;
       }

}

-------------------------------------------------------------------
//Given an array of integers, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, return 0 if the array is having length 0.

package com.ravi.array_basic;

public class ArrayDemo8 {

    public static void main(String[] args)
    {
        int []x = {12,90,89,67};
        int sum = sum2(x);
        System.out.println("Sum is :"+sum);
    }

    public static int sum2(int[] nums)
    {
        if (nums.length == 1)
            return nums[0];
       
        if (nums.length == 0)
            return 0;
        else
            return nums[0] + nums[1];
    }

}
-------------------------------------------------------------------
//Given 2 integer arrays, a and b, each length is 3, return a new array length 2 containing their middle elements.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo9
{
    public static void main(String[] args)
    {
        int []x = {65,99,78};
        int []y = {15,98,99};
       
        int []arr = middleWay(x, y);
        System.out.println("Middle element is :"+Arrays.toString(arr));
    }
   
   
   
   
    public static int[] middleWay(int[] a, int[] b)
    {
        int[] myArray = new int[]{a[1], b[1]};  
        return myArray;
    }


}
------------------------------------------------------------------
//Given an array of integers, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo10 {

    public static void main(String[] args)
    {
        int []x = {12};
        int []y = makeEnds(x);
        System.out.println("Array value is :"+Arrays.toString(y));
       
        int [] p= {12,89,78,34,99};
        int []q = makeEnds(p);
        System.out.println("Array value is :"+Arrays.toString(q));        
    }
   
    public static int[] makeEnds(int[] nums)
    {
        int[] myArray = new int[2];
       
        if (nums.length == 1)
        {
            myArray[0] = nums[0];
            myArray[1] = nums[0];
        }
        else
        {
            myArray[0] = nums[0];
            myArray[1] = nums[nums.length-1];
        }
        return myArray;
    }
}
------------------------------------------------------------------
//Given an integer array length 2,return true if it contains a number 2 or 3.

package com.ravi.array_basic;

public class ArrayDemo11 {

    public static void main(String[] args)
    {
        int []x = {4,5};
        boolean b = has2Or3(x);
        System.out.println("Array contains 2 or 3 :"+b);
    }
   
    public static boolean has2Or3(int[] nums)
    {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
            return true;
        else
            return false;
    }

}
------------------------------------------------------------------
//Given an integer array length 2,
//return true if it does not contain a number 2 or 3.

package com.ravi.array_basic;

public class ArrayDemo12 {

    public static void main(String[] args)
    {
        int []x = {13,24};
        boolean b = has2OR3(x);
        System.out.println("Array does not contain 2 or 3 :"+b);
    }
   
     public static boolean has2OR3(int[] nums)
     {
         if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3)
             return true;
         else
             return false;
     }

}
-------------------------------------------------------------------
//Given an integer array, return a new array with double the length where its last element is the same as the original array, and all the other elements are containing 0. The original array will be length 1 or more.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo13
{
   public static void main(String[] args)
   {
       int []x = {11,12,100,89};
       
       int []y = makeLast(x);
       System.out.println("Array is :"+Arrays.toString(y));
   }
   
   public static int[] makeLast(int[] nums)
   {
       int len = nums.length;
       int[] myArray = new int[2*len];
       
       myArray[myArray.length-1] = nums[len - 1] ;
       return myArray;
   }
}
------------------------------------------------------------------
//Given an array of integers, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo14
{
 public static void main(String[] args)
  {
    int []arr = {12,89,90,67,34,66};
   
    int []newArray =  swapEnds(arr);
   
    System.out.println("New Array Elements are :"+Arrays.toString(newArray));
  }
 
 public static int[] swapEnds(int[] nums)
 {
   int temp = nums[0];
   nums[0] = nums[nums.length-1];
   nums[nums.length-1] = temp;
   return nums;
 }

}

------------------------------------------------------------------
//Given an array of integers of odd length, return a new array length 3 containing the elements from the middle of the array.One element should be before middle and another one should be after middle. The original array length will be at least 3.

package com.ravi.array_basic;

import java.util.Arrays;

public class ArrayDemo15 {

    public static void main(String[] args)
    {
        int []arr = {12,89,90,78,99, 56, 99};
       
        int []newArray =  midThree(arr);
        System.out.println("New Array Elements are :"+Arrays.toString(newArray));
    }
    public static int[] midThree(int[] nums)
    {
        int[] myArray = new int[3];
       
        int middle = nums.length / 2;
       
        myArray[0] = nums[middle-1];
        myArray[1] = nums[middle];
        myArray[2] = nums[middle+1];
        return myArray;
    }
}

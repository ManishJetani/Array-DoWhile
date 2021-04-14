import java.util.Arrays;

public class ArrayDoWhile
{   // main method
    public static void main(String[] args)
    {
//Q.1 WAP to test the equality of two arrays.
        //initializing value of array1
        int[] array1={1,2,3,4,5,6};
        //initializing value of array2
        int[] array2={1,2,3,4,5};
        System.out.println("Ans No.1 = Test the equality of two arrays:- ");
        //to print array1 and array2 in console, i used .toString method
        System.out.println("Array1 is "+ Arrays.toString(array1));
        System.out.println("Array2 is "+ Arrays.toString(array2));
        //boolean condition is if array1 and array2 elements are same in size and in same order
        //then only it print as true otherwise it will print false.
        if (Arrays.equals(array1,array2))
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are not Equal");
//        System.out.println(Arrays.equals(array1,array2));

//Q.2 WAP to enter array and sort the values in ascending order.
        //initializing value of array
        int[] arr = {43,11,54,6,33,8,92};
        int temp = 0;
        System.out.println("\nAns No.2 = Enter array and sort the values in ascending order:- ");
        System.out.println("Elements of Original Array:- ");
        // Applying condition to display original array
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i]+",");
        }
        // Applying condition to sort the array in ascending order
        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = i+1; j <arr.length ; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of Array sorted in Ascending Order:- ");
        // Applying condition to display elements of array after sorting
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+",");
        }

//Q.3 WAP to enter any String and count the total number of 'a' in that String.
        //initializing String value
        String input = "What is average salary of automation engineer?";
        int count = 0;
        //applying condition to find character 'a' from given input
        for (char ch: input.toCharArray())
        {
            if (ch == 'a')
            {
                count++;
            }
        }
        System.out.println();
        System.out.println("\nAns No.3 = Count the total number of 'a' in any given String:- ");
        System.out.println("String is: "+input);
        System.out.println("Total number of 'a' in above String is: "+ count);

//Q.4 Printing multiplication table using do while loop.
        //initializing value of integer
        int num = 1; int num1 = 2; int num2 = 3;
        int total = 0; int total1 = 0; int total2 = 0;
        int i = 1; int p = 1; int q = 1;
        System.out.println("\nAns No.4 = Multiplication table using do while loop:- ");
        //applying condition to find out multiplication table of number 1 upto 3 times
        do
        {   total=num*i;
            System.out.print(total+"\t");
            i++;
        }
        while (i<=3);
        System.out.println();
        //applying condition to find out multiplication table of number 2 upto 3 times
        do
        {   total1=num1*p;
            System.out.print(total1+"\t");
            p++;
        }
        while (p<=3);
        System.out.println();
        //applying condition to find out multiplication table of number 3 upto 3 times
        do
        {   total2=num2*q;
            System.out.print(total2+"\t");
            q++;
        }
        while (q<=3);

//Q.5 Write a Java program to find the common elements between two arrays (String Values).
        //initializing String array values
        String[] arrayOne = {"Python",".Net","PHP","Java","C++","Scala","DB2"};
        String[] arrayTwo = {"Scala","Oracle","Python","SQL",".Net"};
        System.out.println(); //this is just to add empty line
        System.out.println("\nAns No.5 = Common elements between given two arrays:- ");
        //applying condition to find out common elements between two arrays
        for(int k = 0; k<arrayOne.length; k++)
        {
            for (int j = 0; j <arrayTwo.length ; j++)
            {
                if (arrayOne[k].equals(arrayTwo[j]))
                {
                    System.out.println(arrayOne[k]);
                    break;
                }
            }
        }
    }
}

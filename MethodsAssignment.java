public class MethodsAssignment {
    public static void main(String args[]){
        //Uncomment these to test:
        checkOddEven(998);
        checkOddEven(1237);

        //Uncomment these to test:
        System.out.println(capsCombine("john", "smith"));
        System.out.println(capsCombine("charlize","doe"));

        //Uncomment these to test:
        int test_arr1[] = {1, 2, 3, 4, 5};
        int test_arr2[] = {99, 100, 77, 62, 87, 92, 91, 100};
        System.out.println(getAverage(test_arr1));
        System.out.println(getAverage(test_arr2));

    }

    public static void checkOddEven(int number){
        if (number % 2==0){
            System.out.println(number + "even");
        }else{
            System.out.println(number + "odd");
        }
    }
    public static String capsCombine(String str1 ,String str2){
        return str1.toUpperCase()+str2.toUpperCase();
    }

    public static double getAverage(int[]arr){
        int sum=0;
        for (int num : arr){
            sum +=num;
        }
        return (double)sum/arr.length;
    }   
}




    //1. Create a method called checkOddEven that gets an integer and prints "The number is odd/even" depending on the result.

    //Add code here
    
    //2. Create a method called capsCombine that gets two strings and converts both to uppercase and joins them with a space.

    //Add code here

    //3. Create a method called getAverage that gets an array of numbers and returns the average of the values in the array.

    //Add code here

    //what is the difference again between string and void
    // is it always u call the function towards the end

    //In the above code, int[] arr is a parameter declaration for the method getAverage. It specifies that the method getAverage expects an array of integers as input, and this array is named arr.
    //In this code, the keyword double is used to specify the return type of the getAverage method. In Java, methods can have different return types, and double is one of the primitive data types that represents a 64-bit floating-point number.


    

//Exercise 1
//
// Take 2 numbers from input.
// Print their product.
// Test Data: 10, 2
// Expected Output: 10 * 2 = 20

//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {

//
//    public static void main (String [] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter First Number: ");
//
//        int input1= sc.nextInt();
//
//        System.out.println("Enter Second Number: ");
//
//        int input2 = sc.nextInt();
//
//        int result = input1*input2;
//
//        System.out.println("The result is:" + result );
//
//    }
//
//}

//Exercise 2
//        Take 2 numbers from input.
//        Print the result of their division.
//        a)The input contains integers
//        b)The input contains floating point numbers
//
//        Test Data: 50, 3

//        a)Expected Output: 50 / 3 = 16
//        b)Expected Output: 50 / 3 = 16.6666667

//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main (String [] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter First Number");
//
//        int input1 = sc.nextInt();
//
//        System.out.println("Enter Second Number");
//
//        int input2 = sc.nextInt();
//
//        int result1 = input1/input2;
//        float result2 = (float) input1/input2;
//
//        System.out.println("The result is:" + result1);
//        System.out.println("The result is:" + result2);
//
//    }
//}

//Exercise 3
//        Take a number from input.
//        Print its multiplication table up to 10
//
//        Test Data: 8E
//
//        expected Output:8 * 1 = 8
//        8 * 2 = 16
//        8 * 3 = 24
//        ...
//        8 * 10= 80

//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Show my multiplication table:");
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//
//        for(int i = 1; i <= 10; ++i) {
//
//            System.out.println(a + "x" + (i) + " = " + (a * (i)));
//        }
//
//    }
//
//}
//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main (String [] args){
//
//        System.out.println("Input a Number: ");
//
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
////option 1
//        for(int i = 1; i <= 10; ++i) {
//            System.out.println(a + " x " + (i) + " = " +
//                    (a * (i)));
//        }
//    }
//}
//        option 2

//        System.out.println(a+ " * 1 = " + a * 1);
//        System.out.println(a + " * 2 = " + a * 2);
//        System.out.println(a + " * 3 = " + a * 3);
//        System.out.println(a + " * 4 = " + a * 4);
//        System.out.println(a + " * 5 = " + a * 5);
//        System.out.println(a + " * 6 = " + a * 6);
//        System.out.println(a + " * 7 = " + a * 7);
//        System.out.println(a + " * 8 = " + a * 8);
//        System.out.println(a + " * 9 = " + a * 9);
//            }
//
//        }


//Exercise 4
//        Take a number from input, which will represent the side of a square.
//        Print the perimeter and the area of the square.
//        Test Data: 5
//        Expected Output:
//        The perimeter of the square is 20.
//        The area of the square is 25.


//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main (String [] args) {
//
//        System.out.println("enter side of the square: ");
//
//        Scanner sc = new Scanner (System.in);
//
//        double side = sc.nextDouble();
//
//        System.out.println("area of square");
//
//        double area = side * side;
//
//        System.out.println("perimeter of square");
//
//        double Perimeter = 4 * side;
//
//        System.out.printf("\n3. Perimeter of square is : %4.2f",Perimeter);
//        System.out.printf("\n3. Area of square is : %4.2f", area);
//

//
//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Please, enter a number: ");
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        System.out.println("Perimeter is: " + 4 * a);
//        System.out.println("Area is: " + a * a);
//
//    }
//
//}

//Exercise 5
//        Take a number from input, which represents the temperature in Fahrenheit scale.
//        Convert it into Celsius and output the degree.
//        Test Data: 212
//        Expected Output: 212.0degree in Fahrenheit is equal to 100.0in Celsius.

//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Please, enter fahrenheit value: ");
//
//        Scanner sc = new Scanner(System.in);
//        float fahrenheitValue = sc.nextFloat();
//
//        System.out.println("Celsius equivalent value is: " + ((fahrenheitValue - 32) * 5) / 9);
//    }
//}

//Exercise 6
//        Take a number in inches from input.
//        Convert it to meters and print out.
//        Test Data:1000
//        Expected Output: 1000.0 inches is 25.4 meters.

//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Please, enter inches value: ");
//
//        Scanner sc = new Scanner(System.in);
//        float inchesValue = sc.nextFloat();
//
//        System.out.println("Metric equivalent value is: " + inchesValue*0.0254);
//    }
//}

//Exercise 7
//        Take 5 numbers from input.
//        Output their sum and average.
//        Test Data: 1,2,3,4,5
//        Expected Output
//        :Sum is: 15
//        Average is: 3.0

//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please, enter 1st value: ");
//        int firstValue = sc.nextInt();
//        System.out.println("Please, enter 2nd value: ");
//        int secondValue = sc.nextInt();
//        System.out.println("Please, enter 3rd value: ");
//        int thirdValue = sc.nextInt();
//        System.out.println("Please, enter 4th value: ");
//        int fourthValue = sc.nextInt();
//        System.out.println("Please, enter 5th value: ");
//        int fifthValue = sc.nextInt();
//
//        int sum = firstValue + secondValue + thirdValue + fourthValue + fifthValue;
//
//        System.out.println("Sum is : " + sum);
//        System.out.println("Avg is : " + (float) sum / 5);
//    }
//}

//Exercise 8
//        Take two numbers from input.
//        Swap them and print out.
//        Test Data: 10, 20
//        Expected Output:
//        Before swapping X = 10,
//        Y = 20After swapping Y =10, X = 20
//package com.codewithmarianna;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please, enter 1st value: ");
//        int firstValue = sc.nextInt();
//        System.out.println("Please, enter 2nd value: ");
//        int secondValue = sc.nextInt();
//        System.out.println("Please, enter 3rd value: ");
//
//
//        System.out.println(secondValue + " , " + firstValue);
//    }
//}



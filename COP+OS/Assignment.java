
1:write program to test Hello World.


public class HelloWorld {


        public static void main(String[] args) {
                //test helloworld
                System.out.println("Hello World");
        }


}


2:Write a program to adddition of two numbers .




import java.util.Scanner;


public class Addnumb {
        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Two Numbers to add-> ");
                System.out.println("Enter First Number: ");
                int a=sc.nextInt();
                System.out.println("Enter Second Number: ");
                int b=sc.nextInt();
                int c=a+b;
                System.out.println("Result is: "+c);
        }


}




3:Write a program to swap two numbers.




import java.util.*;


public class Swap {


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


                System.out.println("Enter Two Numbers to Swap-> ");
                System.out.println("Enter First Number: ");
                int a = sc.nextInt();
                System.out.println("Enter Second Number: ");
                int b = sc.nextInt();


                int temp = a;
                a = b;
                b = temp;
                System.out.println("Swapped numbers are " + a + " " + b);


        }


}


4:Write a program to find factorial of a given number.


import java.util.Scanner;
public class Factorial {


        public static void main(String[] args) {
                
                //Factorial of Number
                
                
                int num, fact=1, i=1;
                
                //Get Number from User
                System.out.println("Enter Number to calculate Factorial: ");
                Scanner sc =new Scanner(System.in);
                num = sc.nextInt();
                
                //Factorial Logic
                while(i <= num) {
                        fact = fact*i;
                        i++;
                }
                
                //Printing Factorial of Number
                System.out.println("Factorial of Number: "+ fact);
        }
}







5:Write a program to find m to the power n.


import java.util.Scanner;


public class PowerOfNumber {


        public static void main(String[] args) {
                
                //Power of Number
                
                int num1, power, i=1, result=1;
                
                //Take input from User
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Enter Number to Calculate Power: ");
                num1 = sc.nextInt();
                System.out.println("Enter Power of Number to Calculate: ");
                power = sc.nextInt(12);
                
                //logic of Power
                while(i<=power){
                        result = num1 * result;
                        i++;
                }
                
                System.out.println("Power of Number "+num1+" raised to "+power+" is "+result);
        }


}







6:Check if number is a prime number or not.


import java.util.Scanner;


public class PrimeNumber {


        public static void main(String[] args) {
                
                //Prime Number
                int number;
                boolean flag=true;
                
                Scanner sc = new Scanner(System.in);
        
                System.out.println("Enter Positive Number to Check if Prime Number: ");
                number = sc.nextInt();
                
                for(int i=2; i<=Math.sqrt(number); i++){
                        if(number == 2){
                                System.out.println("Please Enter Number Greater than 2!");
                                break;
                        }
                        
                        if(number%i==0){
                                flag = false;
                                System.out.println("Entered Number "+number+" is NOT PRIME!");
                                break;
                        }
                }
                
                if(flag == true){
                        System.out.println("Entered Number "+number+" is PRIME!");
                }
                        
                


        }


}





7:Sum of series :
        1+2+3+….+n


import java.util.Scanner;


public class SumOfSeries {


        public static void main(String[] args) {


                int number;
                int result = 0;
                int i = 1;


                Scanner sc = new Scanner(System.in);


                System.out.println("Enter Number to Calculate  series upto : ");
                number = sc.nextInt(); // Taking number from user


                while (i <= number) { // Logic for looping the sum
                        result += i;
                        i++;
                }


                System.out.print("Sum of Series upto " + number + " is " + result);
                sc.close();
        }


}





8:Write a  program to find sum of all even and odd numbers between 1 to n. 


import java.util.Scanner;


public class SumOfEvenOdd {


        public static void main(String[] args) {


                int number;
                int result = 0;
                int i = 1;
                int evenResult = 0;
                int oddResult = 0;


                Scanner sc = new Scanner(System.in);


                System.out.println("Enter Range to calculate sum of even and odd : ");
                number = sc.nextInt();                                                //Accepting input from user


                while (i <= number) {                                                //Logic to calculate odd and even
                        if (i % 2 == 0) {                                                //if divisible by 2
                                evenResult += i;                                        //then add into evenResult
                        } else {
                                oddResult += i;                                                //else add in oddResult
                        }
                        i++;
                }


                System.out.print("Sum of Even Numbers upto "+number+ " is " + evenResult+" & odd numbers is "+ oddResult);
                sc.close();
        }


}




10: Write a  program to enter a number and print its reverse.




import java.util.Scanner;


public class ReverseNumber {


        public static void main(String[] args) {
                
                int number;
                int newNumber=0;
                
                Scanner sc = new Scanner(System.in);


                System.out.println("Enter Number to reverse : ");
                number = sc.nextInt();                        //Accepting input from user
                
                int temp = number;                                //temporary variable
                
                while(number>0){                                //loop till number is reversed
                        newNumber = (newNumber*10)+(number%10); 
                        number = number/10;                        //looping till number reaches 0
                }
                
                System.out.println("Reversed Number is: "+ newNumber);
                sc.close();
        }


}




11:Write a  program to print all Prime numbers between 1 to n. 




import java.util.Scanner;


public class Primeinrange {
        public static boolean isPrime(int a) {


                if (a == 1) {                                        //If number is 1 return false
                        return false;
                }


                for (int i = 2; i <= Math.sqrt(a); i++) {        //Iterate till square root of number 
                        if (a % i == 0) {                                                //if divisible by another number then NOT PRIME
                                return false;
                        }
                }


                return true;                                
        }


        public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                int num;


                System.out.println("Enter a number and prime " + "numbers till the number will be displayed:");
                num = sc.nextInt();
                
                System.out.println("Prime Number till the range are: ");
                
                for (int i = 1; i <= num; i++) {
                        if (isPrime(i)) {
                                System.out.print(i + " ");
                        }
                }
                sc.close();
        }


}






12:Write a program to check entered number is Armstrong number or not.




import java.util.Scanner;


public class Armstrong {
        public static boolean isArmstrong(int a) {
                int cubesums = 0;
                int num = a;
                while (num> 0) {                                                        //
                        cubesums += Math.pow((num % 10), 3);        //adding cubes of tens,units,hundreds
                        num /= 10;
                }
                if (cubesums == a) {                                                //check if original is armstrong
                        return true;
                } else {
                        return false;
                }
        }


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num;
                System.out.print("Enter a number to check if" + " its armstrong:");
                num = sc.nextInt();
                if (isArmstrong(num)) {
                        System.out.println("Entered number is " +num+ " Armstrong number");
                } else {
                        System.out.println("Entered number "+num+" is not Armstrong");
                }


        }


}



13:Write a program to find greatest of three numbers using nested if-else.


import java.util.Scanner;


public class Greatestof3 {


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int x, y, z, a;
                System.out.println("Enter three numbers to check the greatest");
                System.out.println("Enter First number :");
                x = sc.nextInt();
                System.out.println("Enter Second number :");
                y = sc.nextInt();
                System.out.println("Enter Third number :");
                z = sc.nextInt();
                // a=(x>y)?(x>z?x:z):(y>z?y:z);
                if (x > y && x > z) {
                        System.out.println(x + " is greatest");
                } else if (y > z) {
                        System.out.println(y + " is greatest");
                } else {
                        System.out.println(z + " is greatest");
                }


        }


}



14:Create menu driven program for Pizza Shop.And display total amount.


import java.util.Scanner;


public class Pizzaamount {


        public static void main(String[] args) {
                
                System.out.println("**********SP Pizza Shop************\n");
                
                System.out.println("1:Golden Corn                        100Rs   \n2:Margherita                        150Rs   "
                                + "\n3:Cheese'n Onion                200Rs  \n4.Spicychicken                        300Rs \n5:Total Bill  \n6:Exit ");
                Scanner sc = new Scanner(System.in);
                
                double amount = 0;
                int quantity, choice;
                
                do {
                        System.out.println("\nEnter Choice code from the Menu displayed above\n");
                        choice = sc.nextInt();
                        
                        switch (choice) {
                        case 1:// Golden Corn
                                System.out.println("Enter quantity for Golden Corn:");
                                quantity = sc.nextInt();// accept quantity from user
                                amount += quantity * 100;
                                System.out.println("Total amount=" + amount);
                                break;
                        
                        case 2:
                                System.out.println("Enter quantity for Margherita:");
                                quantity = sc.nextInt();// accept quantity from user
                                amount += quantity * 150;
                                System.out.println("Total amount=" + amount);
                                break;
                        
                        case 3:
                                System.out.println("Enter quantity for Cheese'n Oinion:");
                                quantity = sc.nextInt();// accept quantity from user
                                amount += quantity * 200;
                                System.out.println("Total amount=" + amount);
                                break;
                        
                        case 4:
                                System.out.println("Enter quantity for SpicyChicken:");
                                quantity = sc.nextInt();// accept quantity from user
                                amount += quantity * 300;
                                System.out.println("Total amount=" + amount);
                                break;
                                
                        case 5:
                                System.out.println("Total Bill is:" + amount);
                                break;
                        
                        case 6:
                                System.out.println("........Thank You.......");
                                break;
                        
                        default:
                                System.out.println("Invalid Choice");
                                break;


                        }// switch
                } while (choice != 6);
                System.out.println("---Thank You Visit Again---");
        }
}



15:Create Menu driven program for array operations.
1:Read Array 2:Print Array 3:Search element in array 4:Reverse Array 5:Even number from array6:sum of array element


import java.util.Scanner;


public class Arraymenu {


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


                int choice;
                int e, size = 0;


                System.out.println("Enter the size of array");
                size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("1:Input Array   \n2:Print array   "
                                + "\n3:Search Element  \n4.Reverse Array  \n5:Print even numbers from array \n6:Sum of array \n7.Exit");
                
                do {
                        
                        System.out.println("\nEnter Choice code from the Menu displayed above");
                        choice = sc.nextInt();
                        
                        switch (choice) {


                        case 1:
                                System.out.println("Enter the elements of array");
                                for (int i = 0; i < arr.length; i++) {
                                        arr[i] = sc.nextInt();                                //accepting input from user
                                }
                                break;


                        case 2:
                                for (int i = 0; i < arr.length; i++) {
                                        System.out.print(arr[i] + " ");                //Printing array 
                                }
                                break;
                                
                        case 3:
                                System.out.println("Enter the element to search");
                                e = sc.nextInt();
                                
                                boolean flag = false;                                        
                                for (int i = 0; i < arr.length; i++) {
                                        if (arr[i] == e) {                                                //If found
                                                System.out.println("Element found on index " + i);
                                                flag = true;
                                                break;
                                        }
                                }
                                
                                if (flag == false) {
                                        System.out.println("Element not found");
                                }


                                break;
                                
                        case 4:
                                int[] revarr = new int[size];
                                int j = 0;
                                for (int i = arr.length - 1; i >= 0; i--) {                //Reverse looping array
                                        revarr[j] = arr[i];                                                        //swapping elements
                                        j++;
                                }


                                for (int k = 0; k < revarr.length; k++) {
                                        System.out.print(revarr[k] + " ");
                                }
                                break;
                                
                        case 5:
                                for (int i = 0; i < arr.length; i++) {                        //If number is even print the number
                                        if (arr[i] % 2 == 0) {
                                                System.out.print(arr[i] + " ");
                                        }
                                }
                                break;
                        case 6:
                                int sum = 0;
                                for (int i = 0; i < arr.length; i++) {
                                        sum += arr[i];
                                }
                                System.out.println("Sum of array is " + sum);
                                break;


                        }
                } while (choice != 7);
        }
}

16:read two int array...and store both in third array and display third array
1 2 3
5 6 7 8 9
1 2 3 5 6 7 8 9


import java.util.Scanner;


public class concatarray {


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int size1, size2, size3;
                
                System.out.println("Enter the size of array1");
                size1 = sc.nextInt();
                
                int[] arr1 = new int[size1];
                System.out.println("Enter the elements of array1");
                for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = sc.nextInt();
                }
                
                System.out.println("Enter the size of array2");
                size2 = sc.nextInt();
                int[] arr2 = new int[size2];
                
                System.out.println("Enter the elements of array2");
                for (int i = 0; i < arr2.length; i++) {
                        arr2[i] = sc.nextInt();
                }
                
                size3 = size1 + size2;
                int j = 0;
                int[] arr3 = new int[size3];
                
                for (int i = 0; i < arr1.length; i++) {
                        arr3[j] = arr1[i];
                        j++;
                }
                
                for (int i = 0; i < arr2.length; i++) {
                        arr3[j] = arr2[i];
                        j++;
                }
                
                System.out.println("Array Elements of Both array are : ");
                
                for (int i = 0; i < arr3.length; i++) {
                        System.out.print(arr3[i] + " ");
                }
        }
}

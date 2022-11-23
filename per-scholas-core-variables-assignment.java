/*
Begin
Create a Java Project in eclipse called CoreJavaBasics. In the src folder, make a package and name it com.perscholas.java_basics. Create a class with a main( ) method to run the following exercises (You may name the class whatever you like. Examples: JavaBasicsClass, HomeClass, IndexClass, PracticeClass, etc.).
 
Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.
 
Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
 
Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?
 
Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
 
Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
 
Write a program that declares two integer variables, x, and y, and assigns 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
 
Write a program that declares a named constant and uses it in a calculation. Print the result.
 
Write a program where you create 3 variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to 2 decimal places.

*/


package com.perscholas.java_basics;

public class App {
        public static void main(String[] args) {

            // JD Module 303.1 - Practice Assignment - Core Java - Variables


            // step #1
            int a = 4;
            int b = 5;

            int sum;

            sum = a + b;

            System.out.println(sum);

            // step #2

            double c = 1.25;
            double d = 2.75;

            double sum2;

            sum2 = c + d;

            System.out.println(sum2);

            // step #3
            // the sum must be a double or the int will be lossy

            int e = 3;
            double f = 3.1;

            double sum3;

            sum3 = e + f;

            System.out.println(sum3);

            // step #4
            // You need to change from int to double after changing the larger number to a decimal.
            int g = 10;
            double h = 100.50;

            double division_total;

            division_total = h / g;

            System.out.println(division_total);


            // step #5
            double i = 10.5;
            double j = 5.25;

            double division_total2 = i / j;
            System.out.println(division_total2);
            // sout = system out shortcut

            // casting result to integer...
            int division_total_int;
            division_total_int = (int)division_total2;
            System.out.println(division_total_int);
            // the newly casted double (2.0) is now just int 2.


            // step #6

            int x = 5;
            int y = 6;

            double q = y/x;
            System.out.println(q);
            // prints 1

            // casting y to double...
            // loss of precision compliant unless I changed int q to double q and recast y.
            q = (double)y/x;
            System.out.println("step 6: " + q);

            // step #7
            // named constants in a calculation
            int shirt = 8;
            int shirt_sold = 3;

            int total_shirt = shirt - shirt_sold;
            System.out.println(total_shirt);

            // step #8
            // My own cafe...

            double coffee = 2.5;
            double egg_sandwich = 3.5;
            int green_tea = 1;

            double subtotal;
            double totalSale;

            // complete an “order” for 3 items of the first product
            double order1 = coffee*3;
            System.out.println(order1);

            // 4 items of the second product
            double order2 = egg_sandwich*4;
            System.out.println(order2);

            // 2 items of the third product
            int order3 = green_tea*2;
            System.out.println(order3);

            // subtotal
            subtotal = order1 + order2 + order2;
            System.out.println(subtotal);
            // prints out $35.5

            // salesTax and totalSale amount
            double salesTax = 0.10;
            totalSale = subtotal + (subtotal*salesTax);
            System.out.println(totalSale);
            // totalSale is subTotal + salesTax = $39.05
        }
}

class RandomNumbers {
  public static void main(String[] args) {
    // Random double value between 0 and 1
    System.out.println(Math.random());
 
    // Random double value between 0 and 9
    double a = Math.random() * 10;
    System.out.println(a);
 
    // Random int value between 0 and 9
    int b = (int)(Math.random() * 10);
    System.out.println(b);
 
    // Random int value between 1 and 10
    int c = (int)(Math.random() * 10) + 1;
    System.out.println(c);
  
    // Random int value between 10 and 20
//  We would have to implement the algorithm (Math.random() * (maxValue - minValue + 1)) + minValue.
    int d = (int)(Math.random() * 11 ) + 10;
    System.out.println(d);
 
  }
}

// int abs(int x): Purpose: Returns the absolute value of an int value
// double abs(double x): This is similar to the previous method, but this method takes in and returns a double type value
// double pow(double base, double exponent) -- Purpose: Returns the value of the first parameter raised to the power of the second parameter.

// double sqrt(double x)
// Purpose: Returns the positive square root of a double value
// The square root of a number represents what value can be multiplied by itself in order to equal a specified value. 
/*
double random()
Purpose: Returns a double value greater than or equal to 0.0 and less than 1.0
Its default use case is to produce a random double value between 0.0 and 1.0.
With some manipulation, we can use Math.random() to create a random int or double value within a predefined range.
If we wanted a random double value between 0 and 9…
*/
// Random double value between 0 and 9
double a = Math.random() * 10;

// If we wanted our range to start at 1 and end at 10, we would have to add 1 to the end of our previous expression:
// Random int value between 1 and 10
int c = (int)(Math.random() * 10) + 1;
// Using addition also gives us the ability to start the range at any number.

// If we wanted int value between 0 and 9 we need to add int casting:
// Random int value between 0 and 9
int b = (int)(Math.random() * 10);

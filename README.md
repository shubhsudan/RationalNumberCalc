# RationalNumberCalc


A Java application that performs arithmetic and comparison operations on rational numbers. The program accepts two rational numbers from the user through command line arguments and outputs the results of operations to the console. The program is written in object-oriented programming style and uses exception handling to recover from bad inputs.

Class Definitions:

RationalNumber: A class that represents a rational number. It has two instance variables numerator and denominator, which represent the numerator and denominator of the rational number, respectively. It also has the following methods:

RationalNumber(int numerator, int denominator): a constructor that takes two integers, numerator and denominator, as arguments and initializes the instance variables.
add(RationalNumber other): a method that takes another RationalNumber object as an argument and returns a new RationalNumber object that represents the sum of the two rational numbers.
subtract(RationalNumber other): a method that takes another RationalNumber object as an argument and returns a new RationalNumber object that represents the difference between the two rational numbers.
multiply(RationalNumber other): a method that takes another RationalNumber object as an argument and returns a new RationalNumber object that represents the product of the two rational numbers.
divide(RationalNumber other): a method that takes another RationalNumber object as an argument and returns a new RationalNumber object that represents the quotient of the two rational numbers.
compare(RationalNumber other): a method that takes another RationalNumber object as an argument and returns an integer that indicates whether the current RationalNumber object is less than, equal to, or greater than the other RationalNumber object.
toFloat(): a method that converts the rational number to a floating-point number and returns it.
abs(): a method that returns a new RationalNumber object that represents the absolute value of the current RationalNumber object.
RationalException: A user-defined exception class that extends the built-in Exception class. It has one instance variable message and two constructors:

RationalException(String message): a constructor that takes a string message as an argument and initializes the instance variable.
RationalException(String message, Throwable cause): a constructor that takes a string message and a throwable cause as arguments and initializes the instance variable.
Method Definitions:

main(String[] args): The main method that takes two rational numbers as input from the user through command line arguments and performs various operations on them. It has several try-catch blocks to handle different types of exceptions:
NumberFormatException: thrown when the input is not a valid integer.
IllegalArgumentException: thrown when the denominator of the rational number is 0.
ArithmeticException: thrown when the result of a division operation is undefined or when the computation overflows or underflows.

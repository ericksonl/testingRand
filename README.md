# Testing the java.util.Random Random Number Generator
Created by: Liam Erickson
Date: 5/22/2021
File Name: Main.java

I have always been curious how random the ran.nextInt function from the Random class in the java.util package was. To test this I created a program that will generate numbers from 0-10(inclusive) and outputs the amount and overall percantage the numbers occurred. I discovered that overall it was random, with every number having around a 9.1% chance of being generated. This of course is better represented with a larger sample size.

# Sample output:
```
How many numbers would you like to generate?
1000000
Generating 1000000 random numbers between 0 and 10 (inclusive)... 

Number of zeros: 91264
Number of ones: 91385
Number of twos: 90911
Number of threes: 91263
Number of fours: 90807
Number of fives: 91165
Number of sixs: 90708
Number of sevens: 90591
Number of eights: 90530
Number of nines: 90469
Number of tens: 90907
Total: 1000000

Percent zero: 9.1264%
Percent one: 9.138499999999999%
Percent two: 9.0911%
Percent three: 9.1263%
Percent four: 9.0807%
Percent five: 9.1165%
Percent six: 9.0708%
Percent seven: 9.0591%
Percent eight: 9.053%
Percent nine: 9.046899999999999%
Percent ten: 9.0907%
Total: 99.99999999999999%
```

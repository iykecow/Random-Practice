/*
This lab is about practicing using Random.....I mean Math.random()

On the AP Exam you cannot import anything so you MUST use Math.random() to generate random things.

Math.random() generates a DOUBLE between 0 and 1 (not including 1). Inclusive/exclusive AGAIN.

[0, 1)

Lets say you want to generate a random integer between 1 and 10, inclusive of both. HOW? 3 steps

1) Math.random() * RANGE (how many numbers in your set)
2) CAST to int if necessary
3) Add/Subtract your initial value

So...     int rand = (int) (Math.random() * 10) + 1


  */

public class Main {
  public static void main(String[] args) {
    //Test the individual codes
    System.out.println("Random 1 - 10: " + random1To10());
    System.out.println("Random 1 to N: "  + random1ToN(50));
    System.out.println("Random A to Z: " + randomAtoZ());

    //How can you test that you get an equal distribution on the nummbers 1 to 10? Add that code here and show the distribution

    
    
  }

  //generates a random integer from 1 - 10, inclusive of both
  public static int random1To10(){
    int rand = 0;

    return rand;
  }

  //generates a random integer from 1 - N, inclusive of both
  public static int random1ToN(int n){
    int rand = 0;

    return rand;
  }

  //generates a random character from a to z, inclusive of both
  public static  char randomAtoZ(){
    char letter = 'a';

    //USE ASCII TABLE!

    return letter;
  }
}

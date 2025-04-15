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

    int ten = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;

    int[] tester = new int[100];
    for (int i=0; i<100; i++) {
      tester[i] = (int)(Math.random()*10)+1;
    }

    for (int i=0; i<100; i++) {
      if (tester[i]==1) {
        one++;
      }
      if (tester[i]==2) {
        two++;
      }
      if (tester[i]==3) {
        three++;
      }
      if (tester[i]==4) {
        four++;
      }
      if (tester[i]==5) {
        five++;
      }
      if (tester[i]==6) {
        six++;
      }
      if (tester[i]==7) {
        seven++;
      }
      if (tester[i]==8) {
        eight++;
      }
      if (tester[i]==9) {
        nine++;
      }
      if (tester[i]==10) {
        ten++;
      }
    }

    System.out.println("");
    System.out.println("");
    System.out.println("A roughly even distrubution over 100 different Math.Random()s:");


    System.out.println("Ones: " + one);
    System.out.println("Twos: " + two);
    System.out.println("Threes: " + three);
    System.out.println("Fours: " + four);
    System.out.println("Fives: " + five);
    System.out.println("Sixes: " + six);
    System.out.println("Sevens: " + seven);
    System.out.println("Eights: " + eight);
    System.out.println("Nines: " + nine);
    System.out.println("Tens: " + ten);

    System.out.println("");
    
  }

  //generates a random integer from 1 - 10, inclusive of both
  public static int random1To10(){
    int rand = 0;

    int[] numline = {1,2,3,4,5,6,7,8,9,10};

    rand = numline[(int)(Math.random()*10)];

    return rand;
  }

  //generates a random integer from 1 - N, inclusive of both
  public static int random1ToN(int n){
    int rand = 0;

    int[] numline = new int[n];
    for (int i=0; i<n; i++) {
      numline[i] = i;
    }

    rand = numline[(int)(Math.random()*n)];

    return rand;
  }

  //generates a random character from a to z, inclusive of both
  public static  char randomAtoZ(){
    char letter = 'a';

    //USE ASCII TABLE!

    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y', 'z'};

    letter = alphabet[(int)(Math.random()*26)];

    return letter;
  }
}

# prompt.java
THIS IS NOT EVEN REMOTELY RELATED TO AI but if your Java program requires user input, then this simplifies the process. 
I am learning Java and a lot of my programs require user input. Which often meant that doing:
import java.util.Scanner;
...{
  ...{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:  ");
    int num1 = sc.nextInt();
    ...
  }
}
Was something I had to do a lot. So I decided to automate it by putting all that in a single class called "prompt.java" 
with different methods for different data types, shortening all that down to:
...{
  ...{
    int num1 = prompt.Int("a number");
    ...
  }
}
which would give the same result with a single method call.

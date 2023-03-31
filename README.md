# JAVA-ASSESSMENT---3

## REGISTER NUMBER :- 212221240029
## NAME :- MONISHA T

### 1) A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses. You should learn about Java Inheritance before attempting this challenge.
Following is an example of abstract class:
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book();
You have to create another class that extends the abstract class. Then you can create an instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.
Your class mustn't be public.
Sample Input
A tale of two cities
Sample Output
The title is: A tale of two cities

### PROGRAM :-

```java

( Main.java)
package q1;

public class Main {

            public static void main(String[] args) {
                MyBook myBook=new MyBook();
                myBook.setTitle("A tale of two cities");
                System.out.println("The Title is : " +myBook.getTitle());
            }

        }
       
( MyBook.java )
package q1;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
public class MyBook extends Book {
    public void setTitle(String s) {
        this.title = s;
    }
}

```



### 2) A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.
You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.

Sample Input
6
Sample Output
I implemented: AdvancedArithmetic
12

Explanation
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12

### PROGRAM :-

```java
( inface.java )
package q2;

import java.util.Scanner;
public class interfac {
    public static void main(String[] args) {
        MyCalc My_cal = new MyCalc();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(My_cal.divisor_sum(n));
        sc.close();

    }
}

( Mycal.java)
package q2;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalc implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}

```


### 3) When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones). Consider the following Sports class:
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
Next, we create a Soccer class that inherits from the Sports class. We can override the getName method and return a different, subclass-specific string:
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.
Task
Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as the superclass' getNumberOfTeamMembers method, except that it replaces  with  (the number of players on a Soccer team).
Output Format
When executed, your completed code should print the following:
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class

### PROGRAM :-

```java

( Main.java )
package q3;

public class mainINspo {
    public static void main(String[] args) {
        sports a = new sports();
        soccer b = new soccer();
        System.out.println(a.getName());
        a.getNumberOfTeamMembers();
        System.out.println(b.getName());
        b.getNumberOfTeamMembers();
    }
}

( Soccer.java )
package q3;

class soccer extends sports {
    @Override
    String getName()
    {

        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers()
    {

        System.out.println("Each team has 11 players in " + getName());
    }
}

( Sports.java )
package q3;

class sports{
    String getName()
    {
        return "Generic Sports";
    }


    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in " + getName());
    }
}

```


### 4) Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)
Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.
This problem will test your knowledge on try-catch block.
You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
Sample Input 0:
10
3
Sample Output 0:
3
Sample Input 1:
10
Hello
Sample Output 1:
java.util.InputMismatchException
Sample Input 2:
10
0
Sample Output 2:
java.lang.ArithmeticException: / by zero
Sample Input 3:
23.323
0
Sample Output 3:
java.util.InputMismatchException

### PROGRAM

```java
package q4;

import java.util.InputMismatchException;
import java.util.Scanner;
    public class BuiltMech {
        public static void main(String[] args) {
            try {
                int a,b;
                Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                int c=a/b;
                System.out.println(c);
            }
            catch(ArithmeticException e){
                System.out.println("Cannot be divided by zero");
            }
            catch(InputMismatchException e){
                System.out.println(e);
            }

        }

    }


```




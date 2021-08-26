# Basics

---

## Variables

Variables are created with keyword, variable name assignment value
```java

String test = "12345"

```


### Strings

String variables are created with the String keyword and work like strings in other languages. One key thing to note is that they do not use array-like accessors. The charAt or substring method are the ways to access positions of the string or slices respectively. The slices follow the same rules as Python, that is they are inclusive then exclusive.

Concatenation of strings is done with the + sign, like python

```java
String myString = "this is a string";

System.out.println(myString + "This is another string");
```

Unlike Python though, it isn't smart by adding spaces

### integers

Integer variables are done by using the int keyword. These are 32 bit signed numbers and do not have a decimal. If ever a float or double are cast to an int, the decimal is dropped, not rounded.

### Doubles

Doubles are 64bit numbers and are fractional. They have up to 15 points of precision, twice as much as floats. Otherwise, is the same as a float.

### Byte

Byte variables have a range of 0 to 256 unsigned or -127 to 128 signed. In Java all Bytes are __signed__ and the upper range is 127.


### Shorts

Shorts are 2x the size of Bytes. Otherwise, are exactly the same.


### Float

Floats are decimal numbers. These are 32 bit numbers, like ints. But, when declaring, we need to append an f to the end of the number to tell the Java compiler to treat this as a float. This is because floats only have a certain amount of precision (6/7 places).

### Char

Chars are single characters. Plain and simple. Like Elixir, we use single quotes to define Chars.


### Booleans

Booleans are as they are in other languages. Either true or false. No need for capitals here. If you're interested, they are only 1 bit. Perfect for efficient loops.


## Operations

### Addition

Addition is the same as all other languages. Add with + sign. This returns the more precise type when different types of numbers are added.

### Subtraction

Subtraction is the same as all other languages. Minus with the - sign. Returns the same as above.

### Division

Division is the same as all other languages. / is division. The return is the more precise number of the numbers passed in. If an int and double are passed in, the return will be a double.

### Multiplication

Multiplication is the same as all other languages. * is multiplication sign.

### Modulo

Use % for remainder from division. Always return the more precise type

### Exponent

Math.pow is the way to do this in Java. This always returns a double as per the method description.

### And

double ampersand, as normal

### Or

double pipes, as normal

### Not

bang, as normal

## Flow control

### If statements

If statements are very similar to JavaScript. You can do them on one line without curly brackets, but this is poor convention.

```java

if(//expression){
    //code
 } else {
    //more code
        }

```

Any expression that evaluates to a boolean will work here. Raw values are not truthy in Java so this cannot be passed into an if statement. Matching on type or value is the best way to match.

### Switch

Switch statements are very rigid constructs in Java. They take in an integer expression or discrete value. Not a boolean. Then, each of the cases must be of the matching type of what was passed in. (Basically any type but boolean).

```java

switch(expression){

   case value1:
      break;
   
   case value2 :
       break;
       
   default : 
      // Statements
}

```

These are really good for matching on specific cases and therefore managing state. But, they are not very useful for pattern matching, like they are in JavaScript. Bear that in mind when coding with them. Seems like switches and enums will work well together.

## Loops


### For loops

Loops are written in the same way as Javascript loops (though Java was deffo first).

We have access to what is called an enhanced for loop that allows us to work on an array iteratively without declaring an iterator variable. These look like:
```java
for([data-type][variable name] : [collection]){
    //code stuff here
        }

```

Scoping rules also apply. That is that variables are only accessible in the scope they are declared. It is possible to declare things as static to get them to be accessible elsewhere, but this is an awful idea. Dependency injection is always a better way of handling this.

For loop in Java:

```java
for([iterator-variable]; [condition]; [work if true(usually increment or decrement of iterator variable)]){
    
    //code stuff
        }
```

The iterator variable an condition sections can be left blank. When this is done, the compiler doesn't implant any value and assumes them to be truthy. This means the loop wil run forever.


### While loops

While loops are similar in Java are similar to how they are in other languages.

```java
while(expression){
    //code stuff
        }
```

The work inside the loop will not be triggered unless the expression evaluates to true. When major gotcha is ensuring you have an iteration statement at the bottom (or top) of the while loop. If the expression never evaluates to false, the loop will run forever.

Deciding when to use which loop is easy:
- is the work being done on each element in the collection/ data sructure?
- is the iteration condition the same for each item?
- is the initialisation the same i.e. there is no complex logic to create a new structure.


### Do while loops

Do while loops are a newish concept. These are essentially a while loop, but the work of the loop is carried out at least one time. They have the folloing syntax:

```java
    do{
    //code stuff
        } while(expression);
```

### Continue

Continue is as it is in other languages. It will stop the current execution of the loop and move to the next iteration. That is, it will apply the iteration condition and then evaulate the expression again, then carry out work.

These are often used in conjunction with if statements as we need a branch to understand if work should be continued or not.

An example of this could be:

```java
class test {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            if(i < 3){
                continue;
            }
        System.out.println(i);
        }
    }
}
```

The continue statement will only be hit when the if condition is true. So the output of the code will be 3,4.

### Break

Break works the same way as continue except that it stops execution of the loop entirely. Simple as.

## Methods and parameters/ arguments

A method is a block of code the is executed when called. It's caller has knowledge and access to this as it should be a member of the class that was instantiated when called. However, classes can be passed into methods as arguments, so these would be considered part of the execution context.

### Main

The main method on a class is characterised by the following:

```java

class Test {
    public static void main(String[] args){
        //code stuff
    }
}

```

To break each part of this down:
- public means the method can be accessed outside of the instance of the class if needed. Its counter part is __private__. 
- static means the method is considered part of the global space and can be called without instantiating the class. This has no counterpart as classes need to be built before they can be used.
- void indicates that this method does not return anything. You can return any data type or an instance of a class.
- args is the String variable that is passed into main. 

The main function is called when you try to build a class from the command line. The arguments passed in are then used as a string inside the context of the program.


### Method callers

When a method is called, a different world is created inside the execution context of the method. This means that arguments passed in are considered local. But, as reference types (like classes) are references to positions in memory and not direct access, class members can be mutated by functions. To prevent mutations, focus on using immutable types i.e. primitives.

### Function benefits

There are 4 big benefits to using functions in general:
- Avoiding code redundnacy. We can make sure that all code we write is maintained and easy to search through.
- Modularation. Making code modular allows for easy reuse.
- Abstraction. Abstracting reusable chnks of code allows us to better control the dependencies.
- Avoid variable name collisions. Each function has its own internal scope in Java, so variables can share names.





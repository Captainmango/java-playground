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


### Subtraction



### Division



### Multiplication


### Modulo


### Exponent



## Flow control



## Loops



## Methods and parameters/ arguments
# Arrays

Arrays are data structures that can store data continuously in a container. To instantiate this we do the following:

```java
    class Test{
        int[] myArray = {1,2,3,4};
    
}
```

Best convention when creating arrays is to use the data type and combine the square brakcets with this, then followed by the variable name to represent the array. Arrays need to have a type and can only contain that type of element. They also need to be created with their members from instantiation, but can be mutated and edited with in place operations. We can use square bracket notation to access members of the array. 

To create an array without any members, we can do the following:

```java
    class Test{
        int[] myArray = new int[5];
}
```

The above creates an array that has 5 positions. We use the new keyword to show that we want this to be a new area in memory. We then assign and use the new keyword followed by the data type and square brackets. This creates the array in memory. We can stop here, but the array will have no positions to edit and __it is not possible to change how many positions an array has__. They are fixed in size. We need to include the size in the square brackets.
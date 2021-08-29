# Arrays


## One dimensional fixed arrays

One dimensional fixed arrays are data structures that can store data continuously in a container. To instantiate this we do the following:

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

If e do not define what is at a position when instantiating an array, the position will be 0 until it is set. (Basically default Java rules for variables).


## Dynamically sized arrays

The array type in Java is somewhat legacy as the instantiation requires a size. To create an array that acts similarly to other languages, we need to use the ArrayList class. Creating one of these looks like this:

```java
    class Test{
        ArrayList<String> myWords = new ArrayList<String>();
}
```

The ArrayList is an array like type that dynamically resizes itself based on the number of elements inside it. By default, it initialises with a starting capacity of 10. They are created in the same was as all variables. But, there are subtle differences that make this more like an object rather than a datatype.

The angle brackets that contain the type of the array are a key difference. We also need to call the constructor when creating an ArrayList and can pass in either a start capacity as an int value, or a collection that gets passed into the ArrayList.


## Array operations





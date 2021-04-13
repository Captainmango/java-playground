# New since Java 9

---

## REPL
### JShell

Java has a repl tool now!! we can get to it by typing jshell in the console.

```bash
$ jshell
```

this is just like the Ruby or Python repls I've used and allows you to run code in a sandbox. It is also possible to create classes and methods by using the void keyword. 

```
void test(){System.out.println("test")}
```

### ProcessHandler

We now have access to the ProcessHandle class that exposes the PID and information about the current running process in the console or in code.

```java
public class Playground {

    public static void main(String [] args){
        ProcessHandle currentProcess = ProcessHandle.current();
        ProcessHandle.Info currentProcessInfo = currentProcess.info();
        System.out.println("PID: " + currentProcess.pid());
        System.out.println("Info: " + currentProcessInfo);
    }

}
```

This when ran will print out the current process id and the full breakdown of the current running process. This could be useful when creating APIs to see what things are actually happening when and signal these to the user.


### module system

Java 9 offers us a module system!! This allows us to stop classes from being publically accessible and allows for better scalability of code. It allows for better encapsulation and stronger platform integrity. This also leads to better performance and security as well as stronger configuration of all files in a program.

Modules now contain dependency configurations and native code to the module. They are like mini programs now. They follow a similar structure to previous Java versions in that methods belong to classes which belong to packages. This essentially allows us to load code properly and prevent classpath errors sometimes seen in Ruby and Python.

Implementing modules is really simple with intellij IDEA. You can simply right click in the root of a project and add this. Be warned though, this is intellij specific. To do this in a way Java will recognise, you'd need to create the module in an existing package. To tell the difference, a module-info.java file will be created. This is just a regular object

```java
com.package.name{
    // stuff goes in here
        }

```

A major point to note with modules is that they need to be exported and then required. This is of course seperate to the intellij boilerplate stuff. The intellij modules are more for code organisation and have no bearing on how Java treats code. Java 9 modules are for code to be maintained easier and prevent classpath errors.

in the module-info.java file, we need to export the file we want to be available elsewhere.

```java
com.package.name{
    exports com.package.name;
        }
```

Once this has been done, we'd need to add the module as a requirement in the module-info.java of the module we'd like to include the above module code.

```java
com.package.name2{
    requires com.package.name
        }

```

This is very similar to the javascript export syntax as a way of understanding.

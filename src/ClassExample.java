
// a class consist of 2 elements
//1. method-- known as functions in other langugaes
//2. field-- known as variabe as well
public class ClassExample {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

/* 
 * we have the varible name which is set to be a string meaning that the return
 * type is a String
 * we have have other class which is set to void-- meaning that the method does
 * not return anything, method requires information be supplied to it from the
 * calling method;
 * this information is called a parameter. setName has one parameter named
 * newName, and it
 * is of type String. g. This means the caller should pass in one String
 * parameter and expect
 * nothing to be returned
 * one file can have 2 classes and it's still fine as well
*/

public class Animal {
  private String name;
}

class Animal {

}
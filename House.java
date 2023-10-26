/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

/* 1. Make the `House` class `extend` the `Building` class, and add the following attributes:
```
private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
private boolean hasDiningRoom;
```
Modify the `House` **constructor** to initialize `residents` to a `new ArrayList<String>()`, as well as to set 
`hasDiningRoom` to indicate whether or not the house has a dining room. You'll have to pass this value in as a parameter 
to the constructor, and don't forget to `import java.util.ArrayList`!

---
2. Write the following accessors to retrieve the indicated values:
```
public boolean hasDiningRoom();
public int nResidents();
```

---
3. Write methods to update the `ArrayList` of `residents` every time someone moves in or out:
```
public void moveIn(String name);
public String moveOut(String name); // return the name of the person who moved out
```
as well as a boolean method that tells us whether or not a given person is a resident of the `House` 
(for security reasons, we don't want to provide direct access to the entire list of residents):
```
public boolean isResident(String person);
```
_Hint: use the functions provided by the [`ArrayList`](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) class to make this much easier! Specifically, check out `add(...)`, `remove(...)`, and `contains(...)`._
 */



private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
private boolean hasDiningRoom;

  public House(boolean hasDiningRoom) {
    super("", "", 1);

    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents() {
    return this.residents.size();
  }

  public boolean isResident(String person) {
    return residents.contains(person);
  }

  public void moveIn(String name) {
    residents.add(name);
  }

  public String moveOut(String name) {
    residents.remove(name);
    return name;
  }

  public static void main(String[] args) {
    new House(true);
  }

}

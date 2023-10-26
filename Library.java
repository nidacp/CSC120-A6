/* This is a stub for the Library class */

import java.util.Hashtable;
import java.util.Map;

public class Library extends Building {

    /*
     * 1. Make the `Library` class `extend` the `Building` class, add a `private Hashtable<String, boolean> collection` attribute, 
     * and initialize this to an empty `Hashtable<String, boolean>` inside the `Library` constructor. Don't forget to `import java.util.Hashtable`!

---
2. Write methods to update the `Hashtable` containing the `collection` every time we add/remove a title:
```
public void addTitle(String title);
public String removeTitle(String title); // return the title that we removed
```
as well as to check a book out or return it (rather than adding or removing a book from the collection, these methods will simply modify the `value` associated with the given `key` - the `title`):
```
public void checkOut(String title);
public void returnBook(String title);
```
_Hint: use the functions provided by the [`Hashtable`](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html) class to make this much easier! Specifically, check out `put(...)`, `remove(...)`, and `replace(...)`._

---
3. For good measure, we'll also write a couple of methods to support browsing the collection:
```
public boolean containsTitle(String title); // returns true if the title appears as a key in the Libary's collection, false otherwise
public boolean isAvailable(String title); // returns true if the title is currently available, false otherwise
public void printCollection(); // prints out the entire collection in an easy-to-read way (including checkout status)
```
_Hint: again, let `Hashtable`'s methods do some of the heavy lifting for you!_
     */

    private Hashtable<String, Boolean> collection;

    public Library() {
      super("Library", "",  1);
      //this.collection = new Hashtable<>() {};
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {
      collection.put(title, true);
    }

    public String removeTitle(String title) {
      collection.remove(title);
      return title;
    }

    public void checkOut(String title) {
      collection.replace(title, true, false);
    }

    public void returnBook(String title) {
      collection.replace(title, false, true);
    }

    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title) {
      return collection.get(title);
    }

    public void printCollection() {
      for(Map.Entry<String, Boolean> entry : collection.entrySet()) {
        System.out.println("Title: " + entry.getKey() + ". Available: " + entry.getValue());
      }
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }

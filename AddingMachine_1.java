
package cse360assignment02;
import java.util.*;

public class AddingMachine_1 {
  private int total;
  ArrayList ttl = new ArrayList();
  public AddingMachine_1 () {
    total = 0; // not needed - included for clarity
    ttl.add(total);
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  ttl.add(total);
  }

  public void subtract (int value) {
	  total = total - value;
	  ttl.add(total);
  }

  public String toString () {
	  for (int i = 0; i < ttl.size(); i++)
	  {
		  System.out.println(ttl.get(i));
	  }
	  return "";
  }

  public void clear() {
	  ttl.clear();
  }
}

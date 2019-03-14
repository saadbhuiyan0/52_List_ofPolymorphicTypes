/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

  private Object[] elements;
  private int filledElements; // the number of elements in this list

  private static final int INITIAL_CAPACITY = 10;

  /**
    Construct an empty list with a small initial capacity.
   */
  public List_inArraySlots() {
      elements = new Object[ INITIAL_CAPACITY];
  }

  /**
    @return the number of elements in this list
   */
   public int size() {
       return filledElements;
   }


   /**
     @return a string representation of this list,
     in [a,b,c,] format
    */
   public String toString() {
       String result = "[";
       for ( int elemIndex = 0; elemIndex < filledElements; elemIndex++) {
          result += elements[ elemIndex] + ",";
       }
       return result + "]";
   }


  /**
    Appends @value to the end of this list.

    @return true, in keeping with conventions yet to be discussed
   */
    public boolean add( Object value) { 
        if( filledElements == elements.length) expand();
        elements[ filledElements] = value;
        filledElements++;
        return true;
    }


  /**
    Double the capacity of the List_inArraySlots,
    preserving existing data.
   */
    private void expand() {
       System.out.println( "expand... (for debugging)");
          /* S.O.P. rules for debugging:
             Working methods should be silent. But during
             development, the programmer must verify that
             this method is called when that is appropriate.
             So test using the println(), then comment it out.
             */
        Object[] expansion = new Object[filledElements *2];
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++) {
            expansion[ elemIndex] = elements[ elemIndex];
        }
        elements = expansion;
    }

    public Object get( int elemIndex) {
        return elements[ elemIndex];
    }
}
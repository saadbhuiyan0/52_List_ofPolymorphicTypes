/**
  Represent an Element in a list, with disparate types available.  
  
  For this exercise, polymorphism and overloading are banned.
  The result resembles how a C programmer might create a list
  c. 1975, except that a C structure cannot contain methods.
 */
public class Element{
    // ================================================================
    // FIELDS
    private int type;
    private int intValue;
    private double doubleValue;
    private String stringValue;

    public static final int INTS = 0;
    public static final int DOUBLES = 1;
    public static final int STRINGS = 2;


    // ================================================================
    // CONSTRUCTOR
    // A single constructor, since overloading was banned.
    
    public Element(int valType, int intVal, double doubleVal, String stringVal){
        type = valType;
        intValue = intVal;
        doubleValue = doubleVal;
        stringValue = stringVal;
    }

    // ================================================================
    // METHODS
    // public int getType(){
        // return type;
    // }

    // public int getInt(){
        // return intValue;
    // }

    // public double getDouble(){
        // return doubleValue;
    // }

    // public String getString(){
        // return stringValue;
    // }

    public String toString(){
        String stringRep = "";
        if      (type == INTS)    stringRep += intValue;
        else if (type == DOUBLES) stringRep += doubleValue;
        else                      stringRep += stringValue;
        return stringRep;
    }


}



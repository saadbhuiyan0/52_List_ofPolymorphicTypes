/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;
    
    public static void main( String[] args ) {
        list = new List_inArraySlots();

         System.out.println( "number of elements: " + list.size() );
         System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
         list.add( "important");
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added string: " + list);

         list.add( 0);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added int: " + list);

         list.add( 1.618);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added double: " + list);

         list.add( true);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added boolean: " + list);

         // Add enough elements that expansion is expected
         for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {

             if( list.size() == 10) System.out.println( "expansion expected");

             list.add(-elemIndex);
             System.out.println( "number of elements: " + list.size() );
         }
         System.out.println("result of expanded list: "
              + list.size() + " elements:");
         System.out.println( list);
         
         for (int elemIndex = list.size(); elemIndex >= 0; elemIndex--) {
            System.out.println("element " + elemIndex + ": " + list.get(elemIndex));
         }
    }//test
}


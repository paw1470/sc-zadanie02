package pl.paw1470;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassWith3Fields classWith3Fields = ClassWith3Fields.builder().id(1).name("Lombok").text("test").build();
    }
}

package fundamentals;

public class DataTypes {
   public static void main(String[] args) {
      // A primitive data type specifies the size and type of variable values, and it
      // has no additional methods.
      // 8 data primitive types.
      // syntax : datatype variable;
      // all primitive types start with samll alphabet
      // all classes start with capital alphabet.
      byte bytevar = 127;
      short shortVar = 32767;
      int intVar = 2147483647;
      long longVar = 60;
      float floatVar = 20.5f;
      double doubleVar = 20.123d;
      boolean booleanVar = false;
      char charVar = 'W';

      // char charVar1 ='Wa';
      // char charVar1 = "Wa";
      // Note : String is a class.

      System.out.println("Value Of byte Variable is " + bytevar);
      System.out.println("Value Of short Variable is " + shortVar);
      System.out.println("Value Of int Variable is " + intVar);
      System.out.println("Value Of long Variable is " + longVar);
      System.out.println("Value Of float Variable is " + floatVar);
      System.out.println("Value Of double Variable is " + doubleVar);
      System.out.println("Value Of boolean Variable is " + booleanVar);
      System.out.println("Value Of char Variable is " + charVar);
   }

}

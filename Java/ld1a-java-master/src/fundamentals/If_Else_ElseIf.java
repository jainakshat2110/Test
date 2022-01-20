package fundamentals;

class If_Else_ElseIf {
   public static void main(String[] args) {
      // testIfElse();
      // testIfElse1();
      // testIfElse2();
      testIfElse3();
   }

   public static void testIfElse(){
      char character = 'a';
      if (character == 'a') {
         System.out.println(character + " is a vowel");
      } else {
         System.out.println(character + " is not a vowel");
      }
      if (character == 'A') {
         System.out.println(character + " is a vowel");
      } else {
         System.out.println(character + " is not a vowel");
      }
   }
   public static void testIfElse1(){
      char character = 'V';
      if (character == 'a') {
         System.out.println(character + " is a vowel");
      } 
      else if (character == 'A') {
         System.out.println(character + " is a vowel");
      } else {
         System.out.println(character + " is not a vowel");
      }
   }
   public static void testIfElse2(){
      char character = 'V';
      if (character == 'a') {
         System.out.println(character + " is a vowel");
      } 
      else 
      {
         if (character == 'A') {
            System.out.println(character + " is a vowel");
         } else {
            System.out.println(character + " is not a vowel");
         }
      }
   }
   public static void testIfElse3(){
      char character = 'V';
      if (character == 'a' || character == 'A') {
         System.out.println(character + " is a vowel");
      } 
      else
      {
         System.out.println(character + " is not a vowel");
      }
   }
}


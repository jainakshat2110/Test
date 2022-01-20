package collections;

import java.util.ArrayList;

public class ArrayListEx {
   public static void main(String[] args) {

      Book meaning = new Book();
      meaning.bookName = "Man's Search For Meaning";
      meaning.price = 205f;

      Book giant = new Book();
      giant.bookName = "Awaken the Giant within";
      giant.price = 380f;

      // create the ArrayList
      ArrayList bookList = new ArrayList();
      // add books to the list
      bookList.add(meaning);
      bookList.add(giant);

      // displaying the elements
      Book bookObj = (Book)bookList.get(1);
      bookObj.displayDetails();

   }
}

   class Book {
      public String bookName;
      public float price;

      public void displayDetails(){
         System.out.println(bookName);
         System.out.println(price);
      }
}



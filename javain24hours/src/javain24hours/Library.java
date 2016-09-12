package javain24hours;

import java.util.HashMap;
  public class Library {
    public void library (){
      
    }
    
    public void getFinishedBooks (HashMap<String, Boolean> library){
      if (library.size() < 1) {
        System.out.println("error 1");
      }else{
        for (String book: library.keySet()) {
						if (library.get(book) == true) {
								System.out.println("\nThis book has been completed: " + book);
   	  }
     }
   }
 }
    public static void main (String[] args){
      HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
      myBooks.put("Road Down The Funnel", true);
      myBooks.put("Rat: A Biology", false);
      myBooks.put("TimeIn", true);
      myBooks.put("3D Food Printing", false);
      
      Library myLibrary = new Library();
      myLibrary.getFinishedBooks(myBooks);
    }
  }
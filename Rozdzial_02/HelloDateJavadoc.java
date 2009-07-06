//: HelloDateJavadoc.java
import java.util.*;

/** Pierwszy program przyk³adowy z ksi¹¿ki "Thinking in Java" rozbudowany o komendy Javadoc
 * Wyœwietla dzisiejsz¹ datê i godzinê
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
*/


public class HelloDateJavadoc {
  /** Punkt wejœcia do klasy i aplikacji
   * @param args tablica ci¹gów argumentów wywo³ania
   * @param exceptions nie zg³asza wyj¹tków
  */
  public static void main(String[] args) {
    System.out.println("Witaj, dzisiaj jest: ");
    System.out.println(new Date());
  }
} /* Output: (55% match)
Witaj, dzisiaj jest: 
Fri Mar 03 16:27:29 CET 2006
*///:~

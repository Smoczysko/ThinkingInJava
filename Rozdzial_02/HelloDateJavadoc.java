//: HelloDateJavadoc.java
import java.util.*;

/** Pierwszy program przyk�adowy z ksi��ki "Thinking in Java" rozbudowany o komendy Javadoc
 * Wy�wietla dzisiejsz� dat� i godzin�
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
*/


public class HelloDateJavadoc {
  /** Punkt wej�cia do klasy i aplikacji
   * @param args tablica ci�g�w argument�w wywo�ania
   * @param exceptions nie zg�asza wyj�tk�w
  */
  public static void main(String[] args) {
    System.out.println("Witaj, dzisiaj jest: ");
    System.out.println(new Date());
  }
} /* Output: (55% match)
Witaj, dzisiaj jest: 
Fri Mar 03 16:27:29 CET 2006
*///:~

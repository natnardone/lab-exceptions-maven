package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    pen.print("Hi! I'm here to help you understand quadratic functions.\n");
    pen.print("Please enter a (the coefficient of the squared term): ");
    pen.flush();
    String a = eyes.readLine();
    pen.print("Please enter b (the coefficient of the linear term): ");
    pen.flush();
    String b = eyes.readLine();
    pen.print("Please enter c (the constant): ");
    pen.flush();
    String c = eyes.readLine();

    Quadratic quad = new Quadratic(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));
    double smallroot = quad.smallerRoot();
    pen.print("The smaller root of "+ quad.toString() + " is " + smallroot + ".\n");
    pen.print("Experimentally, " + quad.toString(smallroot) + " = " + quad.evaluate(smallroot) + ".\n");


    eyes.close();
    pen.close();
  } // main(String[])

} // QR

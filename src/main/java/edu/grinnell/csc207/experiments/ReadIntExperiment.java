package edu.grinnell.csc207.experiments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * A simple experiment to see whether readInt works. (Unit tests are a
 * PITA for I/O.)
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class ReadIntExperiment {
  /**
   * Run the experiment.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception when something goes wrong.
   */
  public static void main(String[] args)  {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));
    pen.printf("Please enter an integer: ");

    try {
      String response = eyes.readLine();
      int i = Integer.parseInt(response);
      pen.printf("%d squared is %d\n", i, i * i);
    } catch (Exception e) {
      int i = Integer.MIN_VALUE;
      pen.printf("%d squared is %d\n", i, i * i);
    } // Reading/parsing fails.

    try {
      eyes.close();
        
    } catch (Exception e) {
      return;
    }

    //int i = IOUtils.readInt(pen, eyes, "Please enter an integer: ");
    
    

    
    pen.close();
  } // main(String[])

} // ReadIntExperiment

package edu.grinnell.csc207;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.util.Quadratic;

/**
 * Tests of the Quadratic class.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class TestQuadratic {
  /**
   * Quadratic expressions with only the a coefficient.
   */
  @Test
  public void testRootsOnlyA() {
    assertEquals(0, (new Quadratic(4, 0, 0)).smallerRoot(), 0.001,
        "The smaller root of 4x^2 is 0");
    assertEquals(0, (new Quadratic(4, 0, 0)).largerRoot(), 0.001,
        "The larger root of 4x^2 is 0");
  } // testRootsOnlyA()

  /**
   * Quadratic expressions with only the a and b coefficients.
   */
  @Test
  public void testRootsNoC() {
    assertEquals(0, (new Quadratic(1, -3, 0)).smallerRoot(), 0.001,
        "The smaller root of x^2 - 3x is 0");
  } // testRootsNoC()

  @Test
  public void testSmallerRoot(){
    //Roots: 1 vs 3
    //-1 vs -3
    //1 vs -3
    //-1 vs 3
    assertEquals(1, new Quadratic(1, -4, 3).smallerRoot());
    assertEquals(-1, new Quadratic(1, 2, -3).smallerRoot());
    assertEquals(-3, new Quadratic(1, 2, -3).smallerRoot());
    assertEquals(-3, new Quadratic(1, 4, 3).smallerRoot());
    assertEquals(-1.5, new Quadratic(6, 1, -12).smallerRoot());
  }

} // class TestQuadratic

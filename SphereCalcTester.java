public class SphereCalcTester {
  public static void main( String[] args ) {

    // SphereCalc c = new SphereCalc();
    SphereCalc2 c = new SphereCalc2();

    c.radius = 5;
    if ( isNear(c.getSurfaceArea(), 314.159265359) )
      System.out.println("PASS: surfaceArea for " + c.getRadius());
    else
      System.out.println("FAIL: surfaceArea not what was expected!");
    if( isNear(c.getVolume(), 523.598775598) )
      System.out.println("PASS: volume for " + c.getRadius());
    else
      System.out.println("FAIL: volume not what was expected!");

    c.radius = 0.1;
    if( isNear(c.getSurfaceArea(), 0.125663706) )
      System.out.println("PASS: surfaceArea for " + c.getRadius());
    else
      System.out.println("FAIL: surfaceArea not what was expected!");
    if( isNear(c.getVolume(), 4.18879E-3) )
      System.out.println("PASS: volume for " + c.getRadius());
    else
      System.out.println("FAIL: volume not what was expected!");


  }

  public static boolean isNear( double a, double b ) {
    return Math.abs(a-b) < 1E-9;
  }
}

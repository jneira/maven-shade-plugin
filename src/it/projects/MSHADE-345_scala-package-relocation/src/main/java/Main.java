import org.apache.logging.log4j.scala.Logger;
import org.apache.logging.log4j.scala.Logging;
import org.apache.logging.log4j.spi.ExtendedLogger;


public class Main {
  public static void main(String[] args) {
    System.out.println("Test" + Logger.FQCN());
    Test t = new Test();
    System.out.println("Logger: " + t.logger());
  }

  public static class Test implements Logging{

    public ExtendedLogger logger() {
      return null;
    }

    public void org$apache$logging$log4j$scala$Logging$_setter_$logger_$eq(ExtendedLogger arg0) {
      return;
    }

  }
}
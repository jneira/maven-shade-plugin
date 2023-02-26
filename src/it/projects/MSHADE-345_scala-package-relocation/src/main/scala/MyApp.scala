import org.apache.logging.log4j.scala.Logger;
import org.apache.logging.log4j.scala.Logging;

object MyApp extends App with Logging {
  println("Logger FQCN" + Logger.FQCN)
  logger.info("Test Logging")
}
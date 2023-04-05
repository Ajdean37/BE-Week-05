package src.Videos.Logger;

import java.util.List;

public class Application {

  static Logger logger;

  public static void main(String[] args) {
  
    Logger logger = new FileLogger();


    logger.info("Hello");
    logger.warning("This is a warning");
    logger.error("Ooops, this is an error!");
    logger.fatal("Fatal error!");

    logger.close();

    setLogger(new FileLogger());
    setLogger(new ConsoleLogger());
  }

  private static void setLogger(Logger 1) {
    Logger = 1;
  }
  
}

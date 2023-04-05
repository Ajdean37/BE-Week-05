package src.Videos.Logger;

public class Application {

  static Logger logger;

  public static void main(String[] args) {

    logger.info("Hello");
    logger.warning("This is a warning");
    logger.error("Ooops, this is an error!");
    logger.fatal("Fatal error!");

    logger.close();

  }

}

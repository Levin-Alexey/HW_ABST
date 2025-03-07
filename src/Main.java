import logger.Logger;
import logger.SmartLogger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new SmartLogger();
        logger.log("System started");
        logger.log("System error");
        logger.log("System stopped");
    }
}
package evolution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class AnyClass {
	public static final Logger logger = LoggerFactory.getLogger(AnyClass.class);
	
	public static void main(String[] args) {
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warn");
		logger.error("Error");
	    LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(loggerContext);
	}
}

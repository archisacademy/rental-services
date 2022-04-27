package com.archisacademy.rentalservices.log;

import org.apache.logging.log4j.Logger;

public class LogManager {

    private Logger logger;

    public LogManager(Class<?> claz) {
        this.logger = org.apache.logging.log4j.LogManager.getLogger(claz);
    }

    public void log(String message) {
        logger.info(message);
    }
}

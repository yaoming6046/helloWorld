package com.hualala.test.logger;

import com.hualala.logger.logback.spe.ThreadHolder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class TestLogger {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testabc() {

        String a = "hello\nworld";
        System.out.println(a);
        System.out.println(a.replaceAll("\n", ""));
        ThreadHolder.put(UUID.randomUUID().toString());
        try {
            logger.info("this is abc hello\nworld");
            throw new Exception();
        } catch (Exception e) {
            logger.error("this is exception", e);
        }
        System.out.println();

    }


}

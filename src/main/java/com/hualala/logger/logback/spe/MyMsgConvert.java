package com.hualala.logger.logback.spe;

import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class MyMsgConvert  extends MessageConverter {

    public String convert(ILoggingEvent event) {
        return event.getFormattedMessage().replaceAll("\n","");
    }

}

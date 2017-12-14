package com.hualala.logger.logback.spe;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;

public class MyEncoder extends PatternLayoutEncoder {

    @Override
    public void start() {
//        super.start();
        started=true;
        MyPatternLayout patternLayout = new MyPatternLayout();
        patternLayout.setContext(context);
        patternLayout.setPattern(getPattern());
        patternLayout.setOutputPatternAsHeader(outputPatternAsHeader);
        patternLayout.start();
        this.layout = patternLayout;
    }

}

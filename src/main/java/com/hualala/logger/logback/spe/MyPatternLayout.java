package com.hualala.logger.logback.spe;

import ch.qos.logback.classic.PatternLayout;

public class MyPatternLayout<E> extends PatternLayout {
    static {
        defaultConverterMap.put("trace", TraceConvert.class.getName());

        defaultConverterMap.put("m", MyMsgConvert.class.getName());
        defaultConverterMap.put("msg", MyMsgConvert.class.getName());
        defaultConverterMap.put("message", MyMsgConvert.class.getName());

        defaultConverterMap.put("ex", MyThrowableConverter.class.getName());
        defaultConverterMap.put("exception", MyThrowableConverter.class.getName());
        defaultConverterMap.put("throwable", MyThrowableConverter.class.getName());
    }
    public void start() {
        setPostCompileProcessor(new MyEnsureExceptionHandling());
        System.out.println("hello world");
        super.start();
    }
}



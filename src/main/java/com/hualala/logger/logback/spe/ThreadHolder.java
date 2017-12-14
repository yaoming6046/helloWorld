package com.hualala.logger.logback.spe;


public class ThreadHolder {

    private static ThreadLocal<String> local = new ThreadLocal<String>();

    public static void put(String s) {
        local.set(s);
    }

    public static String getValue() {
        return local.get();
    }

}

package com.byted.cast.sdk.log;

import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes29.dex */
public class LoggerManager {
    public static final Map<String, Logger> LOGGER_CACHE = new WeakHashMap();

    public LoggerManager() {
        throw new UnsupportedOperationException();
    }

    public static Logger getLogger(String str) {
        Logger logger;
        Map<String, Logger> map = LOGGER_CACHE;
        synchronized (map) {
            logger = map.get(str);
        }
        if (logger == null) {
            logger = new Logger(str);
            synchronized (map) {
                map.put(str, logger);
            }
        }
        return logger;
    }
}

package com.ss.android.elearning.lingo.log;

import X.V0N;

/* loaded from: classes11.dex */
public enum LogLevel {
    VERBOSE,
    INFO,
    DEBUG,
    WARN,
    ERROR;

    public static LogLevel valueOf(String str) {
        return (LogLevel) V0N.LJJJ(LogLevel.class, str);
    }
}

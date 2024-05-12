package com.bytedance.ies.actionai.jni;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes15.dex */
public enum LogLevel {
    LEVEL_VERBOSE(0),
    LEVEL_DEBUG(1),
    LEVEL_INFO(2),
    LEVEL_WARNING(3),
    LEVEL_ERROR(4),
    LEVEL_ASSERT(5),
    LEVEL_OFF(6);

    public final int swigValue;

    /* loaded from: classes15.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static LogLevel swigToEnum(int i) {
        LogLevel[] logLevelArr = (LogLevel[]) LogLevel.class.getEnumConstants();
        if (i < logLevelArr.length && i >= 0) {
            LogLevel logLevel = logLevelArr[i];
            if (logLevel.swigValue == i) {
                return logLevel;
            }
        }
        for (LogLevel logLevel2 : logLevelArr) {
            if (logLevel2.swigValue == i) {
                return logLevel2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", LogLevel.class, " with value ", i));
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) V0N.LJJJ(LogLevel.class, str);
    }

    LogLevel() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    LogLevel(LogLevel logLevel) {
        int i = logLevel.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    LogLevel(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}

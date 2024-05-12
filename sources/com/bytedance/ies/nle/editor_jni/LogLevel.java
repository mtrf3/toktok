package com.bytedance.ies.nle.editor_jni;

import X.AnonymousClass073;
import X.C5O3;
import X.V0N;

/* loaded from: classes3.dex */
public enum LogLevel {
    LEVEL_VERBOSE(0),
    LEVEL_DEBUG(1),
    LEVEL_INFO(2),
    LEVEL_WARNING(3),
    LEVEL_ERROR(4),
    LEVEL_ASSERT(5),
    LEVEL_OFF(6);

    public final int swigValue;

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
        int i = C5O3.LIZ;
        C5O3.LIZ = i + 1;
        this.swigValue = i;
    }

    LogLevel(LogLevel logLevel) {
        int i = logLevel.swigValue;
        this.swigValue = i;
        C5O3.LIZ = i + 1;
    }

    LogLevel(int i) {
        this.swigValue = i;
        C5O3.LIZ = i + 1;
    }
}

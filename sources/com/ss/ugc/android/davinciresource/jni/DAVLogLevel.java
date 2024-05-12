package com.ss.ugc.android.davinciresource.jni;

import X.AnonymousClass073;
import X.C83476WpU;
import X.V0N;

/* loaded from: classes15.dex */
public enum DAVLogLevel {
    LEVEL_VERBOSE(0),
    LEVEL_DEBUG(1),
    LEVEL_INFO(2),
    LEVEL_WARNING(3),
    LEVEL_ERROR(4),
    LEVEL_OFF(5);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static DAVLogLevel swigToEnum(int i) {
        DAVLogLevel[] dAVLogLevelArr = (DAVLogLevel[]) DAVLogLevel.class.getEnumConstants();
        if (i < dAVLogLevelArr.length && i >= 0) {
            DAVLogLevel dAVLogLevel = dAVLogLevelArr[i];
            if (dAVLogLevel.swigValue == i) {
                return dAVLogLevel;
            }
        }
        for (DAVLogLevel dAVLogLevel2 : dAVLogLevelArr) {
            if (dAVLogLevel2.swigValue == i) {
                return dAVLogLevel2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", DAVLogLevel.class, " with value ", i));
    }

    public static DAVLogLevel valueOf(String str) {
        return (DAVLogLevel) V0N.LJJJ(DAVLogLevel.class, str);
    }

    DAVLogLevel() {
        int i = C83476WpU.LIZ;
        C83476WpU.LIZ = i + 1;
        this.swigValue = i;
    }

    DAVLogLevel(DAVLogLevel dAVLogLevel) {
        int i = dAVLogLevel.swigValue;
        this.swigValue = i;
        C83476WpU.LIZ = i + 1;
    }

    DAVLogLevel(int i) {
        this.swigValue = i;
        C83476WpU.LIZ = i + 1;
    }
}

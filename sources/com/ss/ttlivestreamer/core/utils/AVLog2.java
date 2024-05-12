package com.ss.ttlivestreamer.core.utils;

import X.X1D;
import android.util.AndroidRuntimeException;

/* loaded from: classes12.dex */
public class AVLog2 {
    public static int[] logIOMapKeysCount = new int[67];
    public static long[] logIOMapKeysInterval = new long[67];

    public static int logToIODevice2(int i, String str, String str2, Throwable th, int i2, int i3) {
        if (i2 >= 67 || i2 < 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("over count!!!", th);
            TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AVLog2.logToIODevice2(");
            LIZ.append(i2);
            LIZ.append(")");
            tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ));
            if (!TTLSBuildConfig.canThrowException()) {
                return -1;
            }
            throw androidRuntimeException;
        }
        int[] iArr = logIOMapKeysCount;
        iArr[i2] = iArr[i2] + 1;
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = logIOMapKeysInterval;
        if (currentTimeMillis - jArr[i2] > i3) {
            jArr[i2] = currentTimeMillis;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[repeat ");
            LIZ2.append(logIOMapKeysCount[i2]);
            LIZ2.append(" times] ");
            LIZ2.append(str2);
            AVLog.logToIODevice(i, str, X1D.LIZIZ(LIZ2), th);
            logIOMapKeysCount[i2] = 0;
        }
        return logIOMapKeysCount[i2];
    }
}

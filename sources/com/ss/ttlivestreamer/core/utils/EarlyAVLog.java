package com.ss.ttlivestreamer.core.utils;

import defpackage.i0;

/* loaded from: classes12.dex */
public class EarlyAVLog {
    public static IEarlyLogPrint sEarlyLogPrint;

    /* loaded from: classes12.dex */
    public interface IEarlyLogPrint {
        void print(int i, String str, String str2, Throwable th);
    }

    public static IEarlyLogPrint getEarlyLogPrint() {
        return sEarlyLogPrint;
    }

    public static void setEarlyLogPrint(IEarlyLogPrint iEarlyLogPrint) {
        sEarlyLogPrint = iEarlyLogPrint;
    }

    public static void println(int i, String str, String str2, Throwable th) {
        IEarlyLogPrint iEarlyLogPrint = sEarlyLogPrint;
        if (iEarlyLogPrint != null) {
            iEarlyLogPrint.print(i, i0.LJFF(str, "-EarlyAVLog"), str2, th);
        } else {
            DebugLogUtils.isEnableDebugLog();
        }
    }
}

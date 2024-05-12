package com.tencent.wcdb.support;

import X.C16880lQ;

/* loaded from: classes16.dex */
public class Log {

    /* loaded from: classes16.dex */
    public interface LogCallback {
        void println(int i, String str, String str2);
    }

    public static native void nativePrintLn(int i, String str, String str2);

    public static native void nativeSetLogger(int i, LogCallback logCallback);

    public static void LIZLLL(Object... objArr) {
        nativePrintLn(4, "WCDB.SQLiteConnectionPool", C16880lQ.LLLZ("Max connection pool size is %d.", objArr));
    }

    public static void LIZ(String str, String str2) {
        nativePrintLn(6, str, str2);
    }

    public static void LIZJ(String str, String str2) {
        nativePrintLn(4, str, str2);
    }

    public static void LJ(String str, String str2) {
        nativePrintLn(5, str, str2);
    }

    public static void LJFF(String str, Object... objArr) {
        nativePrintLn(5, "WCDB.SQLiteCursor", C16880lQ.LLLZ(str, objArr));
    }

    public static void LIZIZ(String str, String str2, Object... objArr) {
        nativePrintLn(6, str, C16880lQ.LLLZ(str2, objArr));
    }
}

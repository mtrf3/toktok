package com.ss.android.ttve.nativePort;

import X.FWO;

/* loaded from: classes12.dex */
public class TELogcat {
    public static native void nativeLog(byte b, String str, String str2);

    public static native void nativeSetLogLevel(byte b);

    static {
        synchronized (FWO.class) {
            FWO.LIZJ();
        }
    }

    public static void setLogLevel(byte b) {
        nativeSetLogLevel(b);
    }

    public static void Log(byte b, String str, String str2) {
        nativeLog(b, str, str2);
    }
}

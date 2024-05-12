package com.benchmark.port.nativePort;

import X.C32771Qj;

/* loaded from: classes.dex */
public class LogcatInvoker {
    public static native void nativeSetLogLevel(byte b);

    static {
        C32771Qj.LIZ();
        if (!C32771Qj.LIZIZ) {
            C32771Qj.LIZ();
        }
    }

    public static void LIZ(byte b) {
        if (C32771Qj.LIZIZ) {
            nativeSetLogLevel(b);
        }
    }
}

package com.benchmark.port.nativePort;

import X.C32771Qj;

/* loaded from: classes.dex */
public class BSModuleInvoker {
    public static native void nativeSetJsWorker(long j);

    static {
        C32771Qj.LIZ();
        if (!C32771Qj.LIZIZ) {
            C32771Qj.LIZ();
        }
    }

    public static void LIZ(long j) {
        if (C32771Qj.LIZIZ) {
            nativeSetJsWorker(j);
        }
    }
}

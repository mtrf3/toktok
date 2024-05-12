package com.benchmark.runtime.nativePort;

import X.C32771Qj;

/* loaded from: classes.dex */
public class BXStrategyManagePort {
    private native void native_createBenchStrategy(int i);

    private native void native_releaseByteBenchStrategy(int i);

    public final void LIZ(int i) {
        if (!C32771Qj.LIZIZ) {
            return;
        }
        native_createBenchStrategy(i);
    }
}

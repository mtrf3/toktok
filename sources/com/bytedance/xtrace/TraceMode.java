package com.bytedance.xtrace;

import X.V0N;

/* loaded from: classes2.dex */
public enum TraceMode {
    MODE_INSTRUMENTATION,
    MODE_INTERPRETER,
    MODE_TRACE;

    public static TraceMode valueOf(String str) {
        return (TraceMode) V0N.LJJJ(TraceMode.class, str);
    }
}

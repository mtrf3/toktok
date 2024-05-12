package com.bytedance.pia.core.tracing;

import X.V0N;

/* loaded from: classes7.dex */
public enum EventName {
    NavigateStart,
    WorkerEnvironmentInitializeStart,
    WorkerEnvironmentInitializeEnd,
    WorkerScriptRequestStart,
    WorkerScriptRequestEnd,
    WorkerExecuteStart,
    HTMLRequestStart,
    HTMLResponseStart,
    HTMLResponseEnd,
    ResourceInterceptStart,
    ResourceInterceptEnd;

    public static EventName valueOf(String str) {
        return (EventName) V0N.LJJJ(EventName.class, str);
    }
}

package com.bytedance.pitaya.thirdcomponent.trace;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface TraceReport extends ReflectionCall {
    boolean isTraceEnable();

    void reportTrace(String str, String str2, int i);
}

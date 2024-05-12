package com.bytedance.pitaya.api;

import X.YP3;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes16.dex */
public interface PTYSocketStateCallback extends ReflectionCall {
    public static final YP3 Companion = YP3.LIZ;

    void onSocketStateChange(String str, String str2);
}

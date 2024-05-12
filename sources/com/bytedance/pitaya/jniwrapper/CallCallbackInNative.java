package com.bytedance.pitaya.jniwrapper;

import com.bytedance.pitaya.api.bean.PTYError;

/* loaded from: classes30.dex */
public final class CallCallbackInNative {
    public static final CallCallbackInNative LIZ = new CallCallbackInNative();

    private final native void nativeCallDataCallback(long j, boolean z, PTYError pTYError, String str);

    private final native void nativeCallNoParamsCallback(long j);

    public final void LIZIZ(long j) {
        nativeCallNoParamsCallback(j);
    }

    public final void LIZ(long j, boolean z, PTYError pTYError, String str) {
        nativeCallDataCallback(j, z, pTYError, str);
    }
}

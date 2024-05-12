package com.bytedance.pitaya.cep_engine.inner;

/* loaded from: classes7.dex */
public final class JniCaller {
    public static final JniCaller LIZ = new JniCaller();

    public final native void callDataCallback(long j, boolean z, int i, String str);

    public final native void callNoParamsCallback(long j);
}

package com.bytedance.pitaya.thirdcomponent.net;

import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public abstract class InteractWithJNISocket extends IWebSocket {
    public final long nativePtr;

    public final long getNativePtr() {
        return this.nativePtr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractWithJNISocket(long j, String url) {
        super(url, null);
        o.LJIIJ(url, "url");
        this.nativePtr = j;
    }
}

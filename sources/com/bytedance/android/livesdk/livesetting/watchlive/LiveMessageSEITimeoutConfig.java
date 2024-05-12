package com.bytedance.android.livesdk.livesetting.watchlive;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMessageSEITimeoutConfig {

    @InterfaceC65349Pkn("bias")
    public long bias;

    @InterfaceC65349Pkn("max_timeout")
    public long maxTimeout;

    @InterfaceC65349Pkn("multiple")
    public float multiple;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessageSEITimeoutConfig() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r4 = r2
            r0.<init>(r1, r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.LiveMessageSEITimeoutConfig.<init>():void");
    }

    public LiveMessageSEITimeoutConfig(float f, long j, long j2) {
        this.multiple = f;
        this.bias = j;
        this.maxTimeout = j2;
    }

    public /* synthetic */ LiveMessageSEITimeoutConfig(float f, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 8000L : j2);
    }
}

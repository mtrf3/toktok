package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AllMessageFrequency extends LiveMessageFrequency {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("ignore_filter_p2p")
    public boolean ignoreFilterP2P;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AllMessageFrequency() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.AllMessageFrequency.<init>():void");
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getIgnoreFilterP2P() {
        return this.ignoreFilterP2P;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setIgnoreFilterP2P(boolean z) {
        this.ignoreFilterP2P = z;
    }

    public AllMessageFrequency(boolean z, boolean z2) {
        super(0L, 0L, 3, null);
        this.enable = z;
        this.ignoreFilterP2P = z2;
    }

    public /* synthetic */ AllMessageFrequency(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
    }
}

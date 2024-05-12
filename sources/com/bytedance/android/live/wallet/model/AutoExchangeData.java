package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class AutoExchangeData {

    @InterfaceC65349Pkn("auto_exchange_after")
    public boolean after;

    @InterfaceC65349Pkn("auto_exchange_before")
    public boolean before;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoExchangeData() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.model.AutoExchangeData.<init>():void");
    }

    public final boolean getAfter() {
        return this.after;
    }

    public final boolean getBefore() {
        return this.before;
    }

    public final void setAfter(boolean z) {
        this.after = z;
    }

    public final void setBefore(boolean z) {
        this.before = z;
    }

    public AutoExchangeData(boolean z, boolean z2) {
        this.before = z;
        this.after = z2;
    }

    public /* synthetic */ AutoExchangeData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}

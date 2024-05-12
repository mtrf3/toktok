package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TcmBarStatus extends F9E {

    @InterfaceC65349Pkn("bar_status")
    public final int barStatus;

    @InterfaceC65349Pkn("item_id")
    public final long itemId;

    @InterfaceC65349Pkn("order_id")
    public final long orderId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TcmBarStatus() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r4 = r1
            r0.<init>(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.tcm.api.TcmBarStatus.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.itemId), Integer.valueOf(this.barStatus), Long.valueOf(this.orderId)};
    }

    public TcmBarStatus(long j, int i, long j2) {
        this.itemId = j;
        this.barStatus = i;
        this.orderId = j2;
    }

    public /* synthetic */ TcmBarStatus(long j, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j2);
    }
}

package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class FlashSaleDTO extends F9E {

    @InterfaceC65349Pkn("begin_time")
    public final long beginTime;

    @InterfaceC65349Pkn("end_time")
    public final long endTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FlashSaleDTO() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.data.FlashSaleDTO.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.beginTime), Long.valueOf(this.endTime)};
    }

    public FlashSaleDTO(long j, long j2) {
        this.beginTime = j;
        this.endTime = j2;
    }

    public /* synthetic */ FlashSaleDTO(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}

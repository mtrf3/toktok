package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GiftInfoInBox {

    @InterfaceC65349Pkn("color_id")
    public long colorId;

    @InterfaceC65349Pkn("effect_id")
    public long effectId;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    @InterfaceC65349Pkn("remain_times")
    public int remainTimes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GiftInfoInBox() {
        /*
            r10 = this;
            r1 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r0 = r10
            r3 = r1
            r5 = r1
            r0.<init>(r1, r3, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.GiftInfoInBox.<init>():void");
    }

    public GiftInfoInBox(long j, long j2, long j3, int i) {
        this.giftId = j;
        this.effectId = j2;
        this.colorId = j3;
        this.remainTimes = i;
    }

    public /* synthetic */ GiftInfoInBox(long j, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) == 0 ? j3 : 0L, (i2 & 8) != 0 ? 0 : i);
    }
}

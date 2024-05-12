package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AddonRecommConfig extends F9E {

    @InterfaceC65349Pkn("is_recommend")
    public int isRecommend;

    @InterfaceC65349Pkn("max_close_time")
    public int maxCloseTime;

    @InterfaceC65349Pkn("max_enter_add_on_deal_time")
    public int maxEnterAddOnDealTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddonRecommConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.ab.AddonRecommConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isRecommend), Integer.valueOf(this.maxCloseTime), Integer.valueOf(this.maxEnterAddOnDealTime)};
    }

    public AddonRecommConfig(int i, int i2, int i3) {
        this.isRecommend = i;
        this.maxCloseTime = i2;
        this.maxEnterAddOnDealTime = i3;
    }

    public /* synthetic */ AddonRecommConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}

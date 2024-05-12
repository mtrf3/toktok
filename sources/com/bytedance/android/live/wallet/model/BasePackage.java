package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BasePackage {

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("local_price_real_dot")
    public int localDot;

    @InterfaceC65349Pkn("local_price")
    public long localPrice;

    @InterfaceC65349Pkn("price")
    public long price;

    @InterfaceC65349Pkn("real_dot")
    public int realDot;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BasePackage() {
        /*
            r11 = this;
            r1 = 0
            r5 = 0
            r9 = 31
            r10 = 0
            r0 = r11
            r3 = r1
            r6 = r1
            r8 = r5
            r0.<init>(r1, r3, r5, r6, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.model.BasePackage.<init>():void");
    }

    public final long getId() {
        return this.id;
    }

    public final int getLocalDot() {
        return this.localDot;
    }

    public final long getLocalPrice() {
        return this.localPrice;
    }

    public final long getPrice() {
        return this.price;
    }

    public final int getRealDot() {
        return this.realDot;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLocalDot(int i) {
        this.localDot = i;
    }

    public final void setLocalPrice(long j) {
        this.localPrice = j;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final void setRealDot(int i) {
        this.realDot = i;
    }

    public BasePackage(long j, long j2, int i, long j3, int i2) {
        this.id = j;
        this.price = j2;
        this.realDot = i;
        this.localPrice = j3;
        this.localDot = i2;
    }

    public /* synthetic */ BasePackage(long j, long j2, int i, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? j3 : 0L, (i3 & 16) == 0 ? i2 : 0);
    }
}

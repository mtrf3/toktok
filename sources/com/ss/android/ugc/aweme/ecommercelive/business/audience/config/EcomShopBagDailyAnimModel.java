package com.ss.android.ugc.aweme.ecommercelive.business.audience.config;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomShopBagDailyAnimModel {

    @InterfaceC65349Pkn("interval")
    public final Integer interval;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomShopBagDailyAnimModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcomShopBagDailyAnimModel) && o.LJ(this.interval, ((EcomShopBagDailyAnimModel) obj).interval);
    }

    public final int hashCode() {
        Integer num = this.interval;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomShopBagDailyAnimModel(interval=");
        return s0.LIZJ(LIZ, this.interval, ')', LIZ);
    }

    public EcomShopBagDailyAnimModel(Integer num) {
        this.interval = num;
    }

    public /* synthetic */ EcomShopBagDailyAnimModel(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}

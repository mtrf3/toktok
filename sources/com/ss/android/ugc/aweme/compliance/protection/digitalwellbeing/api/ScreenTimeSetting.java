package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ScreenTimeSetting {

    @InterfaceC65349Pkn("minor_upsell")
    public final Integer minorUpsell;

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenTimeSetting() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreenTimeSetting) && o.LJ(this.minorUpsell, ((ScreenTimeSetting) obj).minorUpsell);
    }

    public final int hashCode() {
        Integer num = this.minorUpsell;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ScreenTimeSetting(minorUpsell=");
        return s0.LIZJ(LIZ, this.minorUpsell, ')', LIZ);
    }

    public ScreenTimeSetting(Integer num) {
        this.minorUpsell = num;
    }

    public /* synthetic */ ScreenTimeSetting(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num);
    }
}

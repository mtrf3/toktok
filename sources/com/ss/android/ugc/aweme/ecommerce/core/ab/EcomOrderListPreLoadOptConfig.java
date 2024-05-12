package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomOrderListPreLoadOptConfig {

    @InterfaceC65349Pkn("region")
    public final String region;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomOrderListPreLoadOptConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcomOrderListPreLoadOptConfig) && o.LJ(this.region, ((EcomOrderListPreLoadOptConfig) obj).region);
    }

    public final int hashCode() {
        String str = this.region;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomOrderListPreLoadOptConfig(region=");
        return q.LIZIZ(LIZ, this.region, ')', LIZ);
    }

    public EcomOrderListPreLoadOptConfig(String str) {
        this.region = str;
    }

    public /* synthetic */ EcomOrderListPreLoadOptConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

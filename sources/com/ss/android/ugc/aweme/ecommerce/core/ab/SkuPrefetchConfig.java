package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkuPrefetchConfig {

    @InterfaceC65349Pkn("duration")
    public final int duration;

    @InterfaceC65349Pkn("enable")
    public final Boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public SkuPrefetchConfig() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPrefetchConfig)) {
            return false;
        }
        SkuPrefetchConfig skuPrefetchConfig = (SkuPrefetchConfig) obj;
        return o.LJ(this.enable, skuPrefetchConfig.enable) && this.duration == skuPrefetchConfig.duration;
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.duration;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuPrefetchConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", duration=");
        return b0.LIZJ(LIZ, this.duration, ')', LIZ);
    }

    public SkuPrefetchConfig(Boolean bool, int i) {
        this.enable = bool;
        this.duration = i;
    }

    public /* synthetic */ SkuPrefetchConfig(Boolean bool, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? 0 : i);
    }
}

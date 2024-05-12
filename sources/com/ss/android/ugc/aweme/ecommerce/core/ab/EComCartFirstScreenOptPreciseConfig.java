package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EComCartFirstScreenOptPreciseConfig {

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public EComCartFirstScreenOptPreciseConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EComCartFirstScreenOptPreciseConfig)) {
            return false;
        }
        EComCartFirstScreenOptPreciseConfig eComCartFirstScreenOptPreciseConfig = (EComCartFirstScreenOptPreciseConfig) obj;
        return this.enable == eComCartFirstScreenOptPreciseConfig.enable && o.LJ(this.channel, eComCartFirstScreenOptPreciseConfig.channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.channel;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EComCartFirstScreenOptPreciseConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", channel=");
        return q.LIZIZ(LIZ, this.channel, ')', LIZ);
    }

    public EComCartFirstScreenOptPreciseConfig(boolean z, String str) {
        this.enable = z;
        this.channel = str;
    }

    public /* synthetic */ EComCartFirstScreenOptPreciseConfig(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}

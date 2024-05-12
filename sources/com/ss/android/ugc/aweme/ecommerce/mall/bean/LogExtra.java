package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LogExtra {

    @InterfaceC65349Pkn("product_source")
    public final String productSource;

    @InterfaceC65349Pkn("source_from")
    public final String sourceFrom;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogExtra)) {
            return false;
        }
        LogExtra logExtra = (LogExtra) obj;
        return o.LJ(this.productSource, logExtra.productSource) && o.LJ(this.sourceFrom, logExtra.sourceFrom);
    }

    public final int hashCode() {
        String str = this.productSource;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceFrom;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogExtra(productSource=");
        LIZ.append(this.productSource);
        LIZ.append(", sourceFrom=");
        return q.LIZIZ(LIZ, this.sourceFrom, ')', LIZ);
    }

    public LogExtra(String str, String str2) {
        this.productSource = str;
        this.sourceFrom = str2;
    }
}

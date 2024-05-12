package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecommendDaInfo {

    @InterfaceC65349Pkn("recommend_info")
    public final String recommendInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendDaInfo) && o.LJ(this.recommendInfo, ((RecommendDaInfo) obj).recommendInfo);
    }

    public final int hashCode() {
        String str = this.recommendInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendDaInfo(recommendInfo=");
        return q.LIZIZ(LIZ, this.recommendInfo, ')', LIZ);
    }

    public RecommendDaInfo(String str) {
        this.recommendInfo = str;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RecommendAfterAddData {

    @InterfaceC65349Pkn("recommend_infos")
    public final RecommendInfo recommendInfos;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendAfterAddData) && o.LJ(this.recommendInfos, ((RecommendAfterAddData) obj).recommendInfos);
    }

    public final int hashCode() {
        RecommendInfo recommendInfo = this.recommendInfos;
        if (recommendInfo == null) {
            return 0;
        }
        return recommendInfo.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendAfterAddData(recommendInfos=");
        LIZ.append(this.recommendInfos);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RecommendAfterAddData(RecommendInfo recommendInfo) {
        this.recommendInfos = recommendInfo;
    }
}

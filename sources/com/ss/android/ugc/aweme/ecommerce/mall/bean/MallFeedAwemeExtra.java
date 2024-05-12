package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MallFeedAwemeExtra {

    @InterfaceC65349Pkn("recommend_info")
    public final String recommendInfo;

    public static /* synthetic */ MallFeedAwemeExtra copy$default(MallFeedAwemeExtra mallFeedAwemeExtra, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mallFeedAwemeExtra.recommendInfo;
        }
        return mallFeedAwemeExtra.copy(str);
    }

    public final MallFeedAwemeExtra copy(String str) {
        return new MallFeedAwemeExtra(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MallFeedAwemeExtra) && o.LJ(this.recommendInfo, ((MallFeedAwemeExtra) obj).recommendInfo);
    }

    public int hashCode() {
        String str = this.recommendInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallFeedAwemeExtra(recommendInfo=");
        return q.LIZIZ(LIZ, this.recommendInfo, ')', LIZ);
    }

    public final String getRecommendInfo() {
        return this.recommendInfo;
    }

    public MallFeedAwemeExtra(String str) {
        this.recommendInfo = str;
    }
}

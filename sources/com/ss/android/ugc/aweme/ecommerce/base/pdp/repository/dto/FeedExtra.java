package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FeedExtra {

    @InterfaceC65349Pkn("recommend_info")
    public final String recommendInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedExtra) && o.LJ(this.recommendInfo, ((FeedExtra) obj).recommendInfo);
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
        LIZ.append("FeedExtra(recommendInfo=");
        return q.LIZIZ(LIZ, this.recommendInfo, ')', LIZ);
    }

    public FeedExtra(String str) {
        this.recommendInfo = str;
    }

    public /* synthetic */ FeedExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

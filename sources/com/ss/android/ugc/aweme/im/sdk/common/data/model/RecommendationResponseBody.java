package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendationResponseBody {

    @InterfaceC65349Pkn("uids")
    public final List<Long> uids;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationResponseBody() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendationResponseBody) && o.LJ(this.uids, ((RecommendationResponseBody) obj).uids);
    }

    public final int hashCode() {
        List<Long> list = this.uids;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendationResponseBody(uids=");
        return C1NE.LIZIZ(LIZ, this.uids, ')', LIZ);
    }

    public RecommendationResponseBody(List<Long> list) {
        this.uids = list;
    }

    public /* synthetic */ RecommendationResponseBody(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
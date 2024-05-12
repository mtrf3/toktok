package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendFeedRequest {

    @InterfaceC65349Pkn("common_feed_requests_list")
    public final List<CommonFeedRequest> requests;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendFeedRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendFeedRequest) && o.LJ(this.requests, ((RecommendFeedRequest) obj).requests);
    }

    public final int hashCode() {
        List<CommonFeedRequest> list = this.requests;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendFeedRequest(requests=");
        return C1NE.LIZIZ(LIZ, this.requests, ')', LIZ);
    }

    public RecommendFeedRequest(List<CommonFeedRequest> list) {
        this.requests = list;
    }

    public /* synthetic */ RecommendFeedRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

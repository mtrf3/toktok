package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingTopicListResponse extends BaseResponse {

    @InterfaceC65349Pkn("billboard_info")
    public final List<BillboardInfo> topicList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrendingTopicListResponse) && o.LJ(this.topicList, ((TrendingTopicListResponse) obj).topicList);
    }

    public final int hashCode() {
        List<BillboardInfo> list = this.topicList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingTopicListResponse(topicList=");
        return C1NE.LIZIZ(LIZ, this.topicList, ')', LIZ);
    }

    public TrendingTopicListResponse(List<BillboardInfo> list) {
        this.topicList = list;
    }
}

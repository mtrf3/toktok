package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingTopicSearchResponse extends BaseResponse {

    @InterfaceC65349Pkn("billboard_plain_info")
    public final List<VideoTrendingTopic> topics;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrendingTopicSearchResponse) && o.LJ(this.topics, ((TrendingTopicSearchResponse) obj).topics);
    }

    public final int hashCode() {
        List<VideoTrendingTopic> list = this.topics;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingTopicSearchResponse(topics=");
        return C1NE.LIZIZ(LIZ, this.topics, ')', LIZ);
    }

    public TrendingTopicSearchResponse(List<VideoTrendingTopic> list) {
        this.topics = list;
    }
}

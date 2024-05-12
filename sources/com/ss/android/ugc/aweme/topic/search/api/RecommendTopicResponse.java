package com.ss.android.ugc.aweme.topic.search.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendTopicResponse {

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("page_extra")
    public final String pageExtra;

    @InterfaceC65349Pkn("topic_info")
    public final List<TopicRawInfo> topicInfoList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendTopicResponse)) {
            return false;
        }
        RecommendTopicResponse recommendTopicResponse = (RecommendTopicResponse) obj;
        return o.LJ(this.topicInfoList, recommendTopicResponse.topicInfoList) && o.LJ(this.hasMore, recommendTopicResponse.hasMore) && o.LJ(this.pageExtra, recommendTopicResponse.pageExtra);
    }

    public final int hashCode() {
        List<TopicRawInfo> list = this.topicInfoList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.pageExtra;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendTopicResponse(topicInfoList=");
        LIZ.append(this.topicInfoList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", pageExtra=");
        return q.LIZIZ(LIZ, this.pageExtra, ')', LIZ);
    }

    public RecommendTopicResponse(List<TopicRawInfo> list, Boolean bool, String str) {
        this.topicInfoList = list;
        this.hasMore = bool;
        this.pageExtra = str;
    }
}

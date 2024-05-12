package com.ss.android.ugc.aweme.topic.search.api;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SuggestTopicResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn(alternate = {"book_list"}, value = "movie_list")
    public final List<TopicRawInfo> infoList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestTopicResponse)) {
            return false;
        }
        SuggestTopicResponse suggestTopicResponse = (SuggestTopicResponse) obj;
        return o.LJ(this.infoList, suggestTopicResponse.infoList) && o.LJ(this.cursor, suggestTopicResponse.cursor) && o.LJ(this.hasMore, suggestTopicResponse.hasMore);
    }

    public final int hashCode() {
        List<TopicRawInfo> list = this.infoList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.cursor;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestTopicResponse(infoList=");
        LIZ.append(this.infoList);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        return C78920UyC.LIZIZ(LIZ, this.hasMore, ')', LIZ);
    }

    public SuggestTopicResponse(List<TopicRawInfo> list, Long l, Boolean bool) {
        this.infoList = list;
        this.cursor = l;
        this.hasMore = bool;
    }
}

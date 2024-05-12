package com.ss.android.ugc.aweme.upvote.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpvoteBatchListResponse extends BaseResponse {

    @InterfaceC65349Pkn("biz_extra")
    public final Map<String, Long> upvoteExtra;

    @InterfaceC65349Pkn("upvote_lists")
    public final List<UpvoteList> upvoteLists;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteBatchListResponse)) {
            return false;
        }
        UpvoteBatchListResponse upvoteBatchListResponse = (UpvoteBatchListResponse) obj;
        return o.LJ(this.upvoteLists, upvoteBatchListResponse.upvoteLists) && o.LJ(this.upvoteExtra, upvoteBatchListResponse.upvoteExtra);
    }

    public final int hashCode() {
        int hashCode = this.upvoteLists.hashCode() * 31;
        Map<String, Long> map = this.upvoteExtra;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvoteBatchListResponse(upvoteLists=");
        LIZ.append(this.upvoteLists);
        LIZ.append(", upvoteExtra=");
        return C15890jp.LIZ(LIZ, this.upvoteExtra, ')', LIZ);
    }

    public UpvoteBatchListResponse(List<UpvoteList> upvoteLists, Map<String, Long> map) {
        o.LJIIIZ(upvoteLists, "upvoteLists");
        this.upvoteLists = upvoteLists;
        this.upvoteExtra = map;
    }

    public /* synthetic */ UpvoteBatchListResponse(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : map);
    }
}

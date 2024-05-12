package com.ss.android.ugc.aweme.upvote.model;

import X.C15890jp;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RepostListResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> repostList;

    @InterfaceC65349Pkn("biz_extra")
    public final Map<String, Long> upvoteExtra;

    public RepostListResponse() {
        this(null, false, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostListResponse)) {
            return false;
        }
        RepostListResponse repostListResponse = (RepostListResponse) obj;
        return o.LJ(this.repostList, repostListResponse.repostList) && this.hasMore == repostListResponse.hasMore && o.LJ(this.upvoteExtra, repostListResponse.upvoteExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.repostList.hashCode() * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Map<String, Long> map = this.upvoteExtra;
        return i2 + (map == null ? 0 : map.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RepostListResponse(repostList=");
        LIZ.append(this.repostList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", upvoteExtra=");
        return C15890jp.LIZ(LIZ, this.upvoteExtra, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RepostListResponse(List<? extends Aweme> repostList, boolean z, Map<String, Long> map) {
        o.LJIIIZ(repostList, "repostList");
        this.repostList = repostList;
        this.hasMore = z;
        this.upvoteExtra = map;
    }

    public RepostListResponse(List list, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : map);
    }
}

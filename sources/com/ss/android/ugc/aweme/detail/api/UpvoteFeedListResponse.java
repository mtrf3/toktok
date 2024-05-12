package com.ss.android.ugc.aweme.detail.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpvoteFeedListResponse extends BaseResponse {

    @InterfaceC65349Pkn("pagination")
    public FeedPagination pagination;

    @InterfaceC65349Pkn("data")
    public final ArrayList<UpvoteFeedStruct> upvoteFeedList;

    /* JADX WARN: Multi-variable type inference failed */
    public UpvoteFeedListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpvoteFeedListResponse) {
            return C78966Uyw.LJIIIZ(((UpvoteFeedListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.upvoteFeedList, this.pagination};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("UpvoteFeedListResponse:%s,%s", getObjects());
    }

    public UpvoteFeedListResponse(ArrayList<UpvoteFeedStruct> upvoteFeedList, FeedPagination pagination) {
        o.LJIIIZ(upvoteFeedList, "upvoteFeedList");
        o.LJIIIZ(pagination, "pagination");
        this.upvoteFeedList = upvoteFeedList;
        this.pagination = pagination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ UpvoteFeedListResponse(ArrayList arrayList, FeedPagination feedPagination, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new FeedPagination(false, 0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : feedPagination);
    }
}

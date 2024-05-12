package com.ss.android.ugc.aweme.topic.review.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicReviewListResp extends F9E {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("review_list")
    public final List<TopicReview> reviewList;

    public TopicReviewListResp() {
        this(null, 0L, false, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.reviewList, Long.valueOf(this.cursor), Boolean.valueOf(this.hasMore)};
    }

    public TopicReviewListResp(List<TopicReview> reviewList, long j, boolean z) {
        o.LJIIIZ(reviewList, "reviewList");
        this.reviewList = reviewList;
        this.cursor = j;
        this.hasMore = z;
    }

    public TopicReviewListResp(List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}

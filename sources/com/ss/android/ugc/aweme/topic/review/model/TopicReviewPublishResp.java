package com.ss.android.ugc.aweme.topic.review.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicReviewPublishResp {

    @InterfaceC65349Pkn("review_id")
    public final String reviewId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TopicReviewPublishResp) && o.LJ(this.reviewId, ((TopicReviewPublishResp) obj).reviewId);
    }

    public final int hashCode() {
        String str = this.reviewId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicReviewPublishResp(reviewId=");
        return q.LIZIZ(LIZ, this.reviewId, ')', LIZ);
    }

    public TopicReviewPublishResp(String str) {
        this.reviewId = str;
    }
}

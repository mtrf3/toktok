package com.ss.android.ugc.aweme.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidContentReviewSection implements Serializable {

    @InterfaceC65349Pkn("collection_id")
    public final long collectionId;

    @InterfaceC65349Pkn("reviews")
    public final List<PaidContentReview> reviews;

    public PaidContentReviewSection() {
        this(null, 0L, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaidContentReviewSection copy$default(PaidContentReviewSection paidContentReviewSection, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paidContentReviewSection.reviews;
        }
        if ((i & 2) != 0) {
            j = paidContentReviewSection.collectionId;
        }
        return paidContentReviewSection.copy(list, j);
    }

    public final PaidContentReviewSection copy(List<PaidContentReview> list, long j) {
        return new PaidContentReviewSection(list, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidContentReviewSection)) {
            return false;
        }
        PaidContentReviewSection paidContentReviewSection = (PaidContentReviewSection) obj;
        return o.LJ(this.reviews, paidContentReviewSection.reviews) && this.collectionId == paidContentReviewSection.collectionId;
    }

    public int hashCode() {
        List<PaidContentReview> list = this.reviews;
        return C16880lQ.LLJIJIL(this.collectionId) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentReviewSection(reviews=");
        LIZ.append(this.reviews);
        LIZ.append(", collectionId=");
        return C47135Ieh.LIZIZ(LIZ, this.collectionId, ')', LIZ);
    }

    public final long getCollectionId() {
        return this.collectionId;
    }

    public final List<PaidContentReview> getReviews() {
        return this.reviews;
    }

    public PaidContentReviewSection(List<PaidContentReview> list, long j) {
        this.reviews = list;
        this.collectionId = j;
    }

    public PaidContentReviewSection(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? 0L : j);
    }
}

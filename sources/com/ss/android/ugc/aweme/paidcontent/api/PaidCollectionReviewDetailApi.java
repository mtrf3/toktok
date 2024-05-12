package com.ss.android.ugc.aweme.paidcontent.api;

import X.AbstractC73672Svk;
import X.AnonymousClass391;
import X.C47959Irz;
import X.C79062V1e;
import X.C86444XwG;
import X.E8L;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.model.PaidContentReview;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public interface PaidCollectionReviewDetailApi {
    public static final C86444XwG LIZ = C86444XwG.LIZ;

    /* loaded from: classes5.dex */
    public static final class PaidCollectionReviewDetailResponse {

        @InterfaceC65349Pkn("avg_rating")
        public final float averageRating;

        @InterfaceC65349Pkn("can_edit")
        public final boolean canEdit;

        @InterfaceC65349Pkn("collection_id")
        public final long collectionId;

        @InterfaceC65349Pkn("creator_id")
        public final String creatorId;

        @InterfaceC65349Pkn("cursor")
        public final long cursor;

        @InterfaceC65349Pkn("has_more")
        public final boolean hasMore;

        @InterfaceC65349Pkn("reviews")
        public final List<PaidContentReview> reviews;

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("status_msg")
        public final String statusMessage;

        @InterfaceC65349Pkn("total")
        public final long total;

        @InterfaceC65349Pkn("viewer_review")
        public final PaidContentReview viewerReview;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaidCollectionReviewDetailResponse)) {
                return false;
            }
            PaidCollectionReviewDetailResponse paidCollectionReviewDetailResponse = (PaidCollectionReviewDetailResponse) obj;
            return this.statusCode == paidCollectionReviewDetailResponse.statusCode && o.LJ(this.statusMessage, paidCollectionReviewDetailResponse.statusMessage) && o.LJ(this.reviews, paidCollectionReviewDetailResponse.reviews) && this.hasMore == paidCollectionReviewDetailResponse.hasMore && this.cursor == paidCollectionReviewDetailResponse.cursor && this.total == paidCollectionReviewDetailResponse.total && this.collectionId == paidCollectionReviewDetailResponse.collectionId && o.LJ(this.creatorId, paidCollectionReviewDetailResponse.creatorId) && Float.compare(this.averageRating, paidCollectionReviewDetailResponse.averageRating) == 0 && this.canEdit == paidCollectionReviewDetailResponse.canEdit && o.LJ(this.viewerReview, paidCollectionReviewDetailResponse.viewerReview);
        }

        public final String toString() {
            return "PaidCollectionReviewDetailResponse(statusCode=" + this.statusCode + ", statusMessage=" + this.statusMessage + ", reviews=" + this.reviews + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", total=" + this.total + ", collectionId=" + this.collectionId + ", creatorId=" + this.creatorId + ", averageRating=" + this.averageRating + ", canEdit=" + this.canEdit + ", viewerReview=" + this.viewerReview + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int LIZIZ = AnonymousClass391.LIZIZ(this.reviews, C79062V1e.LJ(this.statusMessage, this.statusCode * 31, 31), 31);
            boolean z = this.hasMore;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int LIZIZ2 = C47959Irz.LIZIZ(this.averageRating, C79062V1e.LJ(this.creatorId, JBR.LIZJ(this.collectionId, JBR.LIZJ(this.total, JBR.LIZJ(this.cursor, (LIZIZ + i2) * 31, 31), 31), 31), 31), 31);
            if (!this.canEdit) {
                i = 0;
            }
            return this.viewerReview.hashCode() + ((LIZIZ2 + i) * 31);
        }

        public PaidCollectionReviewDetailResponse(int i, String statusMessage, List<PaidContentReview> reviews, boolean z, long j, long j2, long j3, String creatorId, float f, boolean z2, PaidContentReview viewerReview) {
            o.LJIIIZ(statusMessage, "statusMessage");
            o.LJIIIZ(reviews, "reviews");
            o.LJIIIZ(creatorId, "creatorId");
            o.LJIIIZ(viewerReview, "viewerReview");
            this.statusCode = i;
            this.statusMessage = statusMessage;
            this.reviews = reviews;
            this.hasMore = z;
            this.cursor = j;
            this.total = j2;
            this.collectionId = j3;
            this.creatorId = creatorId;
            this.averageRating = f;
            this.canEdit = z2;
            this.viewerReview = viewerReview;
        }
    }

    @E8L("/tiktok/v1/paid_content/product/review/list")
    AbstractC73672Svk<PaidCollectionReviewDetailResponse> request(@InterfaceC64989Pez("collection_id") long j, @InterfaceC64989Pez("cursor") long j2, @InterfaceC64989Pez("count") int i);
}

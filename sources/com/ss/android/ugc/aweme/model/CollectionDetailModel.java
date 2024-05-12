package com.ss.android.ugc.aweme.model;

import X.AnonymousClass391;
import X.C07670Rv;
import X.C16880lQ;
import X.C47959Irz;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CollectionDetailModel implements Serializable {

    @InterfaceC65349Pkn("can_user_refund")
    public final boolean canCollectionRefund;

    @InterfaceC65349Pkn("can_user_review")
    public final boolean canReviewCollection;

    @InterfaceC65349Pkn("cover")
    public final UrlModel collectionCover;

    @InterfaceC65349Pkn("create_timestamp")
    public final long collectionCreateTimestamp;

    @InterfaceC65349Pkn("creator")
    public final User collectionCreator;

    @InterfaceC65349Pkn("description")
    public final String collectionDescription;

    @InterfaceC65349Pkn("collection_id")
    public final long collectionId;

    @InterfaceC65349Pkn("name")
    public final String collectionName;

    @InterfaceC65349Pkn("publish_timestamp")
    public final long collectionPublishTimestamp;

    @InterfaceC65349Pkn("avg_rating_float")
    public final float collectionRating;

    @InterfaceC65349Pkn("num_ratings")
    public final long collectionRatingNum;

    @InterfaceC65349Pkn("num_sales")
    public final long collectionSalesNum;

    @InterfaceC65349Pkn("status")
    public final long collectionStatus;

    @InterfaceC65349Pkn("total_duration")
    public final long collectionTotalDuration;

    @InterfaceC65349Pkn("num_videos")
    public final int collectionVideoNum;

    @InterfaceC65349Pkn("discounted_price")
    public final PriceInfo discountedPriceInfo;

    @InterfaceC65349Pkn("has_user_purchased")
    public final boolean hasPurchasedCollection;

    @InterfaceC65349Pkn("has_voucher")
    public final boolean hasVoucher;

    @InterfaceC65349Pkn("is_eager_review_displayed")
    public final boolean isEagerReviewDisplayed;

    @InterfaceC65349Pkn("is_standard_review_displayed")
    public final boolean isStandardReviewDisplayed;

    @InterfaceC65349Pkn("review_section")
    public final PaidContentReviewSection paidContentReviewSection;

    @InterfaceC65349Pkn("paid_videos")
    public final List<PaidVideoItem> paidVideoList;

    @InterfaceC65349Pkn("price")
    public final PriceInfo priceInfo;

    @InterfaceC65349Pkn("replace_rating_with_cta")
    public final boolean replaceRatingWithCta;

    @InterfaceC65349Pkn("should_prompt_review")
    public final boolean shouldPromptReview;

    @InterfaceC65349Pkn("video_completion_threshold")
    public final Double videoCompletionThreshold;

    @InterfaceC65349Pkn("voucher_description")
    public final String voucherDescription;

    @InterfaceC65349Pkn("voucher_expiration_timestamp")
    public final long voucherExpireTimestamp;

    @InterfaceC65349Pkn("voucher_id")
    public final Long voucherId;

    @InterfaceC65349Pkn("voucher_is_countdown")
    public final boolean voucherIsCountdown;

    @InterfaceC65349Pkn("voucher_status")
    public final VoucherStatus voucherStatus;

    @InterfaceC65349Pkn("voucher_tag")
    public final String voucherTag;

    @InterfaceC65349Pkn("voucher_type")
    public final int voucherUrgencyType;

    @InterfaceC65349Pkn("web_payment_link")
    public final String webPaymentLink;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollectionDetailModel() {
        /*
            r46 = this;
            r1 = 0
            r3 = 0
            r17 = 0
            r18 = 0
            r43 = -1
            r44 = 3
            r0 = r46
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r1
            r9 = r1
            r11 = r1
            r13 = r1
            r15 = r1
            r19 = r1
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r3
            r26 = r3
            r27 = r18
            r28 = r18
            r29 = r18
            r30 = r3
            r31 = r3
            r32 = r18
            r33 = r3
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r18
            r38 = r1
            r40 = r18
            r41 = r3
            r42 = r3
            r45 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r9, r11, r13, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.model.CollectionDetailModel.<init>():void");
    }

    public static /* synthetic */ CollectionDetailModel copy$default(CollectionDetailModel collectionDetailModel, long j, String str, String str2, UrlModel urlModel, User user, long j2, long j3, long j4, long j5, long j6, float f, int i, long j7, boolean z, boolean z2, boolean z3, boolean z4, List list, PaidContentReviewSection paidContentReviewSection, boolean z5, boolean z6, boolean z7, PriceInfo priceInfo, PriceInfo priceInfo2, boolean z8, Long l, VoucherStatus voucherStatus, String str3, String str4, boolean z9, long j8, int i2, Double d, String str5, int i3, int i4, Object obj) {
        long j9 = j5;
        long j10 = j4;
        long j11 = j3;
        String str6 = str;
        long j12 = j;
        String str7 = str2;
        UrlModel urlModel2 = urlModel;
        User user2 = user;
        long j13 = j2;
        long j14 = j8;
        boolean z10 = z9;
        String str8 = str3;
        VoucherStatus voucherStatus2 = voucherStatus;
        Long l2 = l;
        Double d2 = d;
        boolean z11 = z;
        int i5 = i2;
        PriceInfo priceInfo3 = priceInfo;
        boolean z12 = z2;
        long j15 = j7;
        String str9 = str5;
        int i6 = i;
        boolean z13 = z8;
        String str10 = str4;
        long j16 = j6;
        PaidContentReviewSection paidContentReviewSection2 = paidContentReviewSection;
        boolean z14 = z3;
        boolean z15 = z4;
        List list2 = list;
        boolean z16 = z5;
        float f2 = f;
        boolean z17 = z6;
        boolean z18 = z7;
        PriceInfo priceInfo4 = priceInfo2;
        if ((i3 & 1) != 0) {
            j12 = collectionDetailModel.collectionId;
        }
        if ((i3 & 2) != 0) {
            str6 = collectionDetailModel.collectionName;
        }
        if ((i3 & 4) != 0) {
            str7 = collectionDetailModel.collectionDescription;
        }
        if ((i3 & 8) != 0) {
            urlModel2 = collectionDetailModel.collectionCover;
        }
        if ((i3 & 16) != 0) {
            user2 = collectionDetailModel.collectionCreator;
        }
        if ((i3 & 32) != 0) {
            j13 = collectionDetailModel.collectionPublishTimestamp;
        }
        if ((i3 & 64) != 0) {
            j11 = collectionDetailModel.collectionCreateTimestamp;
        }
        if ((i3 & 128) != 0) {
            j10 = collectionDetailModel.collectionStatus;
        }
        if ((i3 & 256) != 0) {
            j9 = collectionDetailModel.collectionSalesNum;
        }
        if ((i3 & 512) != 0) {
            j16 = collectionDetailModel.collectionRatingNum;
        }
        if ((i3 & 1024) != 0) {
            f2 = collectionDetailModel.collectionRating;
        }
        if ((i3 & 2048) != 0) {
            i6 = collectionDetailModel.collectionVideoNum;
        }
        if ((i3 & 4096) != 0) {
            j15 = collectionDetailModel.collectionTotalDuration;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            z11 = collectionDetailModel.hasPurchasedCollection;
        }
        if ((i3 & 16384) != 0) {
            z12 = collectionDetailModel.canReviewCollection;
        }
        if ((32768 & i3) != 0) {
            z14 = collectionDetailModel.shouldPromptReview;
        }
        if ((65536 & i3) != 0) {
            z15 = collectionDetailModel.canCollectionRefund;
        }
        if ((131072 & i3) != 0) {
            list2 = collectionDetailModel.paidVideoList;
        }
        if ((262144 & i3) != 0) {
            paidContentReviewSection2 = collectionDetailModel.paidContentReviewSection;
        }
        if ((524288 & i3) != 0) {
            z16 = collectionDetailModel.isEagerReviewDisplayed;
        }
        if ((1048576 & i3) != 0) {
            z17 = collectionDetailModel.isStandardReviewDisplayed;
        }
        if ((2097152 & i3) != 0) {
            z18 = collectionDetailModel.replaceRatingWithCta;
        }
        if ((4194304 & i3) != 0) {
            priceInfo3 = collectionDetailModel.priceInfo;
        }
        if ((8388608 & i3) != 0) {
            priceInfo4 = collectionDetailModel.discountedPriceInfo;
        }
        if ((16777216 & i3) != 0) {
            z13 = collectionDetailModel.hasVoucher;
        }
        if ((33554432 & i3) != 0) {
            l2 = collectionDetailModel.voucherId;
        }
        if ((67108864 & i3) != 0) {
            voucherStatus2 = collectionDetailModel.voucherStatus;
        }
        if ((134217728 & i3) != 0) {
            str8 = collectionDetailModel.voucherTag;
        }
        if ((268435456 & i3) != 0) {
            str10 = collectionDetailModel.voucherDescription;
        }
        if ((536870912 & i3) != 0) {
            z10 = collectionDetailModel.voucherIsCountdown;
        }
        if ((1073741824 & i3) != 0) {
            j14 = collectionDetailModel.voucherExpireTimestamp;
        }
        if ((i3 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            i5 = collectionDetailModel.voucherUrgencyType;
        }
        if ((i4 & 1) != 0) {
            d2 = collectionDetailModel.videoCompletionThreshold;
        }
        if ((i4 & 2) != 0) {
            str9 = collectionDetailModel.webPaymentLink;
        }
        return collectionDetailModel.copy(j12, str6, str7, urlModel2, user2, j13, j11, j10, j9, j16, f2, i6, j15, z11, z12, z14, z15, list2, paidContentReviewSection2, z16, z17, z18, priceInfo3, priceInfo4, z13, l2, voucherStatus2, str8, str10, z10, j14, i5, d2, str9);
    }

    public final CollectionDetailModel copy(long j, String collectionName, String collectionDescription, UrlModel urlModel, User user, long j2, long j3, long j4, long j5, long j6, float f, int i, long j7, boolean z, boolean z2, boolean z3, boolean z4, List<PaidVideoItem> paidVideoList, PaidContentReviewSection paidContentReviewSection, boolean z5, boolean z6, boolean z7, PriceInfo priceInfo, PriceInfo priceInfo2, boolean z8, Long l, VoucherStatus voucherStatus, String str, String str2, boolean z9, long j8, int i2, Double d, String str3) {
        o.LJIIIZ(collectionName, "collectionName");
        o.LJIIIZ(collectionDescription, "collectionDescription");
        o.LJIIIZ(paidVideoList, "paidVideoList");
        o.LJIIIZ(voucherStatus, "voucherStatus");
        return new CollectionDetailModel(j, collectionName, collectionDescription, urlModel, user, j2, j3, j4, j5, j6, f, i, j7, z, z2, z3, z4, paidVideoList, paidContentReviewSection, z5, z6, z7, priceInfo, priceInfo2, z8, l, voucherStatus, str, str2, z9, j8, i2, d, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionDetailModel)) {
            return false;
        }
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) obj;
        return this.collectionId == collectionDetailModel.collectionId && o.LJ(this.collectionName, collectionDetailModel.collectionName) && o.LJ(this.collectionDescription, collectionDetailModel.collectionDescription) && o.LJ(this.collectionCover, collectionDetailModel.collectionCover) && o.LJ(this.collectionCreator, collectionDetailModel.collectionCreator) && this.collectionPublishTimestamp == collectionDetailModel.collectionPublishTimestamp && this.collectionCreateTimestamp == collectionDetailModel.collectionCreateTimestamp && this.collectionStatus == collectionDetailModel.collectionStatus && this.collectionSalesNum == collectionDetailModel.collectionSalesNum && this.collectionRatingNum == collectionDetailModel.collectionRatingNum && Float.compare(this.collectionRating, collectionDetailModel.collectionRating) == 0 && this.collectionVideoNum == collectionDetailModel.collectionVideoNum && this.collectionTotalDuration == collectionDetailModel.collectionTotalDuration && this.hasPurchasedCollection == collectionDetailModel.hasPurchasedCollection && this.canReviewCollection == collectionDetailModel.canReviewCollection && this.shouldPromptReview == collectionDetailModel.shouldPromptReview && this.canCollectionRefund == collectionDetailModel.canCollectionRefund && o.LJ(this.paidVideoList, collectionDetailModel.paidVideoList) && o.LJ(this.paidContentReviewSection, collectionDetailModel.paidContentReviewSection) && this.isEagerReviewDisplayed == collectionDetailModel.isEagerReviewDisplayed && this.isStandardReviewDisplayed == collectionDetailModel.isStandardReviewDisplayed && this.replaceRatingWithCta == collectionDetailModel.replaceRatingWithCta && o.LJ(this.priceInfo, collectionDetailModel.priceInfo) && o.LJ(this.discountedPriceInfo, collectionDetailModel.discountedPriceInfo) && this.hasVoucher == collectionDetailModel.hasVoucher && o.LJ(this.voucherId, collectionDetailModel.voucherId) && this.voucherStatus == collectionDetailModel.voucherStatus && o.LJ(this.voucherTag, collectionDetailModel.voucherTag) && o.LJ(this.voucherDescription, collectionDetailModel.voucherDescription) && this.voucherIsCountdown == collectionDetailModel.voucherIsCountdown && this.voucherExpireTimestamp == collectionDetailModel.voucherExpireTimestamp && this.voucherUrgencyType == collectionDetailModel.voucherUrgencyType && o.LJ(this.videoCompletionThreshold, collectionDetailModel.videoCompletionThreshold) && o.LJ(this.webPaymentLink, collectionDetailModel.webPaymentLink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int LJ = C79062V1e.LJ(this.collectionDescription, C79062V1e.LJ(this.collectionName, C16880lQ.LLJIJIL(this.collectionId) * 31, 31), 31);
        UrlModel urlModel = this.collectionCover;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        User user = this.collectionCreator;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.collectionTotalDuration, (C47959Irz.LIZIZ(this.collectionRating, JBR.LIZJ(this.collectionRatingNum, JBR.LIZJ(this.collectionSalesNum, JBR.LIZJ(this.collectionStatus, JBR.LIZJ(this.collectionCreateTimestamp, JBR.LIZJ(this.collectionPublishTimestamp, (i2 + hashCode2) * 31, 31), 31), 31), 31), 31), 31) + this.collectionVideoNum) * 31, 31);
        boolean z = this.hasPurchasedCollection;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (LIZJ + i4) * 31;
        boolean z2 = this.canReviewCollection;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z3 = this.shouldPromptReview;
        int i8 = z3;
        if (z3 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z4 = this.canCollectionRefund;
        int i10 = z4;
        if (z4 != 0) {
            i10 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.paidVideoList, (i9 + i10) * 31, 31);
        PaidContentReviewSection paidContentReviewSection = this.paidContentReviewSection;
        if (paidContentReviewSection == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = paidContentReviewSection.hashCode();
        }
        int i11 = (LIZIZ + hashCode3) * 31;
        boolean z5 = this.isEagerReviewDisplayed;
        int i12 = z5;
        if (z5 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z6 = this.isStandardReviewDisplayed;
        int i14 = z6;
        if (z6 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z7 = this.replaceRatingWithCta;
        int i16 = z7;
        if (z7 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        PriceInfo priceInfo = this.priceInfo;
        if (priceInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = priceInfo.hashCode();
        }
        int i18 = (i17 + hashCode4) * 31;
        PriceInfo priceInfo2 = this.discountedPriceInfo;
        if (priceInfo2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = priceInfo2.hashCode();
        }
        int i19 = (i18 + hashCode5) * 31;
        boolean z8 = this.hasVoucher;
        int i20 = z8;
        if (z8 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        Long l = this.voucherId;
        if (l == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l.hashCode();
        }
        int hashCode10 = (this.voucherStatus.hashCode() + ((i21 + hashCode6) * 31)) * 31;
        String str = this.voucherTag;
        if (str == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str.hashCode();
        }
        int i22 = (hashCode10 + hashCode7) * 31;
        String str2 = this.voucherDescription;
        if (str2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str2.hashCode();
        }
        int i23 = (i22 + hashCode8) * 31;
        if (!this.voucherIsCountdown) {
            i3 = 0;
        }
        int LIZJ2 = (JBR.LIZJ(this.voucherExpireTimestamp, (i23 + i3) * 31, 31) + this.voucherUrgencyType) * 31;
        Double d = this.videoCompletionThreshold;
        if (d == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = d.hashCode();
        }
        int i24 = (LIZJ2 + hashCode9) * 31;
        String str3 = this.webPaymentLink;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i24 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CollectionDetailModel(collectionId=");
        sb.append(this.collectionId);
        sb.append(", collectionName=");
        sb.append(this.collectionName);
        sb.append(", collectionDescription=");
        sb.append(this.collectionDescription);
        sb.append(", collectionCover=");
        sb.append(this.collectionCover);
        sb.append(", collectionCreator=");
        sb.append(this.collectionCreator);
        sb.append(", collectionPublishTimestamp=");
        sb.append(this.collectionPublishTimestamp);
        sb.append(", collectionCreateTimestamp=");
        sb.append(this.collectionCreateTimestamp);
        sb.append(", collectionStatus=");
        sb.append(this.collectionStatus);
        sb.append(", collectionSalesNum=");
        sb.append(this.collectionSalesNum);
        sb.append(", collectionRatingNum=");
        sb.append(this.collectionRatingNum);
        sb.append(", collectionRating=");
        sb.append(this.collectionRating);
        sb.append(", collectionVideoNum=");
        sb.append(this.collectionVideoNum);
        sb.append(", collectionTotalDuration=");
        sb.append(this.collectionTotalDuration);
        sb.append(", hasPurchasedCollection=");
        sb.append(this.hasPurchasedCollection);
        sb.append(", canReviewCollection=");
        sb.append(this.canReviewCollection);
        sb.append(", shouldPromptReview=");
        sb.append(this.shouldPromptReview);
        sb.append(", canCollectionRefund=");
        sb.append(this.canCollectionRefund);
        sb.append(", paidVideoList=");
        sb.append(this.paidVideoList);
        sb.append(", paidContentReviewSection=");
        sb.append(this.paidContentReviewSection);
        sb.append(", isEagerReviewDisplayed=");
        sb.append(this.isEagerReviewDisplayed);
        sb.append(", isStandardReviewDisplayed=");
        sb.append(this.isStandardReviewDisplayed);
        sb.append(", replaceRatingWithCta=");
        sb.append(this.replaceRatingWithCta);
        sb.append(", priceInfo=");
        sb.append(this.priceInfo);
        sb.append(", discountedPriceInfo=");
        sb.append(this.discountedPriceInfo);
        sb.append(", hasVoucher=");
        sb.append(this.hasVoucher);
        sb.append(", voucherId=");
        sb.append(this.voucherId);
        sb.append(", voucherStatus=");
        sb.append(this.voucherStatus);
        sb.append(", voucherTag=");
        sb.append(this.voucherTag);
        sb.append(", voucherDescription=");
        sb.append(this.voucherDescription);
        sb.append(", voucherIsCountdown=");
        sb.append(this.voucherIsCountdown);
        sb.append(", voucherExpireTimestamp=");
        sb.append(this.voucherExpireTimestamp);
        sb.append(", voucherUrgencyType=");
        sb.append(this.voucherUrgencyType);
        sb.append(", videoCompletionThreshold=");
        sb.append(this.videoCompletionThreshold);
        sb.append(", webPaymentLink=");
        return C07670Rv.LIZIZ(sb, this.webPaymentLink, ')');
    }

    public final boolean getCanCollectionRefund() {
        return this.canCollectionRefund;
    }

    public final boolean getCanReviewCollection() {
        return this.canReviewCollection;
    }

    public final UrlModel getCollectionCover() {
        return this.collectionCover;
    }

    public final long getCollectionCreateTimestamp() {
        return this.collectionCreateTimestamp;
    }

    public final User getCollectionCreator() {
        return this.collectionCreator;
    }

    public final String getCollectionDescription() {
        return this.collectionDescription;
    }

    public final long getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionName() {
        return this.collectionName;
    }

    public final long getCollectionPublishTimestamp() {
        return this.collectionPublishTimestamp;
    }

    public final float getCollectionRating() {
        return this.collectionRating;
    }

    public final long getCollectionRatingNum() {
        return this.collectionRatingNum;
    }

    public final long getCollectionSalesNum() {
        return this.collectionSalesNum;
    }

    public final long getCollectionStatus() {
        return this.collectionStatus;
    }

    public final long getCollectionTotalDuration() {
        return this.collectionTotalDuration;
    }

    public final int getCollectionVideoNum() {
        return this.collectionVideoNum;
    }

    public final PriceInfo getDiscountedPriceInfo() {
        return this.discountedPriceInfo;
    }

    public final boolean getHasPurchasedCollection() {
        return this.hasPurchasedCollection;
    }

    public final boolean getHasVoucher() {
        return this.hasVoucher;
    }

    public final PaidContentReviewSection getPaidContentReviewSection() {
        return this.paidContentReviewSection;
    }

    public final List<PaidVideoItem> getPaidVideoList() {
        return this.paidVideoList;
    }

    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public final boolean getReplaceRatingWithCta() {
        return this.replaceRatingWithCta;
    }

    public final boolean getShouldPromptReview() {
        return this.shouldPromptReview;
    }

    public final Double getVideoCompletionThreshold() {
        return this.videoCompletionThreshold;
    }

    public final String getVoucherDescription() {
        return this.voucherDescription;
    }

    public final long getVoucherExpireTimestamp() {
        return this.voucherExpireTimestamp;
    }

    public final Long getVoucherId() {
        return this.voucherId;
    }

    public final boolean getVoucherIsCountdown() {
        return this.voucherIsCountdown;
    }

    public final VoucherStatus getVoucherStatus() {
        return this.voucherStatus;
    }

    public final String getVoucherTag() {
        return this.voucherTag;
    }

    public final int getVoucherUrgencyType() {
        return this.voucherUrgencyType;
    }

    public final String getWebPaymentLink() {
        return this.webPaymentLink;
    }

    public final boolean isEagerReviewDisplayed() {
        return this.isEagerReviewDisplayed;
    }

    public final boolean isStandardReviewDisplayed() {
        return this.isStandardReviewDisplayed;
    }

    public CollectionDetailModel(long j, String collectionName, String collectionDescription, UrlModel urlModel, User user, long j2, long j3, long j4, long j5, long j6, float f, int i, long j7, boolean z, boolean z2, boolean z3, boolean z4, List<PaidVideoItem> paidVideoList, PaidContentReviewSection paidContentReviewSection, boolean z5, boolean z6, boolean z7, PriceInfo priceInfo, PriceInfo priceInfo2, boolean z8, Long l, VoucherStatus voucherStatus, String str, String str2, boolean z9, long j8, int i2, Double d, String str3) {
        o.LJIIIZ(collectionName, "collectionName");
        o.LJIIIZ(collectionDescription, "collectionDescription");
        o.LJIIIZ(paidVideoList, "paidVideoList");
        o.LJIIIZ(voucherStatus, "voucherStatus");
        this.collectionId = j;
        this.collectionName = collectionName;
        this.collectionDescription = collectionDescription;
        this.collectionCover = urlModel;
        this.collectionCreator = user;
        this.collectionPublishTimestamp = j2;
        this.collectionCreateTimestamp = j3;
        this.collectionStatus = j4;
        this.collectionSalesNum = j5;
        this.collectionRatingNum = j6;
        this.collectionRating = f;
        this.collectionVideoNum = i;
        this.collectionTotalDuration = j7;
        this.hasPurchasedCollection = z;
        this.canReviewCollection = z2;
        this.shouldPromptReview = z3;
        this.canCollectionRefund = z4;
        this.paidVideoList = paidVideoList;
        this.paidContentReviewSection = paidContentReviewSection;
        this.isEagerReviewDisplayed = z5;
        this.isStandardReviewDisplayed = z6;
        this.replaceRatingWithCta = z7;
        this.priceInfo = priceInfo;
        this.discountedPriceInfo = priceInfo2;
        this.hasVoucher = z8;
        this.voucherId = l;
        this.voucherStatus = voucherStatus;
        this.voucherTag = str;
        this.voucherDescription = str2;
        this.voucherIsCountdown = z9;
        this.voucherExpireTimestamp = j8;
        this.voucherUrgencyType = i2;
        this.videoCompletionThreshold = d;
        this.webPaymentLink = str3;
    }

    public /* synthetic */ CollectionDetailModel(long j, String str, String str2, UrlModel urlModel, User user, long j2, long j3, long j4, long j5, long j6, float f, int i, long j7, boolean z, boolean z2, boolean z3, boolean z4, List list, PaidContentReviewSection paidContentReviewSection, boolean z5, boolean z6, boolean z7, PriceInfo priceInfo, PriceInfo priceInfo2, boolean z8, Long l, VoucherStatus voucherStatus, String str3, String str4, boolean z9, long j8, int i2, Double d, String str5, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? null : urlModel, (i3 & 16) != 0 ? null : user, (i3 & 32) != 0 ? 0L : j2, (i3 & 64) != 0 ? 0L : j3, (i3 & 128) != 0 ? 0L : j4, (i3 & 256) != 0 ? 0L : j5, (i3 & 512) != 0 ? 0L : j6, (i3 & 1024) != 0 ? 0.0f : f, (i3 & 2048) != 0 ? 0 : i, (i3 & 4096) != 0 ? 0L : j7, (i3 & FileUtils.BUFFER_SIZE) != 0 ? false : z, (i3 & 16384) != 0 ? false : z2, (32768 & i3) != 0 ? false : z3, (65536 & i3) != 0 ? false : z4, (131072 & i3) != 0 ? new ArrayList() : list, (262144 & i3) != 0 ? null : paidContentReviewSection, (524288 & i3) != 0 ? false : z5, (1048576 & i3) != 0 ? false : z6, (2097152 & i3) != 0 ? false : z7, (4194304 & i3) != 0 ? null : priceInfo, (8388608 & i3) != 0 ? null : priceInfo2, (16777216 & i3) != 0 ? false : z8, (33554432 & i3) != 0 ? null : l, (67108864 & i3) != 0 ? VoucherStatus.UNKNOWN : voucherStatus, (134217728 & i3) != 0 ? "" : str3, (268435456 & i3) != 0 ? "" : str4, (536870912 & i3) != 0 ? false : z9, (1073741824 & i3) != 0 ? 0L : j8, (i3 & LiveLayoutPreloadThreadPriority.DEFAULT) == 0 ? i2 : 0, (i4 & 1) != 0 ? Double.valueOf(0.95d) : d, (i4 & 2) == 0 ? str5 : "");
    }
}

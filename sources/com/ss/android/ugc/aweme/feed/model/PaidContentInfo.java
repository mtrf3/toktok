package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentInfo implements Serializable {

    @InterfaceC65349Pkn("collection_name")
    public String collectionName = "";

    @InterfaceC65349Pkn("discounted_price")
    public PriceInfo discountedPrice;

    @InterfaceC65349Pkn("has_purchased")
    public boolean hasPurchased;

    @InterfaceC65349Pkn("paid_collection_id")
    public long paidCollectionId;

    @InterfaceC65349Pkn("resume_timestamp")
    public long paidContentResumeTimestamp;

    @InterfaceC65349Pkn("price")
    public PriceInfo price;

    @InterfaceC65349Pkn("should_show_preview")
    public boolean shouldShowPreview;

    @InterfaceC65349Pkn("voucher_id")
    public String voucherId;

    public final String getCollectionName() {
        return this.collectionName;
    }

    public final PriceInfo getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final boolean getHasPurchased() {
        return this.hasPurchased;
    }

    public final long getPaidCollectionId() {
        return this.paidCollectionId;
    }

    public final long getPaidContentResumeTimestamp() {
        return this.paidContentResumeTimestamp;
    }

    public final PriceInfo getPrice() {
        return this.price;
    }

    public final boolean getShouldShowPreview() {
        return this.shouldShowPreview;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final void setCollectionName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.collectionName = str;
    }

    public final void setDiscountedPrice(PriceInfo priceInfo) {
        this.discountedPrice = priceInfo;
    }

    public final void setHasPurchased(boolean z) {
        this.hasPurchased = z;
    }

    public final void setPaidCollectionId(long j) {
        this.paidCollectionId = j;
    }

    public final void setPaidContentResumeTimestamp(long j) {
        this.paidContentResumeTimestamp = j;
    }

    public final void setPrice(PriceInfo priceInfo) {
        this.price = priceInfo;
    }

    public final void setShouldShowPreview(boolean z) {
        this.shouldShowPreview = z;
    }

    public final void setVoucherId(String str) {
        this.voucherId = str;
    }
}

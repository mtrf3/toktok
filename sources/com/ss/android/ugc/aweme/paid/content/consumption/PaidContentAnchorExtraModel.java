package com.ss.android.ugc.aweme.paid.content.consumption;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentAnchorExtraModel {

    @InterfaceC65349Pkn("discounted_iap_id")
    public String discountedIapID;

    @InterfaceC65349Pkn("discounted_usd_price")
    public String discountedUSDPrice;

    @InterfaceC65349Pkn("iap_id")
    public String iapID;

    @InterfaceC65349Pkn("original_iap_id")
    public String originalIapID;

    @InterfaceC65349Pkn("original_usd_price")
    public String originalUSDPrice;

    @InterfaceC65349Pkn("post_title")
    public String postTitle;

    @InterfaceC65349Pkn("series_cover_url")
    public String seriesCoverImageUrl;

    @InterfaceC65349Pkn("subtitle")
    public String subtitle;

    @InterfaceC65349Pkn("voucher_tag")
    public String voucherTag;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidContentAnchorExtraModel)) {
            return false;
        }
        PaidContentAnchorExtraModel paidContentAnchorExtraModel = (PaidContentAnchorExtraModel) obj;
        return o.LJ(this.postTitle, paidContentAnchorExtraModel.postTitle) && o.LJ(this.subtitle, paidContentAnchorExtraModel.subtitle) && o.LJ(this.iapID, paidContentAnchorExtraModel.iapID) && o.LJ(this.originalIapID, paidContentAnchorExtraModel.originalIapID) && o.LJ(this.discountedIapID, paidContentAnchorExtraModel.discountedIapID) && o.LJ(this.voucherTag, paidContentAnchorExtraModel.voucherTag) && o.LJ(this.seriesCoverImageUrl, paidContentAnchorExtraModel.seriesCoverImageUrl) && o.LJ(this.originalUSDPrice, paidContentAnchorExtraModel.originalUSDPrice) && o.LJ(this.discountedUSDPrice, paidContentAnchorExtraModel.discountedUSDPrice);
    }

    public final int hashCode() {
        String str = this.postTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iapID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originalIapID;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discountedIapID;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.voucherTag;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.seriesCoverImageUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.originalUSDPrice;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.discountedUSDPrice;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentAnchorExtraModel(postTitle=");
        LIZ.append(this.postTitle);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", iapID=");
        LIZ.append(this.iapID);
        LIZ.append(", originalIapID=");
        LIZ.append(this.originalIapID);
        LIZ.append(", discountedIapID=");
        LIZ.append(this.discountedIapID);
        LIZ.append(", voucherTag=");
        LIZ.append(this.voucherTag);
        LIZ.append(", seriesCoverImageUrl=");
        LIZ.append(this.seriesCoverImageUrl);
        LIZ.append(", originalUSDPrice=");
        LIZ.append(this.originalUSDPrice);
        LIZ.append(", discountedUSDPrice=");
        return q.LIZIZ(LIZ, this.discountedUSDPrice, ')', LIZ);
    }

    public PaidContentAnchorExtraModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.postTitle = str;
        this.subtitle = str2;
        this.iapID = str3;
        this.originalIapID = str4;
        this.discountedIapID = str5;
        this.voucherTag = str6;
        this.seriesCoverImageUrl = str7;
        this.originalUSDPrice = str8;
        this.discountedUSDPrice = str9;
    }

    public /* synthetic */ PaidContentAnchorExtraModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}

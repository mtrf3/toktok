package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommonFeedData {

    @InterfaceC65349Pkn("add_to_cart_button_text")
    public final String addToCartButtonText;

    @InterfaceC65349Pkn("bundle_price_text")
    public final String bundlePriceText;

    @InterfaceC65349Pkn("feed_list")
    public final List<Feed> feedList;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("max_bundle_price")
    public final String maxBundlePrice;

    @InterfaceC65349Pkn("min_bundle_price")
    public final String minBundlePrice;

    @InterfaceC65349Pkn("next_cursor")
    public final int nextCursor;

    @InterfaceC65349Pkn("promotion_rich_text")
    public final LinkRichText promotion;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommonFeedData() {
        /*
            r14 = this;
            r1 = 0
            r8 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r0 = r14
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r9 = r8
            r10 = r1
            r11 = r1
            r13 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedData)) {
            return false;
        }
        CommonFeedData commonFeedData = (CommonFeedData) obj;
        return o.LJ(this.title, commonFeedData.title) && o.LJ(this.addToCartButtonText, commonFeedData.addToCartButtonText) && o.LJ(this.promotion, commonFeedData.promotion) && o.LJ(this.bundlePriceText, commonFeedData.bundlePriceText) && o.LJ(this.feedList, commonFeedData.feedList) && o.LJ(this.requestId, commonFeedData.requestId) && o.LJ(this.sessionId, commonFeedData.sessionId) && this.hasMore == commonFeedData.hasMore && this.nextCursor == commonFeedData.nextCursor && o.LJ(this.minBundlePrice, commonFeedData.minBundlePrice) && o.LJ(this.maxBundlePrice, commonFeedData.maxBundlePrice);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addToCartButtonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkRichText linkRichText = this.promotion;
        int hashCode3 = (hashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        String str3 = this.bundlePriceText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Feed> list = this.feedList;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.requestId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sessionId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode7 + i) * 31) + this.nextCursor) * 31;
        String str6 = this.minBundlePrice;
        int hashCode8 = (i2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.maxBundlePrice;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonFeedData(title=");
        sb.append(this.title);
        sb.append(", addToCartButtonText=");
        sb.append(this.addToCartButtonText);
        sb.append(", promotion=");
        sb.append(this.promotion);
        sb.append(", bundlePriceText=");
        sb.append(this.bundlePriceText);
        sb.append(", feedList=");
        sb.append(this.feedList);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", nextCursor=");
        sb.append(this.nextCursor);
        sb.append(", minBundlePrice=");
        sb.append(this.minBundlePrice);
        sb.append(", maxBundlePrice=");
        return C07670Rv.LIZIZ(sb, this.maxBundlePrice, ')');
    }

    public CommonFeedData(String str, String str2, LinkRichText linkRichText, String str3, List<Feed> list, String str4, String str5, boolean z, int i, String str6, String str7) {
        this.title = str;
        this.addToCartButtonText = str2;
        this.promotion = linkRichText;
        this.bundlePriceText = str3;
        this.feedList = list;
        this.requestId = str4;
        this.sessionId = str5;
        this.hasMore = z;
        this.nextCursor = i;
        this.minBundlePrice = str6;
        this.maxBundlePrice = str7;
    }

    public /* synthetic */ CommonFeedData(String str, String str2, LinkRichText linkRichText, String str3, List list, String str4, String str5, boolean z, int i, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : linkRichText, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? 1 : i, (i2 & 512) != 0 ? null : str6, (i2 & 1024) == 0 ? str7 : null);
    }
}

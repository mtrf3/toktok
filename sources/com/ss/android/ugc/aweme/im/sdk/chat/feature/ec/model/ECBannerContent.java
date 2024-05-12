package com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ECBannerContent {

    @InterfaceC65349Pkn("btn_text")
    public final String btnText;

    @InterfaceC65349Pkn("header")
    public final String header;

    @InterfaceC65349Pkn("jump_link")
    public final String jumpLink;

    @InterfaceC65349Pkn("order_id")
    public final Long orderId;

    @InterfaceC65349Pkn("product_info")
    public final ECBannerProductInfo productInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ECBannerContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECBannerContent)) {
            return false;
        }
        ECBannerContent eCBannerContent = (ECBannerContent) obj;
        return o.LJ(this.header, eCBannerContent.header) && o.LJ(this.btnText, eCBannerContent.btnText) && o.LJ(this.jumpLink, eCBannerContent.jumpLink) && o.LJ(this.orderId, eCBannerContent.orderId) && o.LJ(this.productInfo, eCBannerContent.productInfo);
    }

    public final int hashCode() {
        String str = this.header;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.btnText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jumpLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.orderId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        ECBannerProductInfo eCBannerProductInfo = this.productInfo;
        return hashCode4 + (eCBannerProductInfo != null ? eCBannerProductInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECBannerContent(header=");
        LIZ.append(this.header);
        LIZ.append(", btnText=");
        LIZ.append(this.btnText);
        LIZ.append(", jumpLink=");
        LIZ.append(this.jumpLink);
        LIZ.append(", orderId=");
        LIZ.append(this.orderId);
        LIZ.append(", productInfo=");
        LIZ.append(this.productInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ECBannerContent(String str, String str2, String str3, Long l, ECBannerProductInfo eCBannerProductInfo) {
        this.header = str;
        this.btnText = str2;
        this.jumpLink = str3;
        this.orderId = l;
        this.productInfo = eCBannerProductInfo;
    }

    public /* synthetic */ ECBannerContent(String str, String str2, String str3, Long l, ECBannerProductInfo eCBannerProductInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) == 0 ? eCBannerProductInfo : null);
    }
}

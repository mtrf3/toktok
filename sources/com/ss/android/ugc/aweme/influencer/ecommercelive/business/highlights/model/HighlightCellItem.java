package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HighlightCellItem implements Serializable {

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("extra")
    public final HighLightExtra highLightExtra;

    @InterfaceC65349Pkn("product_cover_url")
    public final String productCover;

    @InterfaceC65349Pkn("product_title")
    public final String productTitle;

    @InterfaceC65349Pkn("video_info")
    public final HighlightVideoInfo videoInfo;

    public static /* synthetic */ HighlightCellItem copy$default(HighlightCellItem highlightCellItem, String str, String str2, HighlightVideoInfo highlightVideoInfo, HighLightExtra highLightExtra, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightCellItem.productTitle;
        }
        if ((i & 2) != 0) {
            str2 = highlightCellItem.productCover;
        }
        if ((i & 4) != 0) {
            highlightVideoInfo = highlightCellItem.videoInfo;
        }
        if ((i & 8) != 0) {
            highLightExtra = highlightCellItem.highLightExtra;
        }
        if ((i & 16) != 0) {
            str3 = highlightCellItem.daInfo;
        }
        return highlightCellItem.copy(str, str2, highlightVideoInfo, highLightExtra, str3);
    }

    public final HighlightCellItem copy(String str, String str2, HighlightVideoInfo highlightVideoInfo, HighLightExtra highLightExtra, String str3) {
        return new HighlightCellItem(str, str2, highlightVideoInfo, highLightExtra, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightCellItem)) {
            return false;
        }
        HighlightCellItem highlightCellItem = (HighlightCellItem) obj;
        return o.LJ(this.productTitle, highlightCellItem.productTitle) && o.LJ(this.productCover, highlightCellItem.productCover) && o.LJ(this.videoInfo, highlightCellItem.videoInfo) && o.LJ(this.highLightExtra, highlightCellItem.highLightExtra) && o.LJ(this.daInfo, highlightCellItem.daInfo);
    }

    public int hashCode() {
        String str = this.productTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productCover;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HighlightVideoInfo highlightVideoInfo = this.videoInfo;
        int hashCode3 = (hashCode2 + (highlightVideoInfo == null ? 0 : highlightVideoInfo.hashCode())) * 31;
        HighLightExtra highLightExtra = this.highLightExtra;
        int hashCode4 = (hashCode3 + (highLightExtra == null ? 0 : highLightExtra.hashCode())) * 31;
        String str3 = this.daInfo;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightCellItem(productTitle=");
        LIZ.append(this.productTitle);
        LIZ.append(", productCover=");
        LIZ.append(this.productCover);
        LIZ.append(", videoInfo=");
        LIZ.append(this.videoInfo);
        LIZ.append(", highLightExtra=");
        LIZ.append(this.highLightExtra);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final HighLightExtra getHighLightExtra() {
        return this.highLightExtra;
    }

    public final String getProductCover() {
        return this.productCover;
    }

    public final String getProductTitle() {
        return this.productTitle;
    }

    public final HighlightVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public HighlightCellItem(String str, String str2, HighlightVideoInfo highlightVideoInfo, HighLightExtra highLightExtra, String str3) {
        this.productTitle = str;
        this.productCover = str2;
        this.videoInfo = highlightVideoInfo;
        this.highLightExtra = highLightExtra;
        this.daInfo = str3;
    }
}

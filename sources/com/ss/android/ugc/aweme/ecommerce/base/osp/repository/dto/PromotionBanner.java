package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromotionBanner {

    @InterfaceC65349Pkn("banner_text")
    public final String bannerText;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("link_schema")
    public final String linkSchema;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionBanner)) {
            return false;
        }
        PromotionBanner promotionBanner = (PromotionBanner) obj;
        return o.LJ(this.bannerText, promotionBanner.bannerText) && o.LJ(this.linkSchema, promotionBanner.linkSchema) && o.LJ(this.daInfo, promotionBanner.daInfo);
    }

    public final int hashCode() {
        String str = this.bannerText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkSchema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionBanner(bannerText=");
        LIZ.append(this.bannerText);
        LIZ.append(", linkSchema=");
        LIZ.append(this.linkSchema);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public PromotionBanner(String str, String str2, String str3) {
        this.bannerText = str;
        this.linkSchema = str2;
        this.daInfo = str3;
    }
}

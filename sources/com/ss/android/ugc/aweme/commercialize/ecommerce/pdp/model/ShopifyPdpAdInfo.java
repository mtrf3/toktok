package com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShopifyPdpAdInfo implements Serializable {

    @InterfaceC65349Pkn("creative_id")
    public final Long creativeId;

    @InterfaceC65349Pkn("is_ad")
    public final boolean isAd;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    public static /* synthetic */ ShopifyPdpAdInfo copy$default(ShopifyPdpAdInfo shopifyPdpAdInfo, boolean z, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shopifyPdpAdInfo.isAd;
        }
        if ((i & 2) != 0) {
            l = shopifyPdpAdInfo.creativeId;
        }
        if ((i & 4) != 0) {
            str = shopifyPdpAdInfo.logExtra;
        }
        return shopifyPdpAdInfo.copy(z, l, str);
    }

    public final ShopifyPdpAdInfo copy(boolean z, Long l, String str) {
        return new ShopifyPdpAdInfo(z, l, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopifyPdpAdInfo)) {
            return false;
        }
        ShopifyPdpAdInfo shopifyPdpAdInfo = (ShopifyPdpAdInfo) obj;
        return this.isAd == shopifyPdpAdInfo.isAd && o.LJ(this.creativeId, shopifyPdpAdInfo.creativeId) && o.LJ(this.logExtra, shopifyPdpAdInfo.logExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z = this.isAd;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Long l = this.creativeId;
        int hashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.logExtra;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopifyPdpAdInfo(isAd=");
        LIZ.append(this.isAd);
        LIZ.append(", creativeId=");
        LIZ.append(this.creativeId);
        LIZ.append(", logExtra=");
        return q.LIZIZ(LIZ, this.logExtra, ')', LIZ);
    }

    public final Long getCreativeId() {
        return this.creativeId;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final boolean isAd() {
        return this.isAd;
    }

    public ShopifyPdpAdInfo(boolean z, Long l, String str) {
        this.isAd = z;
        this.creativeId = l;
        this.logExtra = str;
    }
}

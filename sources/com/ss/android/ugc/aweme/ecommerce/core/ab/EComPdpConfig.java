package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EComPdpConfig {

    @InterfaceC65349Pkn("pdp_cache_timeout_config")
    public final int cacheTimeout;

    @InterfaceC65349Pkn("coupon_popup_bg_2x")
    public final String couponPopupBg2xUrl;

    @InterfaceC65349Pkn("coupon_popup_bg_3x")
    public final String couponPopupBg3xUrl;

    @InterfaceC65349Pkn("pdp_prefetch_cache_timeout_config")
    public final int prefetchTimeout;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EComPdpConfig)) {
            return false;
        }
        EComPdpConfig eComPdpConfig = (EComPdpConfig) obj;
        return this.cacheTimeout == eComPdpConfig.cacheTimeout && this.prefetchTimeout == eComPdpConfig.prefetchTimeout && o.LJ(this.couponPopupBg2xUrl, eComPdpConfig.couponPopupBg2xUrl) && o.LJ(this.couponPopupBg3xUrl, eComPdpConfig.couponPopupBg3xUrl);
    }

    public final int hashCode() {
        int i = ((this.cacheTimeout * 31) + this.prefetchTimeout) * 31;
        String str = this.couponPopupBg2xUrl;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.couponPopupBg3xUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EComPdpConfig(cacheTimeout=");
        LIZ.append(this.cacheTimeout);
        LIZ.append(", prefetchTimeout=");
        LIZ.append(this.prefetchTimeout);
        LIZ.append(", couponPopupBg2xUrl=");
        LIZ.append(this.couponPopupBg2xUrl);
        LIZ.append(", couponPopupBg3xUrl=");
        return q.LIZIZ(LIZ, this.couponPopupBg3xUrl, ')', LIZ);
    }

    public EComPdpConfig(int i, int i2, String str, String str2) {
        this.cacheTimeout = i;
        this.prefetchTimeout = i2;
        this.couponPopupBg2xUrl = str;
        this.couponPopupBg3xUrl = str2;
    }

    public /* synthetic */ EComPdpConfig(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2);
    }
}

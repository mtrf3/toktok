package com.ss.android.ugc.aweme.donation;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BannerStruct {

    @InterfaceC65349Pkn("banner_url")
    public final String bannerImageUrl;

    @InterfaceC65349Pkn("banner_schema_url")
    public final String bannerSiteUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerStruct)) {
            return false;
        }
        BannerStruct bannerStruct = (BannerStruct) obj;
        return o.LJ(this.bannerSiteUrl, bannerStruct.bannerSiteUrl) && o.LJ(this.bannerImageUrl, bannerStruct.bannerImageUrl);
    }

    public final int hashCode() {
        String str = this.bannerSiteUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bannerImageUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BannerStruct(bannerSiteUrl=");
        LIZ.append(this.bannerSiteUrl);
        LIZ.append(", bannerImageUrl=");
        return q.LIZIZ(LIZ, this.bannerImageUrl, ')', LIZ);
    }

    public BannerStruct(String str, String str2) {
        this.bannerSiteUrl = str;
        this.bannerImageUrl = str2;
    }
}

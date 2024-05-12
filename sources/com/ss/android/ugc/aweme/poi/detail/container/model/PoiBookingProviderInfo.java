package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiBookingProviderInfo implements Serializable {

    @InterfaceC65349Pkn("provider")
    public final Integer provider;

    @InterfaceC65349Pkn("url")
    public final String url;

    public static /* synthetic */ PoiBookingProviderInfo copy$default(PoiBookingProviderInfo poiBookingProviderInfo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = poiBookingProviderInfo.provider;
        }
        if ((i & 2) != 0) {
            str = poiBookingProviderInfo.url;
        }
        return poiBookingProviderInfo.copy(num, str);
    }

    public final PoiBookingProviderInfo copy(Integer num, String str) {
        return new PoiBookingProviderInfo(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiBookingProviderInfo)) {
            return false;
        }
        PoiBookingProviderInfo poiBookingProviderInfo = (PoiBookingProviderInfo) obj;
        return o.LJ(this.provider, poiBookingProviderInfo.provider) && o.LJ(this.url, poiBookingProviderInfo.url);
    }

    public int hashCode() {
        Integer num = this.provider;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiBookingProviderInfo(provider=");
        LIZ.append(this.provider);
        LIZ.append(", url=");
        return q.LIZIZ(LIZ, this.url, ')', LIZ);
    }

    public final Integer getProvider() {
        return this.provider;
    }

    public final String getUrl() {
        return this.url;
    }

    public PoiBookingProviderInfo(Integer num, String str) {
        this.provider = num;
        this.url = str;
    }
}

package com.ss.android.ugc.aweme.utils;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AttributionInfoData {

    @InterfaceC65349Pkn("ads_group_id")
    public final long adsGroupId;

    @InterfaceC65349Pkn("url")
    public final UrlData url;

    /* JADX WARN: Multi-variable type inference failed */
    public AttributionInfoData() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionInfoData)) {
            return false;
        }
        AttributionInfoData attributionInfoData = (AttributionInfoData) obj;
        return this.adsGroupId == attributionInfoData.adsGroupId && o.LJ(this.url, attributionInfoData.url);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.adsGroupId) * 31;
        UrlData urlData = this.url;
        return LLJIJIL + (urlData == null ? 0 : urlData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AttributionInfoData(adsGroupId=");
        LIZ.append(this.adsGroupId);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AttributionInfoData(long j, UrlData urlData) {
        this.adsGroupId = j;
        this.url = urlData;
    }

    public /* synthetic */ AttributionInfoData(long j, UrlData urlData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? null : urlData);
    }
}

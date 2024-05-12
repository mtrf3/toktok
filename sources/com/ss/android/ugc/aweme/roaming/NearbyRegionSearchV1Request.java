package com.ss.android.ugc.aweme.roaming;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NearbyRegionSearchV1Request {

    @InterfaceC65349Pkn("query")
    public final String query;

    @InterfaceC65349Pkn("region_code")
    public final String regionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyRegionSearchV1Request() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRegionSearchV1Request)) {
            return false;
        }
        NearbyRegionSearchV1Request nearbyRegionSearchV1Request = (NearbyRegionSearchV1Request) obj;
        return o.LJ(this.regionCode, nearbyRegionSearchV1Request.regionCode) && o.LJ(this.query, nearbyRegionSearchV1Request.query);
    }

    public final int hashCode() {
        String str = this.regionCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.query;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyRegionSearchV1Request(regionCode=");
        LIZ.append(this.regionCode);
        LIZ.append(", query=");
        return q.LIZIZ(LIZ, this.query, ')', LIZ);
    }

    public NearbyRegionSearchV1Request(String str, String str2) {
        this.regionCode = str;
        this.query = str2;
    }

    public /* synthetic */ NearbyRegionSearchV1Request(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

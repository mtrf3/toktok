package com.ss.android.ugc.aweme.roaming;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NearbyRegionListV1Request {

    @InterfaceC65349Pkn("encrypted_lat")
    public final String encryptedLat;

    @InterfaceC65349Pkn("encrypted_lng")
    public final String encryptedLng;

    @InterfaceC65349Pkn("is_gps_drift")
    public final boolean isGpsDrift;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRegionListV1Request)) {
            return false;
        }
        NearbyRegionListV1Request nearbyRegionListV1Request = (NearbyRegionListV1Request) obj;
        return o.LJ(this.encryptedLat, nearbyRegionListV1Request.encryptedLat) && o.LJ(this.encryptedLng, nearbyRegionListV1Request.encryptedLng) && this.isGpsDrift == nearbyRegionListV1Request.isGpsDrift;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.encryptedLat;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.encryptedLng;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isGpsDrift;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyRegionListV1Request(encryptedLat=");
        LIZ.append(this.encryptedLat);
        LIZ.append(", encryptedLng=");
        LIZ.append(this.encryptedLng);
        LIZ.append(", isGpsDrift=");
        return C48339Iy7.LIZJ(LIZ, this.isGpsDrift, ')', LIZ);
    }

    public NearbyRegionListV1Request(String str, String str2, boolean z) {
        this.encryptedLat = str;
        this.encryptedLng = str2;
        this.isGpsDrift = z;
    }

    public /* synthetic */ NearbyRegionListV1Request(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, z);
    }
}

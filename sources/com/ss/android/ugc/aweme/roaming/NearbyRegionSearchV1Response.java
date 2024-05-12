package com.ss.android.ugc.aweme.roaming;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NearbyRegionSearchV1Response extends BaseResponse {

    @InterfaceC65349Pkn("regions")
    public final List<LocationRegion> regions;

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyRegionSearchV1Response() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NearbyRegionSearchV1Response) && o.LJ(this.regions, ((NearbyRegionSearchV1Response) obj).regions);
    }

    public final int hashCode() {
        List<LocationRegion> list = this.regions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyRegionSearchV1Response(regions=");
        return C1NE.LIZIZ(LIZ, this.regions, ')', LIZ);
    }

    public NearbyRegionSearchV1Response(List<LocationRegion> list) {
        this.regions = list;
    }

    public /* synthetic */ NearbyRegionSearchV1Response(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

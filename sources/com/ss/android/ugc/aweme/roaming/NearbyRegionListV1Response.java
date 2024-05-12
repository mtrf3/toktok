package com.ss.android.ugc.aweme.roaming;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyRegionListV1Response extends BaseResponse {

    @InterfaceC65349Pkn("all_regions")
    public final List<LocationRegion> allRegions;

    @InterfaceC65349Pkn("current_region")
    public final LocationRegion currentRegion;

    @InterfaceC65349Pkn("current_region_l0_code")
    public final String currentRegionL0Code;

    @InterfaceC65349Pkn("current_region_l0_name")
    public final String currentRegionL0Name;

    @InterfaceC65349Pkn("current_region_source")
    public final String currentRegionSource;

    @InterfaceC65349Pkn("popular_regions")
    public final List<LocationRegion> popularRegions;

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyRegionListV1Response() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRegionListV1Response)) {
            return false;
        }
        NearbyRegionListV1Response nearbyRegionListV1Response = (NearbyRegionListV1Response) obj;
        return o.LJ(this.currentRegionSource, nearbyRegionListV1Response.currentRegionSource) && o.LJ(this.currentRegion, nearbyRegionListV1Response.currentRegion) && o.LJ(this.currentRegionL0Code, nearbyRegionListV1Response.currentRegionL0Code) && o.LJ(this.currentRegionL0Name, nearbyRegionListV1Response.currentRegionL0Name) && o.LJ(this.popularRegions, nearbyRegionListV1Response.popularRegions) && o.LJ(this.allRegions, nearbyRegionListV1Response.allRegions);
    }

    public final int hashCode() {
        String str = this.currentRegionSource;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocationRegion locationRegion = this.currentRegion;
        int hashCode2 = (hashCode + (locationRegion == null ? 0 : locationRegion.hashCode())) * 31;
        String str2 = this.currentRegionL0Code;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentRegionL0Name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<LocationRegion> list = this.popularRegions;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<LocationRegion> list2 = this.allRegions;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyRegionListV1Response(currentRegionSource=");
        LIZ.append(this.currentRegionSource);
        LIZ.append(", currentRegion=");
        LIZ.append(this.currentRegion);
        LIZ.append(", currentRegionL0Code=");
        LIZ.append(this.currentRegionL0Code);
        LIZ.append(", currentRegionL0Name=");
        LIZ.append(this.currentRegionL0Name);
        LIZ.append(", popularRegions=");
        LIZ.append(this.popularRegions);
        LIZ.append(", allRegions=");
        return C1NE.LIZIZ(LIZ, this.allRegions, ')', LIZ);
    }

    public NearbyRegionListV1Response(String str, LocationRegion locationRegion, String str2, String str3, List<LocationRegion> list, List<LocationRegion> list2) {
        this.currentRegionSource = str;
        this.currentRegion = locationRegion;
        this.currentRegionL0Code = str2;
        this.currentRegionL0Name = str3;
        this.popularRegions = list;
        this.allRegions = list2;
    }

    public /* synthetic */ NearbyRegionListV1Response(String str, LocationRegion locationRegion, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : locationRegion, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) == 0 ? list2 : null);
    }
}

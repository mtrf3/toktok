package com.ss.android.ugc.aweme.placediscovery2.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.M3A;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiscoverMapResponse implements Serializable {
    public M3A LJLIL;

    @InterfaceC65349Pkn("biz_code")
    public final int bizCode;

    @InterfaceC65349Pkn("biz_msg")
    public final String bizMsg;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("in_nearby_tab_city")
    public final boolean isInNearbyCity;

    @InterfaceC65349Pkn("in_poi_region")
    public final boolean isInPoiRegion;

    @InterfaceC65349Pkn("log_pb")
    public final LogPb logPb;

    @InterfaceC65349Pkn("map_city_name")
    public String mapCityName;

    @InterfaceC65349Pkn("dynamic_map_window")
    public final MapBounds mapWindow;

    @InterfaceC65349Pkn("poi_list")
    public List<DiscoveryPoi> poiList;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public DiscoverMapResponse() {
        this(false, false, 0, null, null, 0, null, null, null, false, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverMapResponse copy$default(DiscoverMapResponse discoverMapResponse, boolean z, boolean z2, int i, LogPb logPb, String str, int i2, String str2, MapBounds mapBounds, List list, boolean z3, String str3, M3A m3a, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = discoverMapResponse.isInNearbyCity;
        }
        if ((i3 & 2) != 0) {
            z2 = discoverMapResponse.isInPoiRegion;
        }
        if ((i3 & 4) != 0) {
            i = discoverMapResponse.bizCode;
        }
        if ((i3 & 8) != 0) {
            logPb = discoverMapResponse.logPb;
        }
        if ((i3 & 16) != 0) {
            str = discoverMapResponse.bizMsg;
        }
        if ((i3 & 32) != 0) {
            i2 = discoverMapResponse.statusCode;
        }
        if ((i3 & 64) != 0) {
            str2 = discoverMapResponse.statusMsg;
        }
        if ((i3 & 128) != 0) {
            mapBounds = discoverMapResponse.mapWindow;
        }
        if ((i3 & 256) != 0) {
            list = discoverMapResponse.poiList;
        }
        if ((i3 & 512) != 0) {
            z3 = discoverMapResponse.hasMore;
        }
        if ((i3 & 1024) != 0) {
            str3 = discoverMapResponse.mapCityName;
        }
        if ((i3 & 2048) != 0) {
            m3a = discoverMapResponse.LJLIL;
        }
        return discoverMapResponse.copy(z, z2, i, logPb, str, i2, str2, mapBounds, list, z3, str3, m3a);
    }

    public final DiscoverMapResponse copy(boolean z, boolean z2, int i, LogPb logPb, String str, int i2, String str2, MapBounds mapBounds, List<DiscoveryPoi> poiList, boolean z3, String str3, M3A m3a) {
        o.LJIIIZ(poiList, "poiList");
        return new DiscoverMapResponse(z, z2, i, logPb, str, i2, str2, mapBounds, poiList, z3, str3, m3a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverMapResponse)) {
            return false;
        }
        DiscoverMapResponse discoverMapResponse = (DiscoverMapResponse) obj;
        return this.isInNearbyCity == discoverMapResponse.isInNearbyCity && this.isInPoiRegion == discoverMapResponse.isInPoiRegion && this.bizCode == discoverMapResponse.bizCode && o.LJ(this.logPb, discoverMapResponse.logPb) && o.LJ(this.bizMsg, discoverMapResponse.bizMsg) && this.statusCode == discoverMapResponse.statusCode && o.LJ(this.statusMsg, discoverMapResponse.statusMsg) && o.LJ(this.mapWindow, discoverMapResponse.mapWindow) && o.LJ(this.poiList, discoverMapResponse.poiList) && this.hasMore == discoverMapResponse.hasMore && o.LJ(this.mapCityName, discoverMapResponse.mapCityName) && this.LJLIL == discoverMapResponse.LJLIL;
    }

    public String toString() {
        return "DiscoverMapResponse(isInNearbyCity=" + this.isInNearbyCity + ", isInPoiRegion=" + this.isInPoiRegion + ", bizCode=" + this.bizCode + ", logPb=" + this.logPb + ", bizMsg=" + this.bizMsg + ", statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", mapWindow=" + this.mapWindow + ", poiList=" + this.poiList + ", hasMore=" + this.hasMore + ", mapCityName=" + this.mapCityName + ", requestKey=" + this.LJLIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        boolean z = this.isInNearbyCity;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r02 = this.isInPoiRegion;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + this.bizCode) * 31;
        LogPb logPb = this.logPb;
        int i5 = 0;
        if (logPb == null) {
            hashCode = 0;
        } else {
            hashCode = logPb.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        String str = this.bizMsg;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i7 = (((i6 + hashCode2) * 31) + this.statusCode) * 31;
        String str2 = this.statusMsg;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        MapBounds mapBounds = this.mapWindow;
        if (mapBounds == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = mapBounds.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.poiList, (i8 + hashCode4) * 31, 31);
        if (!this.hasMore) {
            i = 0;
        }
        int i9 = (LIZIZ + i) * 31;
        String str3 = this.mapCityName;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i10 = (i9 + hashCode5) * 31;
        M3A m3a = this.LJLIL;
        if (m3a != null) {
            i5 = m3a.hashCode();
        }
        return i10 + i5;
    }

    public final int getBizCode() {
        return this.bizCode;
    }

    public final String getBizMsg() {
        return this.bizMsg;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public final String getMapCityName() {
        return this.mapCityName;
    }

    public final MapBounds getMapWindow() {
        return this.mapWindow;
    }

    public final List<DiscoveryPoi> getPoiList() {
        return this.poiList;
    }

    public final M3A getRequestKey() {
        return this.LJLIL;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final boolean isInNearbyCity() {
        return this.isInNearbyCity;
    }

    public final boolean isInPoiRegion() {
        return this.isInPoiRegion;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMapCityName(String str) {
        this.mapCityName = str;
    }

    public final void setPoiList(List<DiscoveryPoi> list) {
        o.LJIIIZ(list, "<set-?>");
        this.poiList = list;
    }

    public final void setRequestKey(M3A m3a) {
        this.LJLIL = m3a;
    }

    public DiscoverMapResponse(boolean z, boolean z2, int i, LogPb logPb, String str, int i2, String str2, MapBounds mapBounds, List<DiscoveryPoi> poiList, boolean z3, String str3, M3A m3a) {
        o.LJIIIZ(poiList, "poiList");
        this.isInNearbyCity = z;
        this.isInPoiRegion = z2;
        this.bizCode = i;
        this.logPb = logPb;
        this.bizMsg = str;
        this.statusCode = i2;
        this.statusMsg = str2;
        this.mapWindow = mapBounds;
        this.poiList = poiList;
        this.hasMore = z3;
        this.mapCityName = str3;
        this.LJLIL = m3a;
    }

    public DiscoverMapResponse(boolean z, boolean z2, int i, LogPb logPb, String str, int i2, String str2, MapBounds mapBounds, List list, boolean z3, String str3, M3A m3a, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : logPb, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : mapBounds, (i3 & 256) != 0 ? C61878OQg.INSTANCE : list, (i3 & 512) == 0 ? z3 : false, (i3 & 1024) != 0 ? null : str3, (i3 & 2048) == 0 ? m3a : null);
    }
}

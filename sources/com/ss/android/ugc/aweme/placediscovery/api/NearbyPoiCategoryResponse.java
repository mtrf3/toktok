package com.ss.android.ugc.aweme.placediscovery.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyPoiCategoryResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("current_region")
    public final LocationRegion currentRegion;

    @InterfaceC65349Pkn("poi_category_list")
    public final List<PoiCategory> poiCategoryList;

    @InterfaceC65349Pkn("select_tab_code")
    public final String selectTabCode;

    @InterfaceC65349Pkn("tab_region")
    public final String tabRegion;

    @InterfaceC65349Pkn("tab_region_dynamic_map_window")
    public final MapBounds tabRegionMapWindow;

    @InterfaceC65349Pkn("tab_region_name")
    public final String tabRegionName;

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyPoiCategoryResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NearbyPoiCategoryResponse copy$default(NearbyPoiCategoryResponse nearbyPoiCategoryResponse, String str, String str2, LocationRegion locationRegion, List list, MapBounds mapBounds, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nearbyPoiCategoryResponse.tabRegionName;
        }
        if ((i & 2) != 0) {
            str2 = nearbyPoiCategoryResponse.tabRegion;
        }
        if ((i & 4) != 0) {
            locationRegion = nearbyPoiCategoryResponse.currentRegion;
        }
        if ((i & 8) != 0) {
            list = nearbyPoiCategoryResponse.poiCategoryList;
        }
        if ((i & 16) != 0) {
            mapBounds = nearbyPoiCategoryResponse.tabRegionMapWindow;
        }
        if ((i & 32) != 0) {
            str3 = nearbyPoiCategoryResponse.selectTabCode;
        }
        return nearbyPoiCategoryResponse.copy(str, str2, locationRegion, list, mapBounds, str3);
    }

    public final NearbyPoiCategoryResponse copy(String str, String str2, LocationRegion locationRegion, List<PoiCategory> list, MapBounds mapBounds, String str3) {
        return new NearbyPoiCategoryResponse(str, str2, locationRegion, list, mapBounds, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPoiCategoryResponse)) {
            return false;
        }
        NearbyPoiCategoryResponse nearbyPoiCategoryResponse = (NearbyPoiCategoryResponse) obj;
        return o.LJ(this.tabRegionName, nearbyPoiCategoryResponse.tabRegionName) && o.LJ(this.tabRegion, nearbyPoiCategoryResponse.tabRegion) && o.LJ(this.currentRegion, nearbyPoiCategoryResponse.currentRegion) && o.LJ(this.poiCategoryList, nearbyPoiCategoryResponse.poiCategoryList) && o.LJ(this.tabRegionMapWindow, nearbyPoiCategoryResponse.tabRegionMapWindow) && o.LJ(this.selectTabCode, nearbyPoiCategoryResponse.selectTabCode);
    }

    public int hashCode() {
        String str = this.tabRegionName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabRegion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocationRegion locationRegion = this.currentRegion;
        int hashCode3 = (hashCode2 + (locationRegion == null ? 0 : locationRegion.hashCode())) * 31;
        List<PoiCategory> list = this.poiCategoryList;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        MapBounds mapBounds = this.tabRegionMapWindow;
        int hashCode5 = (hashCode4 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        String str3 = this.selectTabCode;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyPoiCategoryResponse(tabRegionName=");
        LIZ.append(this.tabRegionName);
        LIZ.append(", tabRegion=");
        LIZ.append(this.tabRegion);
        LIZ.append(", currentRegion=");
        LIZ.append(this.currentRegion);
        LIZ.append(", poiCategoryList=");
        LIZ.append(this.poiCategoryList);
        LIZ.append(", tabRegionMapWindow=");
        LIZ.append(this.tabRegionMapWindow);
        LIZ.append(", selectTabCode=");
        return q.LIZIZ(LIZ, this.selectTabCode, ')', LIZ);
    }

    public final LocationRegion getCurrentRegion() {
        return this.currentRegion;
    }

    public final List<PoiCategory> getPoiCategoryList() {
        return this.poiCategoryList;
    }

    public final String getSelectTabCode() {
        return this.selectTabCode;
    }

    public final String getTabRegion() {
        return this.tabRegion;
    }

    public final MapBounds getTabRegionMapWindow() {
        return this.tabRegionMapWindow;
    }

    public final String getTabRegionName() {
        return this.tabRegionName;
    }

    public NearbyPoiCategoryResponse(String str, String str2, LocationRegion locationRegion, List<PoiCategory> list, MapBounds mapBounds, String str3) {
        this.tabRegionName = str;
        this.tabRegion = str2;
        this.currentRegion = locationRegion;
        this.poiCategoryList = list;
        this.tabRegionMapWindow = mapBounds;
        this.selectTabCode = str3;
    }

    public /* synthetic */ NearbyPoiCategoryResponse(String str, String str2, LocationRegion locationRegion, List list, MapBounds mapBounds, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : locationRegion, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : mapBounds, (i & 32) == 0 ? str3 : null);
    }
}

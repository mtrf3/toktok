package com.ss.android.ugc.aweme.placediscovery.param;

import X.EnumC54647LcZ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PoiDiscoveryLandingPageParams implements Serializable {

    @InterfaceC65349Pkn("current_region")
    public final LocationRegion currentRegion;
    public final EnumC54647LcZ discoveryScenario;

    @InterfaceC65349Pkn("poi_category_list")
    public final List<PoiCategory> poiCategoryList;

    @InterfaceC65349Pkn("poi_id")
    public final String poiID;

    @InterfaceC65349Pkn("region_name")
    public final String regionName;

    @InterfaceC65349Pkn("select_tab_code")
    public final String selectTabCode;

    @InterfaceC65349Pkn("tab_region")
    public final String tabRegion;

    @InterfaceC65349Pkn("tab_region_dynamic_map_window")
    public final MapBounds tabRegionMapWindow;

    @InterfaceC65349Pkn("tab_region_name")
    public final String tabRegionName;
    public final String tabSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PoiDiscoveryLandingPageParams copy$default(PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams, String str, String str2, LocationRegion locationRegion, List list, MapBounds mapBounds, String str3, String str4, String str5, String str6, EnumC54647LcZ enumC54647LcZ, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiDiscoveryLandingPageParams.tabRegionName;
        }
        if ((i & 2) != 0) {
            str2 = poiDiscoveryLandingPageParams.tabRegion;
        }
        if ((i & 4) != 0) {
            locationRegion = poiDiscoveryLandingPageParams.currentRegion;
        }
        if ((i & 8) != 0) {
            list = poiDiscoveryLandingPageParams.poiCategoryList;
        }
        if ((i & 16) != 0) {
            mapBounds = poiDiscoveryLandingPageParams.tabRegionMapWindow;
        }
        if ((i & 32) != 0) {
            str3 = poiDiscoveryLandingPageParams.selectTabCode;
        }
        if ((i & 64) != 0) {
            str4 = poiDiscoveryLandingPageParams.regionName;
        }
        if ((i & 128) != 0) {
            str5 = poiDiscoveryLandingPageParams.poiID;
        }
        if ((i & 256) != 0) {
            str6 = poiDiscoveryLandingPageParams.tabSchema;
        }
        if ((i & 512) != 0) {
            enumC54647LcZ = poiDiscoveryLandingPageParams.discoveryScenario;
        }
        return poiDiscoveryLandingPageParams.copy(str, str2, locationRegion, list, mapBounds, str3, str4, str5, str6, enumC54647LcZ);
    }

    public final PoiDiscoveryLandingPageParams copy(String str, String str2, LocationRegion locationRegion, List<PoiCategory> list, MapBounds mapBounds, String str3, String str4, String str5, String str6, EnumC54647LcZ discoveryScenario) {
        o.LJIIIZ(discoveryScenario, "discoveryScenario");
        return new PoiDiscoveryLandingPageParams(str, str2, locationRegion, list, mapBounds, str3, str4, str5, str6, discoveryScenario);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDiscoveryLandingPageParams)) {
            return false;
        }
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams = (PoiDiscoveryLandingPageParams) obj;
        return o.LJ(this.tabRegionName, poiDiscoveryLandingPageParams.tabRegionName) && o.LJ(this.tabRegion, poiDiscoveryLandingPageParams.tabRegion) && o.LJ(this.currentRegion, poiDiscoveryLandingPageParams.currentRegion) && o.LJ(this.poiCategoryList, poiDiscoveryLandingPageParams.poiCategoryList) && o.LJ(this.tabRegionMapWindow, poiDiscoveryLandingPageParams.tabRegionMapWindow) && o.LJ(this.selectTabCode, poiDiscoveryLandingPageParams.selectTabCode) && o.LJ(this.regionName, poiDiscoveryLandingPageParams.regionName) && o.LJ(this.poiID, poiDiscoveryLandingPageParams.poiID) && o.LJ(this.tabSchema, poiDiscoveryLandingPageParams.tabSchema) && this.discoveryScenario == poiDiscoveryLandingPageParams.discoveryScenario;
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
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.regionName;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.poiID;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tabSchema;
        return this.discoveryScenario.hashCode() + ((hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiDiscoveryLandingPageParams(tabRegionName=");
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
        LIZ.append(this.selectTabCode);
        LIZ.append(", regionName=");
        LIZ.append(this.regionName);
        LIZ.append(", poiID=");
        LIZ.append(this.poiID);
        LIZ.append(", tabSchema=");
        LIZ.append(this.tabSchema);
        LIZ.append(", discoveryScenario=");
        LIZ.append(this.discoveryScenario);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LocationRegion getCurrentRegion() {
        return this.currentRegion;
    }

    public final EnumC54647LcZ getDiscoveryScenario() {
        return this.discoveryScenario;
    }

    public final List<PoiCategory> getPoiCategoryList() {
        return this.poiCategoryList;
    }

    public final String getPoiID() {
        return this.poiID;
    }

    public final String getRegionName() {
        return this.regionName;
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

    public final String getTabSchema() {
        return this.tabSchema;
    }

    public PoiDiscoveryLandingPageParams(String str, String str2, LocationRegion locationRegion, List<PoiCategory> list, MapBounds mapBounds, String str3, String str4, String str5, String str6, EnumC54647LcZ discoveryScenario) {
        o.LJIIIZ(discoveryScenario, "discoveryScenario");
        this.tabRegionName = str;
        this.tabRegion = str2;
        this.currentRegion = locationRegion;
        this.poiCategoryList = list;
        this.tabRegionMapWindow = mapBounds;
        this.selectTabCode = str3;
        this.regionName = str4;
        this.poiID = str5;
        this.tabSchema = str6;
        this.discoveryScenario = discoveryScenario;
    }

    public /* synthetic */ PoiDiscoveryLandingPageParams(String str, String str2, LocationRegion locationRegion, List list, MapBounds mapBounds, String str3, String str4, String str5, String str6, EnumC54647LcZ enumC54647LcZ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : locationRegion, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : mapBounds, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null, enumC54647LcZ);
    }
}

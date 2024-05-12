package com.ss.android.ugc.aweme.poi.map.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DynamicMapParams implements Serializable {

    @InterfaceC65349Pkn("default_zoom_level")
    public final Integer defaultZoomLevel;

    @InterfaceC65349Pkn("enable_dynamic_map")
    public final Boolean enableDynamicMap;

    @InterfaceC65349Pkn("lat_max")
    public final Double latMax;

    @InterfaceC65349Pkn("lat_min")
    public final Double latMin;

    @InterfaceC65349Pkn("lng_max")
    public final Double lngMax;

    @InterfaceC65349Pkn("lng_min")
    public final Double lngMin;

    public static /* synthetic */ DynamicMapParams copy$default(DynamicMapParams dynamicMapParams, Boolean bool, Integer num, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = dynamicMapParams.enableDynamicMap;
        }
        if ((i & 2) != 0) {
            num = dynamicMapParams.defaultZoomLevel;
        }
        if ((i & 4) != 0) {
            d = dynamicMapParams.latMax;
        }
        if ((i & 8) != 0) {
            d2 = dynamicMapParams.latMin;
        }
        if ((i & 16) != 0) {
            d3 = dynamicMapParams.lngMax;
        }
        if ((i & 32) != 0) {
            d4 = dynamicMapParams.lngMin;
        }
        return dynamicMapParams.copy(bool, num, d, d2, d3, d4);
    }

    public final DynamicMapParams copy(Boolean bool, Integer num, Double d, Double d2, Double d3, Double d4) {
        return new DynamicMapParams(bool, num, d, d2, d3, d4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicMapParams)) {
            return false;
        }
        DynamicMapParams dynamicMapParams = (DynamicMapParams) obj;
        return o.LJ(this.enableDynamicMap, dynamicMapParams.enableDynamicMap) && o.LJ(this.defaultZoomLevel, dynamicMapParams.defaultZoomLevel) && o.LJ(this.latMax, dynamicMapParams.latMax) && o.LJ(this.latMin, dynamicMapParams.latMin) && o.LJ(this.lngMax, dynamicMapParams.lngMax) && o.LJ(this.lngMin, dynamicMapParams.lngMin);
    }

    public int hashCode() {
        Boolean bool = this.enableDynamicMap;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.defaultZoomLevel;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.latMax;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.latMin;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.lngMax;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.lngMin;
        return hashCode5 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicMapParams(enableDynamicMap=");
        LIZ.append(this.enableDynamicMap);
        LIZ.append(", defaultZoomLevel=");
        LIZ.append(this.defaultZoomLevel);
        LIZ.append(", latMax=");
        LIZ.append(this.latMax);
        LIZ.append(", latMin=");
        LIZ.append(this.latMin);
        LIZ.append(", lngMax=");
        LIZ.append(this.lngMax);
        LIZ.append(", lngMin=");
        LIZ.append(this.lngMin);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Integer getDefaultZoomLevel() {
        return this.defaultZoomLevel;
    }

    public final Boolean getEnableDynamicMap() {
        return this.enableDynamicMap;
    }

    public final Double getLatMax() {
        return this.latMax;
    }

    public final Double getLatMin() {
        return this.latMin;
    }

    public final Double getLngMax() {
        return this.lngMax;
    }

    public final Double getLngMin() {
        return this.lngMin;
    }

    public DynamicMapParams(Boolean bool, Integer num, Double d, Double d2, Double d3, Double d4) {
        this.enableDynamicMap = bool;
        this.defaultZoomLevel = num;
        this.latMax = d;
        this.latMin = d2;
        this.lngMax = d3;
        this.lngMin = d4;
    }
}

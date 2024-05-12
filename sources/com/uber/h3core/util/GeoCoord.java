package com.uber.h3core.util;

import X.C16880lQ;
import java.util.Objects;

/* loaded from: classes24.dex */
public class GeoCoord {
    public final double lat;
    public final double lng;

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.lat), Double.valueOf(this.lng));
    }

    public String toString() {
        return C16880lQ.LLLZ("GeoCoord{lat=%f, lng=%f}", new Object[]{Double.valueOf(this.lat), Double.valueOf(this.lng)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeoCoord geoCoord = (GeoCoord) obj;
        if (Double.compare(geoCoord.lat, this.lat) == 0 && Double.compare(geoCoord.lng, this.lng) == 0) {
            return true;
        }
        return false;
    }

    public GeoCoord(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }
}

package com.ss.android.ugc.aweme.placediscovery2.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class Location implements Serializable {

    @InterfaceC65349Pkn("lat")
    public double lat;

    @InterfaceC65349Pkn("lng")
    public Double lng;

    /* JADX WARN: Multi-variable type inference failed */
    public Location() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Location copy$default(Location location, double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = location.lat;
        }
        if ((i & 2) != 0) {
            d2 = location.lng;
        }
        return location.copy(d, d2);
    }

    public final Location copy(double d, Double d2) {
        return new Location(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Double.compare(this.lat, location.lat) == 0 && o.LJ(this.lng, location.lng);
    }

    public int hashCode() {
        int LLJI = C16880lQ.LLJI(this.lat) * 31;
        Double d = this.lng;
        return LLJI + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Location(lat=");
        LIZ.append(this.lat);
        LIZ.append(", lng=");
        LIZ.append(this.lng);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final double getLat() {
        return this.lat;
    }

    public final Double getLng() {
        return this.lng;
    }

    public final void setLat(double d) {
        this.lat = d;
    }

    public final void setLng(Double d) {
        this.lng = d;
    }

    public Location(double d, Double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public /* synthetic */ Location(double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) : d2);
    }
}

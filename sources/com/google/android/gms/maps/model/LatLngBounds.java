package com.google.android.gms.maps.model;

import X.C16880lQ;
import X.C64362PNu;
import X.C68784Qz6;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C68784Qz6();
    public final LatLng northeast;
    public final LatLng southwest;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.southwest, "southwest");
        c64362PNu.LIZ(this.northeast, "northeast");
        return c64362PNu.toString();
    }

    public final boolean LJJJJL(LatLng latLng) {
        QH7.LJIIIZ(latLng, "point must not be null.");
        double d = latLng.latitude;
        LatLng latLng2 = this.southwest;
        if (latLng2.latitude <= d) {
            LatLng latLng3 = this.northeast;
            if (d <= latLng3.latitude) {
                double d2 = latLng.longitude;
                double d3 = latLng2.longitude;
                double d4 = latLng3.longitude;
                if (d3 > d4 ? d3 <= d2 || d2 <= d4 : d3 <= d2 && d2 <= d4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast)) {
            return true;
        }
        return false;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        boolean z;
        QH7.LJIIIZ(latLng, "southwest must not be null.");
        QH7.LJIIIZ(latLng2, "northeast must not be null.");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(latLng2.latitude)};
        if (z) {
            this.southwest = latLng;
            this.northeast = latLng2;
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("southern latitude exceeds northern latitude (%s > %s)", objArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.southwest, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.northeast, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}

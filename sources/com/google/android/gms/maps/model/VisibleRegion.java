package com.google.android.gms.maps.model;

import X.C64362PNu;
import X.C68788QzA;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C68788QzA();
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.nearLeft, "nearLeft");
        c64362PNu.LIZ(this.nearRight, "nearRight");
        c64362PNu.LIZ(this.farLeft, "farLeft");
        c64362PNu.LIZ(this.farRight, "farRight");
        c64362PNu.LIZ(this.latLngBounds, "latLngBounds");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.nearLeft, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.nearRight, i, false);
        C79057V0z.LJJZZI(parcel, 4, this.farLeft, i, false);
        C79057V0z.LJJZZI(parcel, 5, this.farRight, i, false);
        C79057V0z.LJJZZI(parcel, 6, this.latLngBounds, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }
}

package com.google.android.gms.maps.model;

import X.C64362PNu;
import X.C68786Qz8;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new C68786Qz8();
    public final StreetViewPanoramaLink[] links;
    public final String panoId;
    public final LatLng position;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.position, this.panoId});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.panoId, "panoId");
        c64362PNu.LIZ(this.position.toString(), "position");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        if (this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLIIIL(parcel, 2, this.links, i);
        C79057V0z.LJJZZI(parcel, 3, this.position, i, false);
        C79057V0z.LJJZZIII(parcel, 4, this.panoId, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }
}

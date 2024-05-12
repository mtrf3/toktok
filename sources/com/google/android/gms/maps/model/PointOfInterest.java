package com.google.android.gms.maps.model;

import X.C79057V0z;
import X.R0X;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new R0X();
    public final LatLng latLng;
    public final String name;
    public final String placeId;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.latLng, i, false);
        C79057V0z.LJJZZIII(parcel, 3, this.placeId, false);
        C79057V0z.LJJZZIII(parcel, 4, this.name, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C27428Apc;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LocateDistrictRequest implements Parcelable {
    public static final Parcelable.Creator<LocateDistrictRequest> CREATOR = new C27428Apc();

    @InterfaceC65349Pkn("encrypted_latitude")
    public final String encryptedLatitude;

    @InterfaceC65349Pkn("encrypted_longitude")
    public final String encryptedLongitude;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocateDistrictRequest)) {
            return false;
        }
        LocateDistrictRequest locateDistrictRequest = (LocateDistrictRequest) obj;
        return o.LJ(this.encryptedLongitude, locateDistrictRequest.encryptedLongitude) && o.LJ(this.encryptedLatitude, locateDistrictRequest.encryptedLatitude);
    }

    public final int hashCode() {
        String str = this.encryptedLongitude;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.encryptedLatitude;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.encryptedLongitude);
        out.writeString(this.encryptedLatitude);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocateDistrictRequest(encryptedLongitude=");
        LIZ.append(this.encryptedLongitude);
        LIZ.append(", encryptedLatitude=");
        return q.LIZIZ(LIZ, this.encryptedLatitude, ')', LIZ);
    }

    public LocateDistrictRequest(String str, String str2) {
        this.encryptedLongitude = str;
        this.encryptedLatitude = str2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27195Alr;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TrackParams implements Parcelable {
    public static final Parcelable.Creator<TrackParams> CREATOR = new C27195Alr();

    @InterfaceC65349Pkn("address_result")
    public final String addressResult;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackParams) && o.LJ(this.addressResult, ((TrackParams) obj).addressResult);
    }

    public final int hashCode() {
        String str = this.addressResult;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.addressResult);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackParams(addressResult=");
        return q.LIZIZ(LIZ, this.addressResult, ')', LIZ);
    }

    public TrackParams(String str) {
        this.addressResult = str;
    }
}

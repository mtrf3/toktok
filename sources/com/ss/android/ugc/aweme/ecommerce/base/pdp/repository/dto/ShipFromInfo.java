package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27134Aks;
import X.C27144Al2;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShipFromInfo implements Parcelable {

    @InterfaceC65349Pkn("from_overseas")
    public final String fromOverseas;
    public static final C27144Al2 Companion = new C27144Al2();
    public static final Parcelable.Creator<ShipFromInfo> CREATOR = new C27134Aks();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShipFromInfo) && o.LJ(this.fromOverseas, ((ShipFromInfo) obj).fromOverseas);
    }

    public final int hashCode() {
        String str = this.fromOverseas;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.fromOverseas);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShipFromInfo(fromOverseas=");
        return q.LIZIZ(LIZ, this.fromOverseas, ')', LIZ);
    }

    public ShipFromInfo(String str) {
        this.fromOverseas = str;
    }
}

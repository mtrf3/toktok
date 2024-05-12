package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27220AmG;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressLocation implements Parcelable {
    public static final Parcelable.Creator<AddressLocation> CREATOR = new C27220AmG();

    @InterfaceC65349Pkn("address_map_schema")
    public final String addressMapSchema;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressLocation) && o.LJ(this.addressMapSchema, ((AddressLocation) obj).addressMapSchema);
    }

    public final int hashCode() {
        String str = this.addressMapSchema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.addressMapSchema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressLocation(addressMapSchema=");
        return q.LIZIZ(LIZ, this.addressMapSchema, ')', LIZ);
    }

    public AddressLocation(String str) {
        this.addressMapSchema = str;
    }
}

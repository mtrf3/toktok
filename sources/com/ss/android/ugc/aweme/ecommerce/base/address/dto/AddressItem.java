package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27004Aim;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressItem implements Parcelable {
    public static final Parcelable.Creator<AddressItem> CREATOR = new C27004Aim();

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("value")
    public final String value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) obj;
        return o.LJ(this.key, addressItem.key) && o.LJ(this.value, addressItem.value);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.key);
        out.writeString(this.value);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressItem(key=");
        LIZ.append(this.key);
        LIZ.append(", value=");
        return q.LIZIZ(LIZ, this.value, ')', LIZ);
    }

    public AddressItem(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}

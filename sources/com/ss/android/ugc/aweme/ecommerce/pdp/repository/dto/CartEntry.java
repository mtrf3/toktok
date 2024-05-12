package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RVR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CartEntry implements Parcelable {
    public static final Parcelable.Creator<CartEntry> CREATOR = new RVR();

    @InterfaceC65349Pkn("item_count")
    public final Integer itemCount;

    @InterfaceC65349Pkn("link")
    public final String link;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartEntry)) {
            return false;
        }
        CartEntry cartEntry = (CartEntry) obj;
        return o.LJ(this.link, cartEntry.link) && o.LJ(this.itemCount, cartEntry.itemCount);
    }

    public final int hashCode() {
        String str = this.link;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.link);
        Integer num = this.itemCount;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CartEntry(link=");
        LIZ.append(this.link);
        LIZ.append(", itemCount=");
        return s0.LIZJ(LIZ, this.itemCount, ')', LIZ);
    }

    public CartEntry(String str, Integer num) {
        this.link = str;
        this.itemCount = num;
    }
}

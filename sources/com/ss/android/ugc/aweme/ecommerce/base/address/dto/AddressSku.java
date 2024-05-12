package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C26757Aen;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressSku implements Parcelable {
    public static final Parcelable.Creator<AddressSku> CREATOR = new C26757Aen();

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressSku) && o.LJ(this.productId, ((AddressSku) obj).productId);
    }

    public final int hashCode() {
        String str = this.productId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productId);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressSku(productId=");
        return q.LIZIZ(LIZ, this.productId, ')', LIZ);
    }

    public AddressSku(String str) {
        this.productId = str;
    }
}

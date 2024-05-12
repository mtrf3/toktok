package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C27732AuW;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescBizExtra implements Parcelable {
    public static final Parcelable.Creator<ProductDescBizExtra> CREATOR = new C27732AuW();

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductDescBizExtra) && o.LJ(this.extra, ((ProductDescBizExtra) obj).extra);
    }

    public final int hashCode() {
        String str = this.extra;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.extra);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductDescBizExtra(extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public ProductDescBizExtra(String str) {
        this.extra = str;
    }
}

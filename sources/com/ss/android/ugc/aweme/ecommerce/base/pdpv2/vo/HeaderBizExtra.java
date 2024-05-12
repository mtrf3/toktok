package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.ETY;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HeaderBizExtra implements Parcelable {
    public static final Parcelable.Creator<HeaderBizExtra> CREATOR = new ETY();
    public final String extra;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeaderBizExtra) && o.LJ(this.extra, ((HeaderBizExtra) obj).extra);
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
        LIZ.append("HeaderBizExtra(extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public HeaderBizExtra(String str) {
        this.extra = str;
    }
}

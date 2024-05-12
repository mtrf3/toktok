package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C27731AuV;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticBizExtra implements Parcelable {
    public static final Parcelable.Creator<LogisticBizExtra> CREATOR = new C27731AuV();

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
        return (obj instanceof LogisticBizExtra) && o.LJ(this.extra, ((LogisticBizExtra) obj).extra);
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
        LIZ.append("LogisticBizExtra(extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public LogisticBizExtra(String str) {
        this.extra = str;
    }
}

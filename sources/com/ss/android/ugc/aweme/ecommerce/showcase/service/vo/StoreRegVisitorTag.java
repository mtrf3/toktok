package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C64473PSb;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class StoreRegVisitorTag implements Parcelable {
    public static final Parcelable.Creator<StoreRegVisitorTag> CREATOR = new C64473PSb();

    @InterfaceC65349Pkn("fmt_visitor_count")
    public final String fmt_visitor_count;

    @InterfaceC65349Pkn("visitor_count")
    public final Integer visitor_count;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreRegVisitorTag)) {
            return false;
        }
        StoreRegVisitorTag storeRegVisitorTag = (StoreRegVisitorTag) obj;
        return o.LJ(this.visitor_count, storeRegVisitorTag.visitor_count) && o.LJ(this.fmt_visitor_count, storeRegVisitorTag.fmt_visitor_count);
    }

    public final int hashCode() {
        Integer num = this.visitor_count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fmt_visitor_count;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.visitor_count;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.fmt_visitor_count);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreRegVisitorTag(visitor_count=");
        LIZ.append(this.visitor_count);
        LIZ.append(", fmt_visitor_count=");
        return q.LIZIZ(LIZ, this.fmt_visitor_count, ')', LIZ);
    }

    public StoreRegVisitorTag(Integer num, String str) {
        this.visitor_count = num;
        this.fmt_visitor_count = str;
    }
}

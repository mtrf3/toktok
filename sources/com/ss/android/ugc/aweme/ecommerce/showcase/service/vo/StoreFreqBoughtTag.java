package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C64472PSa;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class StoreFreqBoughtTag implements Parcelable {
    public static final Parcelable.Creator<StoreFreqBoughtTag> CREATOR = new C64472PSa();

    @InterfaceC65349Pkn("customer_count")
    public final Integer customer_count;

    @InterfaceC65349Pkn("fmt_customer_count")
    public final String fmt_customer_count;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreFreqBoughtTag)) {
            return false;
        }
        StoreFreqBoughtTag storeFreqBoughtTag = (StoreFreqBoughtTag) obj;
        return o.LJ(this.customer_count, storeFreqBoughtTag.customer_count) && o.LJ(this.fmt_customer_count, storeFreqBoughtTag.fmt_customer_count);
    }

    public final int hashCode() {
        Integer num = this.customer_count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fmt_customer_count;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.customer_count;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.fmt_customer_count);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreFreqBoughtTag(customer_count=");
        LIZ.append(this.customer_count);
        LIZ.append(", fmt_customer_count=");
        return q.LIZIZ(LIZ, this.fmt_customer_count, ')', LIZ);
    }

    public StoreFreqBoughtTag(Integer num, String str) {
        this.customer_count = num;
        this.fmt_customer_count = str;
    }
}

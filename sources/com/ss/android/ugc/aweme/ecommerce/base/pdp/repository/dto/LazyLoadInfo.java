package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69680RWi;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LazyLoadInfo implements Parcelable {
    public static final Parcelable.Creator<LazyLoadInfo> CREATOR = new C69680RWi();

    @InterfaceC65349Pkn("buy_together_brief")
    public final BuyTogether buyTogether;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLoadInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LazyLoadInfo) && o.LJ(this.buyTogether, ((LazyLoadInfo) obj).buyTogether);
    }

    public final int hashCode() {
        BuyTogether buyTogether = this.buyTogether;
        if (buyTogether == null) {
            return 0;
        }
        return buyTogether.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LazyLoadInfo(buyTogether=");
        LIZ.append(this.buyTogether);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        BuyTogether buyTogether = this.buyTogether;
        if (buyTogether == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            buyTogether.writeToParcel(out, i);
        }
    }

    public LazyLoadInfo(BuyTogether buyTogether) {
        this.buyTogether = buyTogether;
    }

    public /* synthetic */ LazyLoadInfo(BuyTogether buyTogether, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : buyTogether);
    }
}

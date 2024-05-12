package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.InterfaceC65349Pkn;
import X.RTK;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SellerInfoBizExtra implements Parcelable {
    public static final Parcelable.Creator<SellerInfoBizExtra> CREATOR = new RTK();

    @InterfaceC65349Pkn("shop_id")
    public final String shopId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SellerInfoBizExtra) && o.LJ(this.shopId, ((SellerInfoBizExtra) obj).shopId);
    }

    public final int hashCode() {
        String str = this.shopId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.shopId);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerInfoBizExtra(shopId=");
        return q.LIZIZ(LIZ, this.shopId, ')', LIZ);
    }

    public SellerInfoBizExtra(String str) {
        this.shopId = str;
    }
}

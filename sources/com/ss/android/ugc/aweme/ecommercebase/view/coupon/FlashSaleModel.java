package com.ss.android.ugc.aweme.ecommercebase.view.coupon;

import X.C61748OLg;
import X.C61749OLh;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FlashSaleModel implements Parcelable {

    @InterfaceC65349Pkn("countdown")
    public final String countdown;
    public static final C61749OLh Companion = new C61749OLh();
    public static final Parcelable.Creator<FlashSaleModel> CREATOR = new C61748OLg();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlashSaleModel) && o.LJ(this.countdown, ((FlashSaleModel) obj).countdown);
    }

    public final int hashCode() {
        String str = this.countdown;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.countdown);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlashSaleModel(countdown=");
        return q.LIZIZ(LIZ, this.countdown, ')', LIZ);
    }

    public FlashSaleModel(String str) {
        this.countdown = str;
    }
}

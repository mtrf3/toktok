package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27123Akh;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticDiscountView implements Parcelable {
    public static final Parcelable.Creator<LogisticDiscountView> CREATOR = new C27123Akh();

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogisticDiscountView) && o.LJ(this.discountText, ((LogisticDiscountView) obj).discountText);
    }

    public final int hashCode() {
        String str = this.discountText;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.discountText);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticDiscountView(discountText=");
        return q.LIZIZ(LIZ, this.discountText, ')', LIZ);
    }

    public LogisticDiscountView(String str) {
        this.discountText = str;
    }
}

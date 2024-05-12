package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.RVJ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Amount implements Parcelable {
    public static final Parcelable.Creator<Amount> CREATOR = new RVJ();

    @InterfaceC65349Pkn("amount")
    public final String amount;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("price_str")
    public final String priceStr;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return o.LJ(this.currency, amount.currency) && o.LJ(this.amount, amount.amount) && o.LJ(this.priceStr, amount.priceStr);
    }

    public final int hashCode() {
        String str = this.currency;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priceStr;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.currency);
        out.writeString(this.amount);
        out.writeString(this.priceStr);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Amount(currency=");
        LIZ.append(this.currency);
        LIZ.append(", amount=");
        LIZ.append(this.amount);
        LIZ.append(", priceStr=");
        return q.LIZIZ(LIZ, this.priceStr, ')', LIZ);
    }

    public Amount(String str, String str2, String str3) {
        this.currency = str;
        this.amount = str2;
        this.priceStr = str3;
    }
}

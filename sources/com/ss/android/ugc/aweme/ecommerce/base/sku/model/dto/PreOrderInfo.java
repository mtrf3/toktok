package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C27485AqX;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PreOrderInfo implements Parcelable {
    public static final Parcelable.Creator<PreOrderInfo> CREATOR = new C27485AqX();

    @InterfaceC65349Pkn("shipping_days")
    public final Integer shippingDays;

    @InterfaceC65349Pkn("shipping_text")
    public final String shippingText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreOrderInfo)) {
            return false;
        }
        PreOrderInfo preOrderInfo = (PreOrderInfo) obj;
        return o.LJ(this.shippingText, preOrderInfo.shippingText) && o.LJ(this.shippingDays, preOrderInfo.shippingDays);
    }

    public final int hashCode() {
        String str = this.shippingText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.shippingDays;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.shippingText);
        Integer num = this.shippingDays;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreOrderInfo(shippingText=");
        LIZ.append(this.shippingText);
        LIZ.append(", shippingDays=");
        return s0.LIZJ(LIZ, this.shippingDays, ')', LIZ);
    }

    public PreOrderInfo(String str, Integer num) {
        this.shippingText = str;
        this.shippingDays = num;
    }
}

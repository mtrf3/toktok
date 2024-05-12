package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27153AlB;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PDPShippingModuleMeta implements Parcelable {
    public static final Parcelable.Creator<PDPShippingModuleMeta> CREATOR = new C27153AlB();

    @InterfaceC65349Pkn("delivery_flag")
    public final String deliveryFlag;

    @InterfaceC65349Pkn("delivery_info")
    public final String deliveryInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPShippingModuleMeta)) {
            return false;
        }
        PDPShippingModuleMeta pDPShippingModuleMeta = (PDPShippingModuleMeta) obj;
        return o.LJ(this.deliveryInfo, pDPShippingModuleMeta.deliveryInfo) && o.LJ(this.deliveryFlag, pDPShippingModuleMeta.deliveryFlag);
    }

    public final int hashCode() {
        String str = this.deliveryInfo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deliveryFlag;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.deliveryInfo);
        out.writeString(this.deliveryFlag);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PDPShippingModuleMeta(deliveryInfo=");
        LIZ.append(this.deliveryInfo);
        LIZ.append(", deliveryFlag=");
        return q.LIZIZ(LIZ, this.deliveryFlag, ')', LIZ);
    }

    public PDPShippingModuleMeta(String str, String str2) {
        this.deliveryInfo = str;
        this.deliveryFlag = str2;
    }
}

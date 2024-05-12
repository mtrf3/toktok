package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RXC;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommonData implements Parcelable {
    public static final Parcelable.Creator<CommonData> CREATOR = new RXC();

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("status")
    public final String status;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonData)) {
            return false;
        }
        CommonData commonData = (CommonData) obj;
        return o.LJ(this.productId, commonData.productId) && o.LJ(this.status, commonData.status);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productId);
        out.writeString(this.status);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonData(productId=");
        LIZ.append(this.productId);
        LIZ.append(", status=");
        return q.LIZIZ(LIZ, this.status, ')', LIZ);
    }

    public CommonData(String str, String str2) {
        this.productId = str;
        this.status = str2;
    }
}

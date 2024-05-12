package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27152AlA;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PDPLogisticMeta implements Parcelable {
    public static final Parcelable.Creator<PDPLogisticMeta> CREATOR = new C27152AlA();

    @InterfaceC65349Pkn("pdp_to_logistic_list_info")
    public final String pdpToLogisticListInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PDPLogisticMeta() {
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
        return (obj instanceof PDPLogisticMeta) && o.LJ(this.pdpToLogisticListInfo, ((PDPLogisticMeta) obj).pdpToLogisticListInfo);
    }

    public final int hashCode() {
        String str = this.pdpToLogisticListInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.pdpToLogisticListInfo);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PDPLogisticMeta(pdpToLogisticListInfo=");
        return q.LIZIZ(LIZ, this.pdpToLogisticListInfo, ')', LIZ);
    }

    public PDPLogisticMeta(String str) {
        this.pdpToLogisticListInfo = str;
    }

    public /* synthetic */ PDPLogisticMeta(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

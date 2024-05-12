package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RVM;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpPaymentModule implements Parcelable {
    public static final Parcelable.Creator<PdpPaymentModule> CREATOR = new RVM();

    @InterfaceC65349Pkn("bnpl_info")
    public final BnplInfo bnplInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpPaymentModule() {
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
        return (obj instanceof PdpPaymentModule) && o.LJ(this.bnplInfo, ((PdpPaymentModule) obj).bnplInfo);
    }

    public final int hashCode() {
        BnplInfo bnplInfo = this.bnplInfo;
        if (bnplInfo == null) {
            return 0;
        }
        return bnplInfo.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpPaymentModule(bnplInfo=");
        LIZ.append(this.bnplInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        BnplInfo bnplInfo = this.bnplInfo;
        if (bnplInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bnplInfo.writeToParcel(out, i);
        }
    }

    public PdpPaymentModule(BnplInfo bnplInfo) {
        this.bnplInfo = bnplInfo;
    }

    public /* synthetic */ PdpPaymentModule(BnplInfo bnplInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bnplInfo);
    }
}

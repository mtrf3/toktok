package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RXJ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpResponse implements Parcelable {
    public static final Parcelable.Creator<PdpResponse> CREATOR = new RXJ();

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("data")
    public final PdpInfoData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpResponse)) {
            return false;
        }
        PdpResponse pdpResponse = (PdpResponse) obj;
        return o.LJ(this.code, pdpResponse.code) && o.LJ(this.message, pdpResponse.message) && o.LJ(this.data, pdpResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PdpInfoData pdpInfoData = this.data;
        return hashCode2 + (pdpInfoData != null ? pdpInfoData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.code;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.message);
        PdpInfoData pdpInfoData = this.data;
        if (pdpInfoData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pdpInfoData.writeToParcel(out, i);
        }
    }

    public PdpResponse(Integer num, String str, PdpInfoData pdpInfoData) {
        this.code = num;
        this.message = str;
        this.data = pdpInfoData;
    }

    public /* synthetic */ PdpResponse(Integer num, String str, PdpInfoData pdpInfoData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : pdpInfoData);
    }
}
